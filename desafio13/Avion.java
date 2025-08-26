// Subclase Avion
class Avion extends VehiculoAereo {

    public Avion(String nombre) {
        super(nombre);
    }

    @Override
    public String despegar() {
        return (" está acelerando en la pista y despegando 🛫");
    }
}