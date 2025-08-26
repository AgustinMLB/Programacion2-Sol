public class Main {
    public static void main(String[] args) {
        Vehiculo[] competidores = {
            new Auto("Relámpago"),
            new Moto("Furia"),
            new Auto("Trueno"),
            new Moto("Viento")
        };

        // Simular 5 rondas
        for (int ronda = 1; ronda <= 5; ronda++) {
            System.out.println("\n--- Ronda " + ronda + " ---");
            for (Vehiculo v : competidores) {
                v.avanzar();
            }
        }

        // Determinar ganador
        Vehiculo ganador = competidores[0];
        for (Vehiculo v : competidores) {
            if (v.getDistanciaRecorrida() > ganador.getDistanciaRecorrida()) {
                ganador = v;
            }
        }

        System.out.println("\nEl ganador es " + ganador.getNombre() +
                           " con " + ganador.getDistanciaRecorrida() + " metros recorridos.");
    }
}
