public class Krankenwagen extends Auto {

    private boolean blueLightOn;

    public Krankenwagen() {
        super();
        blueLightOn = false;
    }

    public void turnOnBlueLight() {
        blueLightOn = true;
        System.out.println("Blaulicht eingeschaltet.");
    }

    public void turnOffBlueLight() {
        blueLightOn = false;
        System.out.println("Blaulicht ausgeschaltet.");
    }

    public boolean isBlueLightOn() {

        return blueLightOn;
    }
}
