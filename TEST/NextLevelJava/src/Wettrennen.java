public class Wettrennen  extends Fahrzeug{

    public static void main(String[] args) {
        Fahrrad fahrrad = new Fahrrad();
        fahrrad.changeSpeed(20);
        Auto auto = new Auto();
        auto.changeSpeed(120);
        Rennwagen rennwagen = new Rennwagen();
        rennwagen.changeSpeed(200);
        Krankenwagen krankenwagen = new Krankenwagen();
        krankenwagen.changeSpeed(80);

    }

}
