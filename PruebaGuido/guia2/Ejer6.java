/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú.

El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import java.util.*;
import java.lang.String;

/**
 *
 * @author U86949
 */
public class Ejer6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner Leer = new Scanner(System.in);
        Scanner Leer2 = new Scanner(System.in);
        int num1, num2, opcion = 0;

        System.out.println("Ingrese un numero entero positivo");
        num1 = Leer.nextInt();
        System.out.println("Ingrese otro numero entero positivo");
        num2 = Leer.nextInt();

        String resp = "N";
        while (resp.equalsIgnoreCase("N")) {
            System.out.println("MENU \n 1. Sumar \n 2. Restar \n 3. Multiplicar \n 4. Dividir \n 5. Salir \n Elija una opcion");
            opcion = Leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Suma " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resta " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Multi " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Divi " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("Quiere Salir? S/N");
                    resp = Leer2.nextLine();
                    continue;
                default:
                    System.out.println("Debe elegir una opcion correcta ");
                    break;
            }

        }
    }
}