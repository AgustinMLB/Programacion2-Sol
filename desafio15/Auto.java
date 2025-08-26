import java.util.Random;

public class Auto extends Vehiculo {
    public Auto(String nombre) {
        super(nombre);
    }

    @Override
    public void avanzar() {
        Random rand = new Random();
        int distancia = rand.nextInt(11) + 10; // Avanza entre 10 y 20
        distanciaRecorrida += distancia;
        System.out.println(nombre + " (Auto) avanza " + distancia + " metros.");
    }
}
