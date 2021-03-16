import java.util.concurrent.Semaphore;

public class Aeropuerto {

    private static final Semaphore semaforo = new Semaphore(1, false);

    public static void llegada(Aviones Aviones) {
        try {

                semaforo.acquire();
                System.out.println("El " + Aviones.getName() + " Aterriza");
            int llegada = (int) (Math.random()*(5000));
                Terminal.descargar(Aviones);
            semaforo.release();
            Thread.sleep(llegada);


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

