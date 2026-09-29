package Figuras;
import java.lang.Math;

import java.util.Scanner;

public class Circulo extends FigurasGeometricas {
    public static double AreaTotalCirculo=0;
    @Override
    public void CalcularArea() {
        AreaTotalCirculo++;
        Scanner Scan =new Scanner(System.in);
        System.out.print("\n      Ingresa el radio del Circulo \n");
        double radio = Scan.nextDouble();Scan.nextLine();
        System.out.print("       Aqui esta el Area del Circulo "+radio*(Math.PI)+"\n");
    }
}
