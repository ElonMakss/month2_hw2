package com.company;

public class Iphone extends SmartPhone implements Printable{
    private int thermometer;


    public Iphone(int RAM, int ROM, float displaySize, int thermometer) {
        super(RAM, ROM, displaySize);
        this.thermometer = thermometer;
    }

    public int getThermometer() {
        return thermometer;
    }

    public Iphone setThermometer(int thermometer) {
        this.thermometer = thermometer;
        return this;
    }

    private void offInTheCold(){
        if (thermometer < -10){
            System.out.println("Батарея разряжена");
            System.out.println("Iphone выключается");
        }else{
            System.out.println("Оплатите подписку Icloud");
        }
    }

    @Override
    public void print() {
        System.out.println("RAM: " + super.getRAM() + " ROM: " + super.getROM() + " Display Size " + super.getDisplaySize()
                + " Temp: " + thermometer);
        offInTheCold();

    }
}
