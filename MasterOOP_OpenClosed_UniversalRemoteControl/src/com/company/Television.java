package com.company;

public class Television implements HomeEntertainmentDevice {

    private int tvChannel;

    public Television() {
        this.tvChannel = 5;
    }

    @Override
    public void powerOn() {
        System.out.println("TV is powering on...");
        changeChannel();
        accessMenu();
    }

    @Override
    public void powerOff() {
        System.out.println("TV is powering off...");
    }

    //TV specific

    private void changeChannel(){
        System.out.println("Changing tv channel...");
        tvChannel += 1;
        System.out.println("TV Channel: " + tvChannel);
    }

    private void accessMenu(){
        System.out.println("Accessing tv menu...");
    }
}
