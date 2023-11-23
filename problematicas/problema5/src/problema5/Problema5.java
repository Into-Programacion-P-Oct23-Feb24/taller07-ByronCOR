/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema5;

/**
 *
 * @author LAB.ELECT
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int limite = 15;
        int numerador = 1;
        int contador = 0;
        int denominador = 3;
        String signo;
        String cadena = "";

        do {
            // para manejar el signo asociado 
            if (contador == 0) {
                signo = "-";
                contador = contador + 1;
            } else {
                signo = "+";
                contador = contador - 1;
            }

            cadena = String.format("%s%s %d/%d ",
                    cadena,
                    signo,
                    numerador,
                    denominador);
            denominador = denominador + 2;

        } while (denominador <= limite);

        System.out.printf("%d %s", contador, cadena);
    }

}
