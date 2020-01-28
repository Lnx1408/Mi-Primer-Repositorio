package mecanica;
public class Prueba {
        public static void main(String[] args) {
        Taller taller = new Taller ();
        /*        Mantenimiento ma = new Mantenimiento();  <<<------ No se puede crear objetos de una clase abstracta
        taller.Agregar(ma);         */
        Mantenimiento ma = new MantenimientoCorrectivo("001",50,1);
        taller.Agregar(ma);
        
        ma = new MantenimientoCorrectivo("002",50,2);
        double to = taller.TotalIngresos();
        taller.Agregar(ma);
         System.out.println("El total de ingresos es: "+to);     
         ma = new MantenimientoPreventivo("003",50,true);
         taller.Agregar(ma);
         // "ma" al ser una variable pulimorfica puede referencial a mas objetos de distinto tipo, ademas en este caso no 
         //se pierde la informacion que almacena "ma" ya que antes de ser midificada su referencia pasa al arraylist
         ma.ImprimirCosto();
         
         // ma.setCambioAceite;  <<<---------- no se puede usar setCambioAceite debudo a que es un atributo propio de MantenimientoPreventivo
         if (ma instanceof MantenimientoPreventivo){
             MantenimientoPreventivo mp = (MantenimientoPreventivo)ma;
             mp.setCambioAceite(true);           
                 taller.MostrarCambioAceite();
         }
    }
}
