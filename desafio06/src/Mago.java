public class Mago extends Personaje {
    public Mago (String nombre, int nivel){
        super(nombre, nivel);
    }

    @Override
    public String accionEspecial(){
        return "Soy el mago " + getNombre();
    }
}
