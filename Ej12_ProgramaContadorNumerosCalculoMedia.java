package ejerciciosinicialesdejava;

import java.util.Scanner;

public class Ej12_ProgramaContadorNumerosCalculoMedia {

    public static void main(String[] args) {

        //12. Codifica un programa que pida números al usuario y termine cuando el usuario introduzca cero.
        //El programa, antes de terminar mostrará cuántos números ha leído y su valor medio.
        
        //Declaro variables y el scanner
        int numeroIntroducido;
        int contadorNumeros = -1;
        int mediaNumeros;
        int sumaNumeros = 0;
        boolean activo = true;
        Scanner datos = new Scanner(System.in);
        
        //Este bucle, se encarga de pedir numeros al usuario e ir sumandolos en la variable sumaNumeros,
        //ademas cuenta cuantos numeros ha sumado, luego tiene un if el cual en caso de introducir un
        //0 como numero termina el bucle (con ayuda del boolean "activo")
        while (activo){
            System.out.println("Introduce un numero (0 para terminar)");
            numeroIntroducido = datos.nextInt();
            sumaNumeros += numeroIntroducido;
            contadorNumeros++;
            if (numeroIntroducido==0) {
                activo = false;
            }
        }
        
        //La variable mediaNumeros no es necesaria ya que se podria calcular la media directamente en
        //el print, pero yo la uso para calcularla
        mediaNumeros= sumaNumeros/contadorNumeros;
        
        //Imprimo los resultados al usuario
        System.out.println("El programa ha leido: " + contadorNumeros + " y la "
                + "media de todos estos numeros es: " + mediaNumeros);  
    }
}
