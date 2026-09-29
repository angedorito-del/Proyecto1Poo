package EmpleadosPack;

public class Gerente extends Empleado{
    public Gerente(String Nombre,double SueldoBase){
        super(Nombre,SueldoBase);
    }
    @Override
    public void CalcularSueldo() {
        SueldoTotal=(SueldoBase*.01)+SueldoBase;
        System.out.print("El sueldo base del Gerente "+Nombre+" es de "+SueldoBase+" \n Y su Bono es de:"+SueldoBase*0.01+" Mensuales"+"\n\n");
    }
}