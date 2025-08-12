public class Guerrero extends Personaje {
    public Guerrero (String nombre, int nivel){
        super(nombre, nivel);
    }

    @Override
    public String accionEspecial(){
        return "Soy el guerrero " + getNombre() + " con nivel "+ getNivel();
    }
}
