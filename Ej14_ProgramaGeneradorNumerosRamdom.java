package ejerciciosinicialesdejava;

import java.util.Scanner;

public class Ej14_ProgramaGeneradorNumerosRamdom {

    public static void main(String[] args) {

        //14. Escribe un programa que genere 6 números aleatorios entre 1 y 49.
        // En vez de generar solo 6 creare un programa donde el usuario elija cuantos queire
        System.out.println("Generador de nuemeros ramdoms");
        
        //Declaro mis variables y mi objeto
        int numeroRandom;
        int cantidadRandom;
        Scanner datos = new Scanner(System.in);
        
        //El usuario decide cuantos numeros randoms quiere
        System.out.println("-----------------------------------------");
        System.out.println("¿Cuantos numeros randoms quieres generar?");
        cantidadRandom = datos.nextInt();
        System.out.println("-----------------------------------------");
        
        //Creo un bucle el cual creara de repite las veces necesarias
        for (int i = 1; i <= cantidadRandom; i++){
            
            //Con el metodo Math.ramdom()*x genero un numero con decimales desde 0 hasta x
            //con el metodo Math.round redondea el numero al entero mas cercano, asigno el numero 
            //ramdom a una variable y la imprimo. (En vez de Math.round pude usar el metodo
            //Math.floor que redondea el numero hacia abajo o Math.ceil hacia arriba)
            numeroRandom = (int) Math.round(Math.random()*49);
            System.out.println(numeroRandom + " Es el " + i + "º numero ramdom");
        }
    }  
}
