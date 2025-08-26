import java.util.Random;

public class Moto extends Vehiculo {
    public Moto(String nombre) {
        super(nombre);
    }

    @Override
    public void avanzar() {
        Random rand = new Random();
        int distancia = rand.nextInt(16) + 5; // Avanza entre 5 y 20
        distanciaRecorrida += distancia;
        System.out.println(nombre + " (Moto) avanza " + distancia + " metros.");
    }
}
