import java.util.concurrent.Semaphore;

public class Terminal {
    private static final Semaphore semaphore2 = new Semaphore(2, true);

    public static void descargar(Aviones Aviones) {

        try {
            semaphore2.acquire();
            System.out.println("El " +Aviones.getName()+ " comienza a descargar");
            int descarga = (int) (Math.random()*(20000));
            Thread.sleep(descarga);
            System.out.println("El " + Aviones.getName() + " comienza a recargar");
            int recarga = (int) (Math.random()*(20000));
            Thread.sleep(recarga);
            semaphore2.release();

        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

    }
}
