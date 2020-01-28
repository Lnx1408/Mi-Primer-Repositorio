package mecanica;

public class MantenimientoCorrectivo extends Mantenimiento{
    private int Categoria;
    public MantenimientoCorrectivo(){}
    public MantenimientoCorrectivo(String Codigo, double Costo, int Categoria){
        super(Codigo, Costo);
        this.Categoria = Categoria;
    }
    public void setCategoria(int Categoria){
        this.Categoria=Categoria;
    }
    public int getCategoria(){
        return this.Categoria;
    }
    @Override
    public void ImprimirCosto(){
        if (Categoria == 1){
            Costo = 300;
        }
        if(Categoria == 2){
            Costo = 500;
        }
        System.out.println("El costo es: "+Costo);
    }
    public void ImprimirCosto(double ValorRepuesto){
        Costo = Costo + ValorRepuesto;
        System.out.println("El costo es: "+Costo);
    }
}
