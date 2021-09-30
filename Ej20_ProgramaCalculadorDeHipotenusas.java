package ejerciciosinicialesdejava;

import java.util.Scanner;

public class Ej20_ProgramaCalculadorDeHipotenusas {

    public static void main(String[] args) {

        //20.Realiza un programa que calcule la hipotenusa de un triángulo 
        //rectángulo de lados 7 y 15 e imprima el resultado. (en mi programa
        //el usuario elije el tamaño de los lados)

        //La hipotenusa de un triangulo rectangulo es la raiz cuadrada de
        //la suma de los cuadrados de los catetos
        
        //Declaro las variables
        int lado1;
        int lado2;
        double hipotenusa;
        double hipotenusaRedondeada;
        Scanner datos = new Scanner(System.in);
        
        //El usuario determina los lados del triangulo
        System.out.println("Introduzca el lado 1 del triangulo");
        lado1 = datos.nextInt();
        System.out.println("Introduzca el lado 2 del triangulo");
        lado2 = datos.nextInt();
        
        //Calculo la hipotenusa del triangulo (el metodo Math.sqrt te da la raiz cuadrada), uso
        //Math.round(double*100.00)/100.00 para que el resultado este redondeado a dos decimales
        //se redondeara a la cantidad de 0 que use en el metodo (si quiero x ceros, coloco 100.xceros)
        hipotenusa=Math.sqrt(lado2*lado2+lado1*lado1);
        hipotenusaRedondeada = Math.round(hipotenusa*100.00)/100.00;
        System.out.println("La hipotenusa de el triangulo dado es: " + hipotenusaRedondeada);
    }
}
