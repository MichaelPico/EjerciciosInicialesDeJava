package ejerciciosinicialesdejava;

import java.util.Scanner;

public class Ej04_ProgramaDetectorParInparPositivoNegativo {

    public static void main(String[] args) {

        //Programa en el que informo si un numero es par/inpar positivo/negativo
        System.out.println("Programa detector Par/Inpar, Negativo/Positivo");
        System.out.println("----------------------------------------------");

        //Declaro mis variables y mi scanner
        int numero;
        Scanner datos = new Scanner(System.in);
        
        //El usuario introduce el numero que quiere comprobar
        System.out.println("Introduce el numero");
        numero = datos.nextInt();
        
        //Este bloque if comprueba e indica si el numero es par o no
        if (numero%2==0){
            System.out.println("El numero es par");
        } else{
            System.out.println("El numero es inpar");
        }
               
        //Este bloque if comprueba e indica si el numero es positivo o negativo
        if (numero >=0){
            System.out.println("El numero es positivo");
        } else{
            System.out.println("El numero es negativo");
        }
    }  
}
