package mecanica;

public abstract class Mantenimiento {
    protected String Codigo;
    protected double Costo;   
    public Mantenimiento(){}
    public Mantenimiento(String Codigo, double Costo){
        this.Codigo = Codigo;
        this.Costo = Costo;
    }
    public void setCodigo(String Codigo){
        this.Codigo=Codigo;
    }
    public void setCosto(double Costo){
        this.Costo = Costo;
    }
    public String getCodigo(){
    return this.Codigo;
    }
    public double getCosto(){
        return this.Costo;
    }
    public abstract void ImprimirCosto(); 
}