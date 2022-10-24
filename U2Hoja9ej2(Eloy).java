/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package u2hoja8.u2hoja8ej1;

/**
 *
 * @author Eloy
 */
public class U2Hoja8ej1 {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Eloy", "Ruiz", "Linares", "72194827N");
        System.out.println("Persona1:" + persona1.clave());

        System.out.println("Persona1:" + persona1.dniValido());
    }
}
