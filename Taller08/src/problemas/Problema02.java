/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema02 {
    
    
    public static void main(String[] args) {
       
        for (int i = 0; i <= 20; i++) {
           
            double fahrenheit = 20 + (i * 4);
           
            double celsius = (5.0 / 9.0) * (fahrenheit - 32);
            
       
            System.out.printf("Operación(%d) Fahrenheit: %.2f ===> Celsius: %.2f%n", i, fahrenheit, celsius);
        }
    }
}


 
