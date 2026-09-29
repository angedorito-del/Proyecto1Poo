package Figuras;

import java.util.Scanner;

public class Cuadrado extends FigurasGeometricas{
    public static double AreaTotalCuadrado=0;
    @Override
    public void CalcularArea() {
        AreaTotalCuadrado++;
        Scanner Scan =new Scanner(System.in);
        System.out.print("\n-----Calcular Area Del Cuadrado-----\n");
        System.out.print("       Ingresa un lado del cuadrado\n");
        double lado = Scan.nextDouble();Scan.nextLine();
        System.out.print("       Aqui esta el Area del cuadrado "+lado*4+"\n");
    }
}
