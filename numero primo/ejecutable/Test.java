package ejecutable;

import java.lang.Math;
import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args) {

        /**
         * Hacer el diagrama de flujo y el programa en Java
         * que lea un número n, entero y positivo, y que
         * determine si es o no un número primo.
         */

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number you want to check :");

        int numero = s.nextInt();
        int n = 2;
        
        boolean condition = false;
        
        while (n <= numero / 2) {
            if (numero % n == 0) {
                condition = true;
                break;
            }
        ++n;
        }
 
        if (!condition) {
            System.out.println("The Number " + numero + " is a prime number.");
         }
        else {
            System.out.println("The Number " + numero + " is not a prime number.");
         }

        System.exit(0);

    }
}