package ejecutable;

import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) {
        /**4. Determinar si un número es capicúa o no. Se dice
         * que un número capicúa es aquel que al invertir sus
         * cifras da el mismo número. Por ejemplo, 12321
         *invertido es 12321. Entonces es un número capicúa */

        int n;

        n= Integer.parseInt(JOptionPane.showInputDialog("escriba un numero de 5 cifras: "));

        if(n>99999){
            int m = n%1;
            int n2=(n%10)%1;
            int n301=n%100;
            int n3=(n301%10)%1;
            int n401=n%1000;
            int n402=(n401%100)%10;
            int n4=(n402)%1;
            int n501=(n%10000)%1000;
            int n502=(n501%100)%10;
            int n5=n502%1;

            if(m==n5){
                if(n2==n5){
                    System.out.println("si es un numero capicua");
                }else{
                    System.out.println("no es un numero capicua");
                }
            }else{
                System.out.println("no es un numero capicua");
            }
        }else{
            System.out.println("no es un numero de 5 cifras")
        }

        
        System.exit(0);

        
    }
}