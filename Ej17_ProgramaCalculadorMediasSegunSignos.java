package ejerciciosinicialesdejava;

import java.util.Scanner;

public class Ej17_ProgramaCalculadorMediasSegunSignos {

    public static void main(String[] args) {

        //17.	Pedir 10 números. Mostrar la media de los números positivos, la media 
        //de los números negativos y la cantidad de ceros leídos.
        System.out.println("Programa calculo media negativos y positivos");
        System.out.println("--------------------------------------------");
        
        //Declaro mis variables e inicializo las necesarias
        int temp;
        int sumPos = 0;
        int sumNeg = 0;
        int contPos = 0;
        int contNeg = 0;
        int cantCeros = 0;
        Scanner datos = new Scanner(System.in);
        
        //Bucle en el cual el usuario itroduce 10 numeros y depende de signo pasa algo
        for (int i=0; i<10; i++){
            System.out.println("Introduce un numero");
            temp = datos.nextInt();
            
            //Si el numero es positivo, se suma su valor en la variable sumPos y se cuenta cuantos 
            //positivos van lo mismo con los numeros negativos, ademas cuento los 0
            if (temp>0){
                sumPos += temp;
                contPos++;
            } else if (temp<0){
                sumNeg += temp;
                contNeg++;
            } else {
                cantCeros++;
            }
        }
        
        //Calculo las medias y las imprimo ademas muesto la cantidad de ceros
        System.out.println("La media de los numeros positivos introducidos es: "
                + (sumPos/contPos));
        System.out.println("La media de los numeros negativos introducidos es: "
                + (sumNeg/contNeg));
        System.out.println("Se han introducido: " + cantCeros + " ceros");
    }
}
