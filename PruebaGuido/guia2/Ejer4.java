/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la funcion Substring y equals() de Java.
http://w3api.com/Java/
Devuelve una subcadena, la cual corresponde al contenido entre los valores beginIndex y endIndex. 
En el caso de que no se especifique endIndex, se asumirá como índice el final de la cadena.
Sintaxis
public String substring(int beginIndex)
public String substring(int beginIndex, int endIndex)

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
public class Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer =new Scanner(System.in);
        String cadena;
        System.out.println("Ingrese una frase o palabra");    
        cadena = Leer.nextLine();
        if (cadena.substring(0,1).equals("A")) {
            System.out.println(cadena.substring(0,1));
            System.out.println(cadena.substring(1,2));
            System.out.println(cadena.substring(2,3));
            System.out.println("CORRECTA");
        }
        else {
            System.out.println(cadena.substring(0,1));
            System.out.println(cadena.substring(1,2));
            System.out.println(cadena.substring(2,3));
            System.out.println("Incorrecta");
        }
    }
    
}
