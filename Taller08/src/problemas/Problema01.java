/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (int i = 30; i >= 10; i--) {
            for (int j = 0; j < 4; j++) {
                System.out.print(i - j + (j * 30));
                if (j < 3) {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
