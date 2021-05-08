package com.company;

import java.util.Random;

public class Samsung extends SmartPhone implements Printable {
    private String displayType;

    public Samsung(int RAM, int ROM, float displaySize, String displayType) {
        super(RAM, ROM, displaySize);
        this.displayType = displayType;
    }

    public String getDisplayType() {
        return displayType;
    }

    public Samsung setDisplayType(String displayType) {
        this.displayType = displayType;
        return this;
    }

    private void lags() {
        Random random = new Random();
        if (random.nextInt(2) == 0) {
            System.out.println("Делаем для людей!");
        } else {
            System.out.println("ERROR " + random.nextInt(601));
        }
    }

    @Override
    public void print() {
        System.out.println("RAM: " + super.getRAM() + " ROM: " + super.getROM() + " Display Size " + super.getDisplaySize()
                + " Temp: " + " Display Type " + displayType);
        lags();
    }
}
