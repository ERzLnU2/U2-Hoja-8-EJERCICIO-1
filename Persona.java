/**
 * @author Daw120
 */
package com.solomongo.ejercicio8;
public class Persona {
    
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
       private String clave;
    
       public Persona(){} 
    
     public Persona(String clave, String nombre, String apellido1, String apellido2, String dni){ 
     this.nombre=nombre;  
     this.apellido1=apellido1;
     this.apellido2=apellido2;
     this.dni=dni;
     }
   public void setNombre(String nombre) {
     this.nombre=nombre; 
    }
   public void setApellido1(String apellido1) {
     this.apellido1=apellido1; 
    }
   public void setApellido2(String apellido2) {
     this.apellido2=apellido2; 
    }
   public void setDni(String dni) {
         this.dni=dni; 
    }
   
   public String getNombre() {
        return nombre;
    }
   public String getApellido1() {
        return apellido1;
    }
   public String getApellido2() {
        return apellido2;
    }
   public String getDni() {
        return dni;
    }
   
   public void getClave() {
    }
  
   public boolean dniValido(){
       
        return false;
   }
    
  
  
  /* private String letraDni(){
   int miDni = Integer.parseInt(this.dni.substring(0,8));
   int resto =0;
   String miLetra =""; 
   String [] asignacionLetra = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
   resto=miDni%23;
   miLetra=asignacionLetra[resto];
   return miLetra;
   }/**/
  
  }  

