import EmpleadosPack.*;
import java.util.ArrayList;
import Zoologico.*;
import Figuras.*;
public class MenuProyecto {
    public static void main(String[] args) {

        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Firulais", 3));
        animales.add(new Gato("Michi", 2));
        animales.add(new Perro("Luna", 7));
        animales.add(new Pajaro("Ramon", 67));

        System.out.println("El zoológico tiene " + animales.size() + " animales:\n");

        for (Animal a : animales) {
            System.out.println(a);          // usa el toString de Animal
            a.comer();                    // heredado, igual para todos
            a.hacerSonido();              // polimorfismo: cada uno responde distinto

            // Solo si además sabe nadar
            if (a instanceof Nadador) {
                Nadador n = (Nadador) a;
                n.nadar();
            }
            if (a instanceof Volador) {
                Volador v = (Volador) a;
                v.volar();
            }
            System.out.println();
        }

        ArrayList<FigurasGeometricas> Figuras= new ArrayList<>();

        Figuras.add(new Circulo());
        Figuras.add(new Cuadrado());
        Figuras.add(new Cuadrado());
        Figuras.add(new Circulo());
        Figuras.add(new Circulo());


        System.out.print("\n-----Calcular Area Del Circulo-----\n");

        for (FigurasGeometricas f :Figuras ){
            f.CalcularArea();

        }
        System.out.print("ES area total de los Circulos es: "+Circulo.AreaTotalCirculo+"\n");
        System.out.print("ES area total de los Cuadrados es: "+Cuadrado.AreaTotalCuadrado+"\n\n\n\n");

        ArrayList<Empleado> Empleados = new ArrayList<>();
        Empleados.add(new Vendedor("Pukeko",2000));
        Empleados.add(new Vendedor("Aldair",1670));
        Empleados.add(new Gerente("Enrique",4000));
        Empleados.add(new Gerente("Charlie",6700));
        Empleados.add(new Gerente("Cony",   6767));



        double SueldoMasAlto=0;
        for (Empleado e : Empleados) {
            e.CalcularSueldo();
            if(SueldoMasAlto<e.SueldoTotal){
                SueldoMasAlto=e.SueldoTotal;
            }

        }
        System.out.print("El Sueldo mas alto es: "+SueldoMasAlto);
        }
}