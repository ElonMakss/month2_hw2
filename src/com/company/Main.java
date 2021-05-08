package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Printable iphone = createPhone("Iphone");
        iphone.print();
        Printable samsung = createPhone("Samsung");
        samsung.print();
        Printable xiaomi = createPhone("Xiaomi");
        xiaomi.print();



    }

    public static Printable createPhone(String className) {
        Printable model = new Xiaomi(0,0,0, 0);;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter RAM");
        int RAM = scanner.nextInt();
        System.out.println("Enter ROM");
        int ROM = scanner.nextInt();
        System.out.println("Enter Display Size");
        int displaySize = scanner.nextInt();



        if (className == "Iphone") {
            System.out.println("Enter temp");
            int temp = scanner.nextInt();
            model = new Iphone(RAM, ROM, displaySize, temp);
        }else if(className == "Samsung"){
            System.out.println("Enter Display Type");
            String DT = scanner.next();
            model = new Samsung(RAM, ROM, displaySize, DT);
        }else if(className == "Xiaomi"){
            System.out.println("Enter numbers of cameras");
            int cameras = scanner.nextInt();
            model = new Xiaomi(RAM, ROM, displaySize, cameras);
        }
        return model;
    }

}

