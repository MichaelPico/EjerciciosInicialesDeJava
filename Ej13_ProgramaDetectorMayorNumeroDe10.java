package ejerciciosinicialesdejava;

import java.util.Scanner;

public class Ej13_ProgramaDetectorMayorNumeroDe10 {

    public static void main(String[] args) {

        //13. Haz un programa que pida 10 números al usuario y calcule cuál es el mayor 
        //valor que ha introducido el usuario.

        System.out.println("Programa Detecta Numero Mayor De los numeros introducidos");
        System.out.println("-----------------------------------");
        
        //Declaro mis variables y el scanner
        int num = 0;
        int cantNumComprobar;
        int temp;
        Scanner datos = new Scanner(System.in);
        
        //El ejercicio pide que el usuario introduzca 10numeros pero yo prefiero que el usuario
        //decida cuantos numeros quiere comprobar
        System.out.println("¿Cuantos numeros vas a introducir para hallar el mayor?");
        cantNumComprobar = datos.nextInt();
        
        //El bucle pide al usuario que introduzcas numeros hasta llegar a la cantidad de numeros 
        //previamente especificada, ademas por cada numero introducido atravez de un if y una variable
        //temporal almaceno en num el mayor numero que ha sido introducido
        for (int i = 1; i <= cantNumComprobar; i++){
            System.out.println("Introduce un numero");
            temp = datos.nextInt();
            if (temp > num) {
                num = temp;
            }
        }
        
        //Le digo al usuario cual es el mayor de todos los numeros introducidos
        System.out.println("Has introducido: " + cantNumComprobar + " y de todos los numeros que "
                + "introduciste el mayor es: " + num);
    } 
}
