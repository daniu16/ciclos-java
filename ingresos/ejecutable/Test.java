package ejecutable;

import javax.swing.JOptionPane;
import java.lang.Math;

public class Test
{
    public static void main(String[] args) {
    
    /**Pedro tiene un capital de c1 pesos, y Juan uno de
    c2 pesos. Uniendo los dos no les alcanza para hacer
    un negocio que requiere una inversión de c3 pesos.
    Deciden colocar cada uno su capital a ganar interés.
    Pedro lo colocó a un interés compuesto del 3%
    mensual, y Juan al 4% mensual. Hacer el diagrama de
    flujo y el programa en Java que averigüe e imprima en
    cuántos meses, uniendo los dos capitales, pueden
    hacer el negocio que desean.
    */

    double c1,c2,c3;
    double temp = 3/100;
    double temp2 = 4/100;
    double c4=0;
    int i=1;

    c1 = Integer.parseInt(JOptionPane.showInputDialog("escriba el primer valor: "));
    c2 = Integer.parseInt(JOptionPane.showInputDialog("escriba el segundo valor: "));
    c3 = Integer.parseInt(JOptionPane.showInputDialog("escriba el valor al que se queria llegar: "));

    while(c4>=c3){
        c1=c1+c1*(Math.sqrt(temp));
        c2=c2+c2*(Math.sqrt(temp2));
        i=i+1;
        c4=c1+c2;

    } JOptionPane.showMessageDialog(null, "se requieren un total de:"+i+"para optener"+c3);
     
    System.exit(0);

    }
}