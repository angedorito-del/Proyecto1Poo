package Zoologico;
public abstract class Animal {

    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public abstract void hacerSonido();

    public String toString() {
        return nombre + " (" + edad + " años)";
    }
}