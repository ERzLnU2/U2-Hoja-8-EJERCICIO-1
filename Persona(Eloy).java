/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u2hoja8.u2hoja8ej1;

/**
 *
 * @author Eloy
 */
public class Persona {

    private String nombre, apellido1, apellido2, dni;

    public Persona(String nombre, String apellido1, String apellido2, String dni) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
    }

    public String clave() {
        String passnombre = nombre.substring(0, 1);
        String passApellido1 = apellido1.substring(0, 3);

        int auxApellido = apellido2.length();
        int auxApellido2 = auxApellido - 1;
        String passApellido2 = apellido2.substring(auxApellido2, auxApellido);

        String pass1 = passnombre.concat(passApellido1);
        String pass = pass1.concat(passApellido2);
        return pass;
    }

    public boolean dniValido() {
        String numDni = dni.substring(0, 8);
        int numerosDni = numDni.length();
        boolean numDniB = numerosDni == 8;

        char letraDni = dni.charAt(8);
        int restoDni = Integer.parseInt(numDni) % 23;
        String cadena = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letraCorrecta = cadena.charAt(restoDni);

        boolean letrasIguales = letraCorrecta == letraDni;
        boolean dniValido = letrasIguales && numDniB;
        return dniValido;
    }
}
