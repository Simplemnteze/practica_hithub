/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto, 
sino mostrará un mensaje de Incorrecto. 
Nota: investigar la función equals() en Java.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author U86949
 */
public class Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer2 =new Scanner(System.in);
        String cadena;
        System.out.println("Ingrese una frase");    
        cadena = Leer2.nextLine();
        if (cadena.equals("eureka")) {
            System.out.println("La frase " + cadena  + " es igual a eureka");
        }
        else {
            System.out.println("La frase " + cadena + " no es correcta");
        }
    }   
}
