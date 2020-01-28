package mecanica;

public class MantenimientoPreventivo extends Mantenimiento{
    private boolean CambioAceite;
    public MantenimientoPreventivo(){
        this.CambioAceite = false;
    }
    public MantenimientoPreventivo(String Codigo, double Costo, boolean CambioAceite){
        super(Codigo, Costo);
        this.CambioAceite = CambioAceite;
        }
    public boolean getCambioAceite(){
        return this.CambioAceite;
    }
    public void setCambioAceite(boolean CambioAceite){
        this.CambioAceite = CambioAceite;
    }
    @Override
    public void ImprimirCosto(){
        if(this.CambioAceite){
            super.Costo+=20;
        }
        System.out.println("Costo de Mantenimiento Preventivo es de: "+super.Costo);
    }
}
