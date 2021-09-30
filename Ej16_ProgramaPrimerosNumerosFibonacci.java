package ejerciciosinicialesdejava;

import java.util.Scanner;

public class Ej16_ProgramaPrimerosNumerosFibonacci {

    public static void main(String[] args) {

        //16.	Programa que genere los primeros 10 números de la serie de Fibonacci.
        //Yo cambiare el programa para que genere la cantidad de numeros que quieras.
        
        System.out.println("Programa para obtener numeros de la sucesion de Fibonacci");
        System.out.println("---------------------------------------------------------");
        
        //Declaro mis variables
        int temp; 
        int num1=0;
        int num2=1;
        int num3; 
        int cantidadNumeros;
        Scanner datos = new Scanner(System.in);
        
        //El usuario elije cuantos numeros quiere
        System.out.println("Cuantos numeros de la sucesion quieres obtener");
        cantidadNumeros = datos.nextInt();
        
        
        //Preparo el mensaje del output e imprimo los 2 primeros numeros de la sucesion
        System.out.println("Los " + cantidadNumeros + " primeros numeros de la sucesion de"
                + "fibonacci son: ");
        System.out.println(num1);
        System.out.println(num2);
        
        //La secuencia de fibonacci viene dada por la suma do los dosnumeros anterirores de 
        //la succesion, donde los primeros dos numeros son el 0 y el 1, atraves de swaps y un bucle 
        //hayo cada numero de la sucesion, num3 calcula el siguiente numero a partir de num1 y num2,
        //una vez calculado muevo los valores en este orden num3->num2->num1 (esto lo hago con temp 
        //haciendo el swap) una ves he movido los valore calculo el siguiente numero con los nuevos
        //valores de num2 y num1
        for (int i=0; i<cantidadNumeros; i++){
            num3 = num1 + num2;
            temp = num2;
            num2 = num3;
            num1 = temp;
            System.out.println(num3);
        }    
    }
}
