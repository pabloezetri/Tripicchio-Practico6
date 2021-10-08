/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tripicchio.practico6b;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Gatito
 */
public class Directorio {
    
   public Map<String, Cliente> clientes;

 
   
    
    public Directorio() {
      clientes = new HashMap<>(); 
   }
    
   public void agregarClientes(){
          clientes.put("22222222", new Cliente("28888881","Pablo","Tri","VM","Colon"));
          clientes.put("33333333", new Cliente("28888882","Pablo","Tri","SL","Colon"));
          clientes.put("44444444", new Cliente("28888883","Pablo","Tri","VM","Colon"));//para borra despues
          clientes.put("55555555", new Cliente("28888884","Pablo","Tri","VM","Colon"));
          clientes.put("66666666", new Cliente("28888885","Pablo","Tri","SL","Colon"));
      
   
   }
   
   public void mostrarclientes(){
   
       Set <String> numeros = clientes.keySet();
       Iterator it = numeros.iterator();
       
       while(it.hasNext()){
           String numero = (String)it.next();
           Cliente cliente = clientes.get(numero);
           System.out.println(cliente);
       }
       
   }   
   
   /***********************************************************/
   
   
   public boolean agregarCliente(String telefono, Cliente cliente){
       if(clientes.containsKey(telefono)){
       return false;
       } else {
           
        clientes.put(telefono, cliente);
        return true;
       }
 
   }
   
   public Cliente buscarCliente(String telefono){
   Cliente cliente=null;
       if(clientes.containsKey(telefono)){
            cliente = clientes.get(telefono);
       }
   return cliente;
   }   
   
   
    public void buscarClientes(String ciudad){
      Set <String> nums3 = clientes.keySet();
   
      Iterator it = nums3.iterator();
      
      while(it.hasNext()){
         String numero = (String)it.next();
         
         Cliente cliente = clientes.get(numero);
         if(cliente.getCiudad().equals(ciudad)){
         System.out.println("Cliente nro "+numero+" "+cliente);
         
         }
      }       
    }  
   
   
   
   public void borrarCliente(String dni){
       
           Set <String> nums3 = clientes.keySet();
   
      Iterator it = nums3.iterator();
      
      while(it.hasNext()){
         String numero = (String)it.next();
         
         Cliente borrar = null;
         
         Cliente cliente = clientes.get(numero);
         //if(cliente.getDni().equals(dni)){
         if(cliente.getDni().equals(dni)){
             it.remove();
         JOptionPane.showMessageDialog(null,"Borrado: "+dni);
         
         }else{
          JOptionPane.showMessageDialog(null,"no se encontro");
           }

   
 
 }
   }
   
         public String test(){
           return "Ok";
       }
    
    
    
}
