/*
8Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;
import java.util.*;

/**
 *
 * @author U86949
 */
public class Ejer8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        int lado;
        
        System.out.println("Ingrese el tamaño del lado");    
        lado=Leer.nextInt();
        for (int i=1; i<=lado; i++){
            for (int j=1; j<=lado; j++) {
                if (i==1||i==lado||j==1||j==lado){
                System.out.print(" X "); 
                } else {
                        System.out.print(" # "); 
                        }
                }
            System.out.print("\n");
            }
        System.out.print("\n");
        }
    }
    
  
