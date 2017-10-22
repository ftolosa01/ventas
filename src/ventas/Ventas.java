/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

import java.util.Scanner;


/**
 *
 * @author dci
 */
public class Ventas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner intro = new Scanner(System.in);
        int vendedores;
        int dias,i,j;
        float suma;
        float promedio =0;
        System.out.println("ingrese la camtidad de vendedores");
        vendedores = intro.nextInt();
        System.out.println("ingrese la cantidad de dias");
        dias = intro.nextInt();
        int ventas [][] = new int [vendedores][dias];
        
        for ( i = 0; i < vendedores; i++) {
                System.out.println("Vendedor " + (i+1) );
                for (j = 0; j < dias; j++) {
                    System.out.println("ingrese ventas para el dia " + (j+1) );
                    ventas[i][j] = intro.nextInt(); 
                }
            }    
            
        for (i = 0; i < vendedores; i++) {
            suma = 0;
            for (j = 0; j < dias; j++) {
                suma = suma + ventas[i][j];
            }
            promedio = (float)(suma/dias);
            System.out.println("el promedio de ventas del vendedor " + (i+1) + " es " + promedio);
        }  
    }
    
}
