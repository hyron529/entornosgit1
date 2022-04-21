package me.system;

/**
 *
 * @author Adrián Pérez
 *
 * Metodo con el que imprimimos en consola los espacios y asteriscos de nuestra piramide.
 * Estos son imprimidos mediante distintos bucles que nos coge del main el valor de la altura que le metemos.
 *
 *
 */


public class piramide {
    public static void conPiramide(int numfilas) {
        for(int altura = 1; altura<=numfilas; altura++){
           //Creamos los espacios en blanco
            for(int blancos = 1; blancos<=numfilas-altura; blancos++){
                System.out.print(" ");
            }

            //Creamos los asteriscos
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
