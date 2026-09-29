package Zoologico;

public class Perro extends Animal implements Nadador {

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau!");
    }

    @Override
    public void nadar() {
        System.out.println(nombre + " está nadando.");
    }
}