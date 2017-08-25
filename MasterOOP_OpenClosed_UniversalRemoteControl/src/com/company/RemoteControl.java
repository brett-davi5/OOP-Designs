package com.company;

import com.company.HomeEntertainmentDevice;

public class RemoteControl {

    private HomeEntertainmentDevice alphaDevice = null;
    private static final RemoteControl INSTANCE = new RemoteControl();

    public static RemoteControl getInstance(){
        return INSTANCE;
    }

    public void connect(HomeEntertainmentDevice heDevice){
        this.alphaDevice = heDevice;
        System.out.println("Connecting to device: " + alphaDevice);
    }

    public void offButton(){
        alphaDevice.powerOff();
    }

    public void onButton(){
        alphaDevice.powerOn();
    }

}
