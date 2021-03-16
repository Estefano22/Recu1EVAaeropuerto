public class Aviones  extends Thread{

    Aeropuerto Aeropuerto;

    public Aviones(Aeropuerto aeropuerto) {this.Aeropuerto = Aeropuerto;}
        public void run(){ Aeropuerto.llegada(this);
    }


}
