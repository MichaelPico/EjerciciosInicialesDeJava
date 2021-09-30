package ejerciciosinicialesdejava;

import java.util.Scanner;

public class Ej02_ProgramaQueImprimeMiNombreyMiApellido {

    public static void main(String[] args) {

        //Realiza un programa que imprima por pantalla tu nombre y edad
        System.out.println("Programa que te da la bienvenida y te dice tu edad");
        System.out.println("--------------------------------------------------");
        
        //Declaro las variables y el scanner
        int edadUsuario;
        String nombreUsuario;
        Scanner datos = new Scanner(System.in);
        
        //El usuario introduce su nombre y su edad
        System.out.println("Introduce tu nombre: ");
        nombreUsuario = datos.nextLine();
        System.out.println("Introduce tu edad: ");
        edadUsuario = datos.nextInt();
        
        //Imprimo mensaje de bienvenida
        System.out.println("Bienvenido " + nombreUsuario + " tu edad es : " 
                + edadUsuario);
    }
}
