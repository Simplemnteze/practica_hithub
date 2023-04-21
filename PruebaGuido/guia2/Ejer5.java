/*
Escriba un programa en el cual se ingrese un valor límite positivo, 
y a continuación solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.

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
public class Ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer =new Scanner(System.in);
        int num, limite, suma=0;
        System.out.println("Ingrese un numero entero como limite");    
        limite=Leer.nextInt();
        do
         {
            System.out.println("Ingrese un numero para sumar");
            num=Leer.nextInt();
        suma=suma+num;
        System.out.println("Suma es " + suma + " el limite es " + limite);
        } 
        while (suma<limite);
    }
    
}
