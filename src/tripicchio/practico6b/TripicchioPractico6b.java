/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tripicchio.practico6b;

/**
 *
 * @author Gatito
 */
public class TripicchioPractico6b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Directorio dir = new Directorio();
        dir.agregarClientes();
        dir.mostrarclientes();
        System.out.println("----------------------------------");
        dir.agregarCliente("2665555555",new Cliente("26555555","Nombre55","Tri","SL","Colon"));

       if(dir.agregarCliente("2665555555",new Cliente("26555555","Nombre55","Tri","SL","Colon"))){
           System.out.println("Agregado ok");
       } else {
           System.out.println("No agregado");
        }

        System.out.println("Jugador: "+dir.buscarCliente("33333333"));
        System.out.println("-------------X CIUDAD=SL---------------------");
        dir.buscarClientes("SL");
        
        System.out.println("---------Borramos--------28888883-----------------");
        dir.borrarCliente("28888883");
        System.out.println("----------------- -----------------");
        dir.mostrarclientes();
        
        
        
    }
    
}
