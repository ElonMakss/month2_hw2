package com.company;

public class Xiaomi extends SmartPhone implements Printable{
    private  int numbersOfCameras;

    public Xiaomi(int RAM, int ROM, float displaySize, int numbersOfCameras) {
        super(RAM, ROM, displaySize);
        this.numbersOfCameras = numbersOfCameras;
    }

    public int getNumbersOfCameras(){
        return numbersOfCameras;
    }
    public void setNumbersOfCameras(int numbersOfCameras){
        this.numbersOfCameras = numbersOfCameras;
    }

    private void workingCameras(){
        System.out.println("Вы заплатили за " + numbersOfCameras + " камеры , но у вас работают " + numbersOfCameras/2);
    }
    @Override
    public void print() {
        System.out.println("RAM: " + super.getRAM() + " ROM: " + super.getROM() + " Display Size " + super.getDisplaySize()
                + " Temp: " + " Display Type " + " Numbers of cameras " + numbersOfCameras);
        workingCameras();
    }
}
