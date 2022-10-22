import static java.lang.System.out;
public class Ejercicio8 {
    public static void main(String[] args) {
     Persona data=new Persona(); 
 data.setNombre("gui");
 data.setApellido1("ller");
 data.setApellido2("mux");
 data.setDni("12345678E");
 System.out.print("\n\tData>> \n\t"); 
 System.out.print(data.getNombre()+" ,"); 
 System.out.print(data.getApellido1()+" "); 
 System.out.print(data.getApellido2()+".\n\tDNI: "); 
 System.out.println(data.getDni()+".\n\nVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV\n"); 
 String nameIN=data.getNombre();
 char name=nameIN.charAt(0);
 //System.out.println("El primer caracter del nombre es: "+name);
 String apeTres=data.getApellido1();
 String ape3=apeTres.substring(0,3);
 //System.out.println("Tres primeras letra del apellido1: "+ape3);
 //System.out.print("Ultima letra de apellido2: ");
 char ultima = data.getApellido2().charAt(data.getApellido2().length()-1);
 //System.out.println(ultima);
 System.out.print("\tClave>> "+name+ape3+ultima+".\n\n"); 
 System.out.println("VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV\n");
  
 
 
      
      
// NOTA: para calcular la letra se divide el número del dni entre 23 y el resto(%) obtenido 
// será la posición de la letra del dni en la siguiente cadena “TRWAGMYFPDXBNJZSQVHLCKE”
/* PROBANDO...*/ 
//comparar patrones (11.111.111-A)dniValido
String dni1="13576789E";
String dni2=data.getDni();
System.out.println("\tDni Valido?>> "+dni1.equals(dni2));
//System.out.println("dniValido: " + dni1==dni2); // 9 caracteres y letra.....
 

      

    } 
}

    
    
   
  
