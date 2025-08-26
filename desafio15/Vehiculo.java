public abstract class Vehiculo {
    protected String nombre;
    protected int distanciaRecorrida;

    public Vehiculo(String nombre) {
        this.nombre = nombre;
        this.distanciaRecorrida = 0;
    }

    public abstract void avanzar();

    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public String getNombre() {
        return nombre;
    }
}
