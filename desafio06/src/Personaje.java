public abstract class Personaje {
    private String nombre;
    private int nivel;

    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    // Getters opcionales
    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public abstract String accionEspecial();

}
