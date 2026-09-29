package EmpleadosPack;

public abstract class Empleado{
    public double SueldoTotal=0;
    protected String Nombre;
    protected double SueldoBase;

    public Empleado(String Nombre,double SueldoBase){
        this.Nombre=Nombre;
        this.SueldoBase=SueldoBase;
    }

    public abstract void CalcularSueldo();
}
