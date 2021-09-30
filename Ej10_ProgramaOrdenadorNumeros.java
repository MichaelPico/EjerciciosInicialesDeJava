package ejerciciosinicialesdejava;

import java.util.Scanner;

public class Ej10_ProgramaOrdenadorNumeros {

    public static void main(String[] args) {

        //10. Escribe un programa que pida tres números al usuario y los escriba ordenados de menor a mayor.
        System.out.println("Programa Ordenador de Numeros");
        System.out.println("-----------------------------");   
        
        //Declaro las variables y el scanner(la variable temporal es necesaria para realizar el swap)
        int num1;
        int num2;
        int num3;
        int temp;  
        Scanner datos = new Scanner(System.in);
        
        //El usuario introduce los numeros a ordenar
        System.out.println("Introduce el numero 1");
        num1 = datos.nextInt();
        System.out.println("Introduce el numero 2");
        num2 = datos.nextInt();
        System.out.println("Introduce el numero 3");
        num3 = datos.nextInt();
        
        //Acontinuacion para ordenarlos uso el metodo de los swaps
        
        //El primer if toma el mayor de entre num1 y num2 y lo coloca en num2, esto lo logra
        //con ayuda de la variable temp la cual permite el cambio
        if (num1 > num2){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
            
        //El if anterior se aseguro de que el mayor de entre num1 y num2 estuviera en num2, este if
        //junto con el swap se encargara de que el numero mayor de los 3 siempre este en el lugar num3
        if (num2 > num3){
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        
        //El if anterior se aseguro de que el mayor de todos estuviera en num3, este if se asegura 
        //de que ordenar los 2 numeros restantes en caso de ser necesario
        if (num1 > num2){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        
        //Muestro los numeros en orden
        System.out.println("El orden de los numero es: " + num1 + " " + num2 +
                " " + num3);
    }
}
