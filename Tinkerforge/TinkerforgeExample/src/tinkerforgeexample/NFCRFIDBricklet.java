package tinkerforgeexample;

import com.tinkerforge.*;

public class NFCRFIDBricklet {

    private final BrickletNFCRFID instance;
    private BrickletRGBLED rgbLedBricklet;
    private static final String UID = "utP";
    private short currentTagType = 0;


    public NFCRFIDBricklet(IPConnection config, BrickletRGBLED rgbLedBricklet) {
        this.instance = new BrickletNFCRFID(UID, config);
        this.rgbLedBricklet = rgbLedBricklet;
    }

    public void registerLogic() throws TimeoutException, NotConnectedException {
        this.instance.addStateChangedListener((state, idle) -> {
            try {
                if (idle) {
                    currentTagType = (short) ((currentTagType + 1) % 3);
                    instance.requestTagID(currentTagType);
                }

                if (state == BrickletNFCRFID.STATE_REQUEST_TAG_ID_READY) {
                    BrickletRGBLED.RGBValue rgbValue = rgbLedBricklet.getRGBValue();
                    StringBuilder s = readTagId();
                    if ("47cc1f2794d80".equals(s.toString())) {
                        rgbLedBricklet.setRGBValue((short) 0, (short) 255, (short) 0);
                    } else {
                        rgbLedBricklet.setRGBValue((short) 255, (short) 0, (short) 0);
                    }

                    Thread.sleep(2000);
                    rgbLedBricklet.setRGBValue(rgbValue.r, rgbValue.b, rgbValue.g);

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
