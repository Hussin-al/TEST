public class Fahrzeug {
    public double postion;
    public double speed;
    public int maxSpeed;
    public int wheels;


    public Fahrzeug() {
        this.postion = 0;
        this.speed = 0;
        this.maxSpeed = 0;
        this.wheels = 0;

    }

    public void move(double minutes) {
        if (speed != 0) {
            double space = speed * minutes / 60;
            postion += space;
            System.out.println("Der Fahrzeug hat sich in " + space + "KM bewegt");
        } else {
            System.out.println("Der Fahrzeug bewegt nicht");
        }

    }

    public void changeSpeed(double latestSpeed) {
        if (latestSpeed <= maxSpeed) {
            speed = latestSpeed;
            System.out.println("Geschwindigkeit auf " + latestSpeed + "Kn/h geändert");
        } else {
            System.out.println("Geschwindigkeit kann Maximalgeschwindigkeit nicht überschreiten.");

        }
    }


    public int getMaxSpeed() {

        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {

        this.maxSpeed = maxSpeed;
    }

}
