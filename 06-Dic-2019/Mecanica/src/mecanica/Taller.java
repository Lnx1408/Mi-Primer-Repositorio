package mecanica;
import java.util.ArrayList;
public class Taller {
    private ArrayList<Mantenimiento> listaMan;
    public Taller(){
        listaMan = new ArrayList();
    }
    
    
    
    public void Agregar(Mantenimiento m){
        listaMan.add(m);
    }
    public double TotalIngresos(){
        double Total = 0;
        for (Mantenimiento man: listaMan){
            Total += man.getCosto();
        }
        return Total;
    }   
    public void MostrarCambioAceite(){
        for(Mantenimiento man: listaMan){
            if (man instanceof MantenimientoPreventivo){
                MantenimientoPreventivo mp = (MantenimientoPreventivo)man;
                if (mp.getCambioAceite()){
                    System.out.println("Mostrando datos: \nCodigo: "+mp.getCodigo()+"\nCosto: "+mp.getCosto()+"\nCambio de aceite: "+mp.getCambioAceite());
                }
            }
        }
    }
}
