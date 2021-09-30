package ejerciciosinicialesdejava;

import java.util.Scanner;

public class Ej18_DetectorDeNegativos {

    public static void main(String[] args) {

        //Pedir 10 números, y mostrar al final si se ha introducido alguno negativo.
        //Lo hare de forma parecida al ejercicio 13 ademas de que no seran 10 numeros
        //los que comprobare, seran los que el usuario quiera
        System.out.println("Programa Detecta si hay numeros introducidos negativos");
        System.out.println("------------------------------------------------------");
        
        //Declaro mis variables y el scanner
        int numMenor = 0;
        int cantNumComprobar;
        int temp;
        Scanner datos = new Scanner(System.in);
        
        //El ejercicio pide que el usuario introduzca 10 numeros pero yo prefiero que el usuario
        //decida cuantos numeros quiere comprobar
        System.out.println("¿Cuantos numeros vas a introducir?");
        cantNumComprobar = datos.nextInt();
        
        //El bucle pide al usuario que introduzca numeros hasta llegar a la cantidad de numeros 
        //previamente especificada, ademas por cada numero introducido atravez de un if y una variable
        //temporal almaceno en num el menor numero que ha sido introducido
        for (int i = 1; i <= cantNumComprobar; i++){
            System.out.println("Introduce un numero");
            temp = datos.nextInt();
            if (temp < numMenor) {
                numMenor = temp;
            }
        }
        
        //Uso un if, e informo si el menor numero introducido es negativo o no
        if (numMenor<0){
            System.out.println("Se ha introducido numero negativo.");
        } else {
            System.out.println("No se ha introducido numero negativo.");
        }
    }
}
