/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. 
Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
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
public class Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer =new Scanner(System.in);
        String cadena;
        System.out.println("Ingrese una frase o palabra");    
        cadena = Leer.nextLine();
        if (cadena.length()==8) {
            System.out.println("La frase es CORRECTA");
        }
        else {
            System.out.println("La frase es incorrecta");
        }
    }
    
}
