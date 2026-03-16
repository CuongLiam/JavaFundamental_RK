package ep4;

public class ep4 {
    interface RemoteControl {
        void powerOn();

        default void checkBattery() {
            System.out.println("Pin on dinh!");
        }
    }

    public static void ep4Main() {
        RemoteControl smartLight = () -> {
            System.out.println("Den da bat!");
        };

        smartLight.powerOn();
        smartLight.checkBattery();
    }
}
