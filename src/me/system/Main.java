package me.system;


import javax.swing.JOptionPane;
/**
 *
 * @author Adrián Pérez
 * @version Beta
 *
 *
 */


public class Main {


    public static String teclado;
    public static int valorFilas;
    public static void main(String[] args) {

        teclado = JOptionPane.showInputDialog("Introduce la altura");
        valorFilas = Integer.parseInt(teclado);

        System.out.println("[Traza] Llamamos al metodo crear piramide");
        piramide.conPiramide(valorFilas);

        hexagono a = new hexagono();
    }
}
