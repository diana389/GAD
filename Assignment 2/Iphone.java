package Assignment2;

import java.awt.*;

abstract public class Iphone extends Phone{

    public Iphone(int batteryLife) {
        super(batteryLife);
    }

    public Iphone(int batteryLife, Color color, String material, String imei) {
        super(batteryLife, color, material, imei);
    }
}
