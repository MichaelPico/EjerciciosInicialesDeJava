package ejerciciosinicialesdejava;

import java.util.Scanner;

public class Ej08_ProgramaSuma20Factorial {

    public static void main(String[] args) {

        // Programa que suma 201
        System.out.println("Programa que calcula el factorial de un numero");
        System.out.println("----------------------------------------------");
        
        //Declaro las variables y el scanner
        int i;
        int fact = 1;
        int numeroFactorial;
        Scanner datos = new Scanner(System.in);
        
        //El usuario introduce el numero factorial que quiere calcular
        System.out.println("Introduce el numero cuyo factorial quieras calcular");
        numeroFactorial = datos.nextInt();
        
        //El bucle for calculara 1x2x3x4... xn donde n es el numero introducido por el usuario
        for (i = 1; i <= numeroFactorial; i++){
            fact = fact * i;
        }
        
        //Muestro el resultado en la consola
        System.out.println(fact);
        
    }
    
}
