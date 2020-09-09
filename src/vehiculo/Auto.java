/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo;

/**
 *
 * @author SebastianR
 */

    //Punto 2
public class Auto {
    
    //Punto 8
    private String marca;
    private int modelo;
    private long kilometraje;
    
    
    
    //Punto 5
   public Auto (String marca , int modelo , long kilometraje){     
    this.marca = marca;
    this.modelo = modelo;
    this.kilometraje = kilometraje;
                                           }
   
   
    
    
    //Punto 8
    public void setmarca (String marca){
      this.marca = marca;    
         }
    public String getmarca(){
      return marca;
       }
    
    public void setmodelo(int modelo){
       this.modelo = modelo;
         }
    public int getmodelo(){
       return modelo;
       }
    
    public void setkilometraje(long kilometraje){
       this.kilometraje = kilometraje;
         }
    public long getkilometraje (){
     return kilometraje;
      }
    
            
    
      
    public void estadoAuto(long kilometraje){
    
    if ( kilometraje < 0){
          System.out.println( "Ingreso un numero negativo." );
          return;
    } else  this.kilometraje = kilometraje;
    
    if( kilometraje == 0){
           System.out.println( "El auto es 0KM" );    
            }
    else if( kilometraje <= 10000){
           System.out.println( "El auto tiene poco uso" );
            }
    else if( kilometraje <= 100000){
           System.out.println( "El auto tiene uso medio" );                
           }
    else if( kilometraje > 100000){
           System.out.println( "El auto esta bastante usado" );           
           }                   
     }
    
    
   public void mostrar (){
   
   System.out.println("La marca del auto es: " + marca);
    System.out.println("Es modelo: " + modelo);
     System.out.println("Su kilometraje es: " + kilometraje);
          } 

   
   
}
