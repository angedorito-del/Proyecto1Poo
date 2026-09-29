package EmpleadosPack;

public class Vendedor extends Empleado {

    public Vendedor(String Nombre,double SueldoBase){
        super(Nombre,SueldoBase);
    }
    @Override
    public void CalcularSueldo(){
        SueldoTotal=(SueldoBase*.05)+SueldoBase;
        System.out.print("El sueldo base del Vendedor "+Nombre+" es de "+SueldoBase+" \n Y su comision es de:"+SueldoBase*.05+"\n\n");
    }
}