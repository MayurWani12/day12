package com.command.fourty;
public class Main {
    public static void main(String[] args) {

        Light light = new Light();

                Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        
        RemoteControl remote = new RemoteControl();

   
        remote.setCommand(lightOn);
        remote.pressButton(); 

        // Turn the light off
        remote.setCommand(lightOff);
        remote.pressButton(); 
    }
}
