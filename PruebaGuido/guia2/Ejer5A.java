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
public class Ejer5A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //5.	Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
//Nota: investigar la función Math.sqrt().
Scanner leer = new Scanner(System.in);
        int num1;
        System.out.println("Ingrese un numero entero");  
        num1=leer.nextInt();
        System.out.println("El doble es " +num1*2);
        System.out.println("El triple es " +num1*3);
        System.out.println("La raiz cuadrada es " + Math.sqrt(num1) );
    }
    
}
