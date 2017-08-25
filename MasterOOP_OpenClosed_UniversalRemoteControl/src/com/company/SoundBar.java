package com.company;

public class SoundBar implements HomeEntertainmentDevice {
    int volume = 0;
    int bass = 0;

    public SoundBar() {
        volume = 7;
        bass = 3;
    }

    @Override
    public void powerOn() {
        System.out.println("Sound bar is powering on...");
        volumeUp();
        bassUp();
        System.out.println("Sound bar volume: " + volume);
        System.out.println("Sound bar bass: " + bass);
    }

    @Override
    public void powerOff() {
        volumeDown();
        bassDown();
        System.out.println("Sound bar volume: " + volume);
        System.out.println("Sound bar bass: " + bass);
        System.out.println("Sound bar is powering off...");
    }

    private void volumeUp(){
        volume += 5;
    }

    private void volumeDown(){
        volume -= 5;
    }

    private void bassUp(){
        bass += 2;
    }

    private void bassDown(){
        bass -= 2;
    }
}
