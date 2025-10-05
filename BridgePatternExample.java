public class BridgePatternExample {
    public static void main(String[] args) {
        // Use TV with Basic Remote
        Device tv = new TV();
        RemoteControl basicRemote = new BasicRemote(tv);

        basicRemote.turnOn();
        basicRemote.setVolume(20);
        basicRemote.turnOff();

        System.out.println("\n---");

        // Use Radio with Advanced Remote
        Device radio = new Radio();
        RemoteControl advancedRemote = new AdvancedRemote(radio);

        advancedRemote.turnOn();
        advancedRemote.setVolume(15);
        ((AdvancedRemote) advancedRemote).mute();
        advancedRemote.turnOff();
    }
}