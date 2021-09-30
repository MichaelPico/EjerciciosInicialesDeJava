package ejerciciosinicialesdejava;

import java.util.Scanner;

public class Ej11_ProgramaInformeEdad {

    public static void main(String[] args) {

        //11. Programa donde introduces una edad y te dice si es menor de 18, entre
        //18 y 65 o mayor de 65

        System.out.println("Programa informe edad");
        System.out.println("---------------------");
        
        //Declaro variable y scanner
        int edad;
        Scanner datos = new Scanner(System.in);
        
        //El usuario introduce la edad
        System.out.println("Introduce una edad");
        edad = datos.nextInt();
        
        //Atravez de if's envio el mensaje correspondiente segun el caso
        if (edad < 18){
            System.out.println("Eres menor de edad");
        } else if (edad >= 18 && edad <= 65){
            System.out.println("Eres mayor de edad y menor de 65");
        } else {
            System.out.println("Eres de la tercera edad viejo");
        }
        
    } 
}
