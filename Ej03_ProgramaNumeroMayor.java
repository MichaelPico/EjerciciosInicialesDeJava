package ejerciciosinicialesdejava;

import java.util.Scanner;

public class Ej03_ProgramaNumeroMayor {

    public static void main(String[] args) {

        //Este programa tomara dos numeros y te dira el numero mayor
        System.out.println("Programa detector de numero mayor");
        System.out.println("---------------------------------");
        
        //Declaro mis variables y el scanner
        int num1;
        int num2;
        Scanner datos = new Scanner(System.in);
        
        //El usuario introduce los numeros
        System.out.println("Introduce el primer numero");
        num1 = datos.nextInt();
        System.out.println("Introduce el segundo numero");
        num2 = datos.nextInt();
        
        //El metodo Math.max te dice el mayor de dos numeros, lo uso para
        //imprimir el mayor de los dos numeros
        System.out.println("El numero mas grande es: " + Math.max(num1, num2));
    }
}
