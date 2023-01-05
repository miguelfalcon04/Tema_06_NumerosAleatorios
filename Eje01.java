/* Ejercicio 1
Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados).

@author miguelfalcon
*/

public class Eje01{
    public static void main(String[] args){

        int suma=0;

        for(int i=1; i<=3; i++){
            int n = (int)(Math.random()*6);
            System.out.println("Tirada dado "+i+": "+n);
            suma=suma+n;
        }

        System.out.print("La suma total es "+suma);

    }
}