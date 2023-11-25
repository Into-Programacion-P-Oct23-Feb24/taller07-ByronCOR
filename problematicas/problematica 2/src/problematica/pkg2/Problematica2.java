/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problematica.pkg2;

/**
 *
 * @author Usuario
 */
public class Problematica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma = 2;
        int contador = 2;
        String cadena = "";
        do {
            contador = contador + 2;
            cadena = String.format("%s\n %d", cadena, suma);
            suma = suma + contador;
        } while (contador <= 20);
        System.out.printf("%s\n", cadena);

    }

}
