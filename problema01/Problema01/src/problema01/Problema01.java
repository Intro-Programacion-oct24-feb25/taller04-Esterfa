/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Scanner;

/**
 *
 * @author VEL-ANDRES
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        double base;      
        double altura;    
        double resultado;
        Scanner obj=new Scanner(System.in);            
              System.out.println("Escribe la base: ");             
              base=obj.nextDouble();        
              System.out.println("Mete la altura: ");
              altura=obj.nextDouble();
        resultado=((base*altura)/2);   
        System.out.print("El area del Triangulo es: "+resultado);
        
        
        
    }
    
}
