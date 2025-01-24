/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Parte ascendente (de 1 a 5 estrellas)
        for (int i = 1; i <= 5; i++) {
            // Imprimir 'i' estrellas
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Salto de línea después de cada fila
            System.out.println();
        }

        // Parte descendente (de 4 a 1 estrella)
        for (int i = 4; i >= 1; i--) {
            // Imprimir 'i' estrellas
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Salto de línea después de cada fila
            System.out.println();
        }
    }
}
