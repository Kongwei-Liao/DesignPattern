package org.designpattern.structure.bridge;

public class AdvancedRemoteControl extends RemoteControl{

    public AdvancedRemoteControl(Radio radio) {
        super(radio);
    }

    public void mute() {
        device.setVolume(0);
    }
}
