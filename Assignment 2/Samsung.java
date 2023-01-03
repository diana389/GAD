package Assignment2;

import java.awt.*;

abstract public class Samsung extends Phone{
    public Samsung(int batteryLife) {
        super(batteryLife);
    }

    public Samsung(int batteryLife, Color color, String material, String imei) {
        super(batteryLife, color, material, imei);
    }
}
