// Clase principal
public class Main {
    public static void main(String[] args) {
        // Arreglo polimórfico
        VehiculoAereo[] vehiculos = {
            new Avion("Boeing 747"),
            new Helicoptero("Black Hawk"),
            new Avion("Airbus A320"),
            new Helicoptero("Apache AH-64")
        };

        // Mostrar orden de despegue según posición
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.print((i + 1) + ". ");
            vehiculos[i].despegar();
        }
    }
}
