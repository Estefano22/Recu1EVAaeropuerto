public class Main {

    public static void main(String[] args) {
        Aeropuerto aeropuerto = new Aeropuerto();

        for (int i = 2; i < 7; i++) {
            Aviones o = new Aviones(aeropuerto);
            o.setName("Avion " + (i+1));
            o.start();

        }
    }
}
