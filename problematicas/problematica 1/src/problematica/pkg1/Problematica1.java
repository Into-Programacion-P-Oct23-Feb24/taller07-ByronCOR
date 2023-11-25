/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problematica.pkg1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problematica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        String posicion;
        String opcion;
        String cadena_jug = "";
        String cadena_edad = "";
        boolean bandera = true;
        int edad;
        int contador = 1;
        double estatura;
        double prom_edad = 0;
        double prom_estatura = 0;
        do {
            System.out.println("Ingrese el nombre del jugador");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posicion en el campo de juego");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador");
            estatura = entrada.nextDouble();
            prom_edad = prom_edad + edad;

            prom_estatura = prom_estatura + estatura;
            cadena_jug = String.format("%s%d. %s -%s-, edad %d , estatura %.2f\n",
                     cadena_jug,
                     contador,
                     nombre,
                     posicion,
                     edad,
                     estatura);
            entrada.nextLine();
            cadena_edad = String.format("%s"
                    + "\n%d", cadena_edad, edad);
            contador = contador + 1;
            System.out.println("Para ingresar mas informacion digite: SI\n"
                    + "Paraterminar el proceso digite: NO");
            opcion = entrada.nextLine();
            opcion = opcion.toUpperCase();
            if (opcion.equals("NO")) {
                bandera = false;
            }
        } while (bandera == true);
        prom_edad = prom_edad / contador;
        prom_estatura = prom_estatura / contador;
        System.out.printf("Listado de Jugadores\n%sListado de Edades%s\n"
                + "Promedio de edades: %.2f\nPromedio de estaturas: %.2f\n"
                , cadena_jug
                , cadena_edad
                , prom_edad
                , prom_estatura);
    }

}
