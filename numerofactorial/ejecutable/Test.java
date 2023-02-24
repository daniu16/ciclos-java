package ejecutable;


import javax.security.auth.kerberos.KerberosCredMessage;
import javax.swing.JOptionPane;


public class Test
{
    public static void main(String[] args) {
        /** Hacer el diagrama de flujo y el programa en Java
        que lea un número n, entero y positivo, y que le
        calcule su factorial y que lo imprima junto con el
        número leído. */


        int n;
        int r=0;
        int ñ=0;
        int l=1;


        n= Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero: "));  
        int m = n;  
        int j = n;


        for(r=0; m>r; n=n-1){
            System.out.println(n);
            System.out.println("por");
            r=r+1;
            ñ=ñ+1;
            l=l*j;
            j=j-1;
        }System.out.println("es igual a: "+l);


   
        System.exit(0);


       
    }
}
