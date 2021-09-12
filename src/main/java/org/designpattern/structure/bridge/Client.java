package org.designpattern.structure.bridge;

public class Client {

    public static void main(String[] args) {
        Device tv = new Tv();
        RemoteControl remoteControl = new RemoteControl(tv);
        remoteControl.togglePower();

        Radio radio = new Radio();
        remoteControl = new AdvancedRemoteControl(radio);
        ((AdvancedRemoteControl)remoteControl).mute();
    }
}
