package me.pycode.learn._6.Household;

public class RemoteControltest {
    public static void main(String[] args) {
        SimpleRemoteControl control = new SimpleRemoteControl();
        control.setCommand(new LightOnCommand(new Light()));
        control.buttonWasPressed();
    }
}
