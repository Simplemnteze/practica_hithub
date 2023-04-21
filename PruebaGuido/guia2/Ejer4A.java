/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;
import java.util.*;//AGREGAR TODAS LAS UTILERIAS 
import java.lang.*;//Agregar Todas
/**
 *
 * @author U86949
 */
public class Ejer4A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //4.	Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
        //La fórmula correspondiente es: F = 32 + (9 * C / 5).
        Scanner leer = new Scanner(System.in);
        double num1;
        System.out.println("Ingrese una temperatura en Centigrados");  
        num1=leer.nextDouble();
        num1=32+(9*num1/5);
        System.out.println("La temperatura en Farenheit es " +num1);              
    }
}
