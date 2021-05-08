package com.company;

import java.util.Random;

public class SmartPhone {
    private int RAM;
    private  int ROM;
    private float displaySize = 4.7f;

    public SmartPhone(int RAM, int ROM, float displaySize) {
        this.RAM = RAM;
        this.ROM = ROM;
        this.displaySize = displaySize;
    }

    public int getRAM() {
        return RAM;
    }

    public SmartPhone setRAM(int RAM) {
        this.RAM = RAM;
        return this;
    }

    public int getROM() {
        return ROM;
    }

    public SmartPhone setROM(int ROM) {
        this.ROM = ROM;
        return this;
    }

    public float getDisplaySize() {
        return displaySize;
    }

    public SmartPhone setDisplaySize(float displaySize) {
        this.displaySize = displaySize;
        return this;
    }

    public void toCall(String phoneNumber){
        System.out.println("Соединение с " + phoneNumber);
        System.out.println("Соединение установлено");
    }
}
