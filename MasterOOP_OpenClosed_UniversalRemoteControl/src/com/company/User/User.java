package com.company.User;

import com.company.Television;
import com.company.SoundBar;
import com.company.RemoteControl;

public class User {

    public static void main(String[] args) {

        //Devices in the home

        Television myTV = new Television();
        SoundBar mySoundBar = new SoundBar();

        //Remote for the user

        RemoteControl myRemote = RemoteControl.getInstance();

        myRemote.connect(myTV);
        myRemote.onButton(); //activates all the methods within Television powerOn

        myRemote.connect(mySoundBar);
        myRemote.onButton(); //activates all the methods within SoundBar powerOn

        myRemote.connect(myTV);
        myRemote.offButton(); //deactivatign tv methods and fields

        myRemote.connect(mySoundBar);
        myRemote.offButton(); //deactivating soundBar methods and fields



    }
}
