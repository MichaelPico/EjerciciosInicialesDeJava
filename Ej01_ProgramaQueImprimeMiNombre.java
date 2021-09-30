package ejerciciosinicialesdejava;

import java.util.Scanner;

public class Ej01_ProgramaQueImprimeMiNombre {

    public static void main(String[] args) {
        
        //Realiza un programa que imprima por pantalla tu nombre
        System.out.println("Programa que te da la bienvenida");
        System.out.println("--------------------------------");
        
        //Declaro el scanner
        Scanner datos = new Scanner(System.in);
        
        //El usuario introduce su nombre
        System.out.println("Introduce tu nombre: ");
        String nombreUsuario = datos.nextLine();
        
        //Imprimo el mensaje de bienvenida
        System.out.println("Bienvenido " + nombreUsuario);
    }
}
