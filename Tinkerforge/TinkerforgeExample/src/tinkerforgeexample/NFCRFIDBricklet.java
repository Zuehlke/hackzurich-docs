package tinkerforgeexample;

import java.awt.Color;

import com.tinkerforge.*;

public class NFCRFIDBricklet {

    private final BrickletNFCRFID instance;
    private static final String UID = "utP";
    private short currentTagType = 0;
    private TinkerforgeDemo app;
    private String lastProcessedTagId;
    private boolean doNotDisturb = false;


    public NFCRFIDBricklet(TinkerforgeDemo app, IPConnection ipcon) {
        this.app = app;
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
                    String currentTagId = readTagId();
                    System.out.println("ctagid" + currentTagId);
                    if (!doNotDisturb && "47cc1f2794d80".equals(currentTagId)) {
                        app.moveServo(true, 1000);
                        app.blackOutLight();
                        app.getLight().setColor(Color.GREEN, 1000);
                    } else {
                        app.moveServo(false);
                        app.blackOutLight();
                        app.getLight().setColor(Color.RED, 1000);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        instance.requestTagID(BrickletNFCRFID.TAG_TYPE_TYPE2);


    }

    private String readTagId() throws TimeoutException, NotConnectedException {
        BrickletNFCRFID.TagID tagID = instance.getTagID();
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < tagID.tidLength; i++) {
            s.append(Integer.toHexString(tagID.tid[i]));
        }
        return s.toString();
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

    public void setDoNotDisturb(boolean doNotDisturb) {
        this.doNotDisturb = doNotDisturb;
    }
}
