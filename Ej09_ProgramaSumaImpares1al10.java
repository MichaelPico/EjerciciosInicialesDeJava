package ejerciciosinicialesdejava;

import java.util.Scanner;

public class Ej09_ProgramaSumaImpares1al10 {

    public static void main(String[] args) {

        //9. Realiza un programa que sume los primeros diez números naturales impares.
        System.out.println("Programa que suma los x primeros numeros impares");
        System.out.println("------------------------------------------------");
        //Yo lo creare para calcular los primeros x numeros impares
        
        //Declaro las variables y el scanner
        int i;
        int numeroObjetivo;
        int calc = 0;
        int contador = 0;
        Scanner datos = new Scanner(System.in);
        
        //El usuario introduce cuntos primeros numeros impares quiere sumar
        System.out.println("Introduce cuantos primeros numeros impares quieres sumar");
        numeroObjetivo = datos.nextInt();
        
        //El bucle comprueba si el numero es par o impar, a continuacion suma todos los impares en 
        //la variable calc y por cada numero que suma, la variable contador aumenta 1, use la variable
        //contador como condicion del bucle, aunque pude haber puesto como condicion: "(i/2)< numeroObjetivo
        // y seguiria funcionando igual
        for (i=1; contador<numeroObjetivo; i++){
            if (i%2!=0){
                calc += i;
                contador ++;
            }
        }
        
        //Muestro por consola la suma total de todos los numeros impares que el usuario pidio
        System.out.println("La suma total de los " + numeroObjetivo + " primeros"
                + " numeros impares es: " + calc);
    } 
}
