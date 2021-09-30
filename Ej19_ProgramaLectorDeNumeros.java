package ejerciciosinicialesdejava;

import java.util.Scanner;

public class Ej19_ProgramaLectorDeNumeros {

    public static void main(String[] args) {

        //19. Realiza un programa que lea números enteros hasta que el usuario introduzca un número menor que el anterior.
        
        //Declaro variables y scanner (el int numeor tiene el menor int posible)
        int numero = (int) -Math.pow(2, 31);
        int temp;
        boolean activo = true;
        Scanner datos = new Scanner(System.in);
        
        //El usuario introduce un numero, guardo el numero en la variable numero, si el numero 
        //introducido es menor que el anterior, se ejecuta el else y se acaba el programa, sino
        //se ejecuta el if y continua el programa
        while (activo){
            System.out.println("Introduce un numero");
            temp = datos.nextInt();
            
            if (temp>numero) {
                numero = temp;
                System.out.println("El numero introducido es mayor que el anterior");
            } else {
                activo = false;
                System.out.println("Fin del programa");
            }
        }
    }
}
