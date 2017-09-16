package tinkerforgeexample;

import com.tinkerforge.*;

public class NFCRFIDBricklet {

    private final BrickletNFCRFID instance;
    private static final String UID = "utP";
    private short currentTagType = 0;
	private TinkerforgeDemo tinkerforgeDemo;


    public NFCRFIDBricklet(TinkerforgeDemo tinkerforgeDemo, IPConnection ipcon) {
        this.tinkerforgeDemo = tinkerforgeDemo;
		this.instance = new BrickletNFCRFID(UID, ipcon);
    }

    public void registerLogic() throws TimeoutException, NotConnectedException {
        this.instance.addStateChangedListener((state, idle) -> {
            try {
                if (idle) {
                    currentTagType = (short) ((currentTagType + 1) % 3);
                    instance.requestTagID(currentTagType);
                }

                if (state == BrickletNFCRFID.STATE_REQUEST_TAG_ID_READY) {
                    BrickletRGBLED.RGBValue rgbValue = tinkerforgeDemo.getLight().getRGBValue();
                    StringBuilder s = readTagId();
                    if ("47cc1f2794d80".equals(s.toString())) {
                    	tinkerforgeDemo.getLight().setRGBValue((short) 0, (short) 255, (short) 0);
                    } else {
                    	tinkerforgeDemo.getLight().setRGBValue((short) 255, (short) 0, (short) 0);
                    }

                    Thread.sleep(2000);
                    tinkerforgeDemo.getLight().setRGBValue(rgbValue.r, rgbValue.b, rgbValue.g);

                    System.out.println(s);
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });

        instance.requestTagID(BrickletNFCRFID.TAG_TYPE_TYPE2);


    }

    private StringBuilder readTagId() throws TimeoutException, NotConnectedException {
        BrickletNFCRFID.TagID tagID = instance.getTagID();
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < tagID.tidLength; i++) {
            s.append(Integer.toHexString(tagID.tid[i]));
        }
        return s;
    }

    public static void setTimeout(Runnable runnable, int delay) {
        new Thread(() -> {
            try {
                Thread.sleep(delay);
                runnable.run();
            } catch (Exception e) {
                System.err.println(e);
            }
        }).start();
    }
}
