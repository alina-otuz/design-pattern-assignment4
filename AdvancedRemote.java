// RefinedAbstraction: An advanced remote control with additional features
public class AdvancedRemote extends RemoteControl {

    public AdvancedRemote(Device device) {
        super(device);
    }

    @Override
    public void turnOn() {
        device.turnOn();
    }

    @Override
    public void turnOff() {
        device.turnOff();
    }

    @Override
    public void setVolume(int volume) {
        device.setVolume(volume);
    }

    // Additional functionality like mute
    public void mute() {
        System.out.println("Muting the device");
        device.setVolume(0);
    }
}