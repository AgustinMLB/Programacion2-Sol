public class Helicoptero extends VehiculoAereo {
    public Helicoptero(String nombre) {
        super(nombre);
    }

    @Override
    public String despegar() {
         return (" está encendiendo rotores y despegando 🚁");
    }
}