/**
 *  Desafio 6 –
 *  Crea una clase abstracta Personaje con atributos nombre y nivel. 
 *  Define un método abstracto accionEspecial(). 
 *  Implementa las clases Mago y Guerrero, cada una con su propia 
 *  versión de accionEspecial().
 * @since: 12 de agosto de 2025
 * @author: Domingo Perez
 */


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a Magos y Guerreros!");

        Personaje elPersonaje = new Guerrero("Pablo", 99);

        System.out.println(elPersonaje.accionEspecial());

    }
}
