/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import java.util.Scanner;//AGREGAR UTILERIA SCANNER

import java.util.*;//AGREGAR TODAS LAS UTILERIAS 
/**
 *
 * @author U86949
 */
public class Ejer3A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //  3.	Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
        //Nota: investigar la función toUpperCase() y toLowerCase() en Java.

        String frase;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese una Frase: ");
        frase = entrada.nextLine();
        frase = frase.toUpperCase();
        System.out.println("Frase Mayuscula: "+frase);
        System.out.println("Frase Minuscula: "+frase.toLowerCase());
    }
    
}
