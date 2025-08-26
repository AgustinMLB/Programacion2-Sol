 public abstract class VehiculoAereo {
    private  String nombre;

    public VehiculoAereo(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto
    public abstract String despegar();
}