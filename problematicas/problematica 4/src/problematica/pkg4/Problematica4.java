/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problematica.pkg4;

/**
 *
 * @author Usuario
 */
public class Problematica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int limite = 15;
        int numerador = 1;
        int contador = 0;
        int denominador = 3;
        double fraccion;
        double total = 1;
        String signo;
        String cadena = "";

        while (denominador <= limite) {
            // para manejar el signo asociado 
            if (contador == 0) {
                signo = "-";
                fraccion = (-((double) numerador / denominador));
                contador = contador + 1;
            } else {
                signo = "+";
                contador = contador - 1;
                fraccion = (+((double) numerador / denominador));
            }

            cadena = String.format("%s%s %d/%d ",
                    cadena,
                    signo,
                    numerador,
                    denominador);
            total = total + fraccion;
            denominador = denominador + 2;

        }

        System.out.printf("%d %s", contador, cadena);
        System.out.printf("\nEl resultado es: %.3f\n", total);
    }

}
