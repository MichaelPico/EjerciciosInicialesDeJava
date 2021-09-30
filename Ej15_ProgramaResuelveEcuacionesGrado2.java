package ejerciciosinicialesdejava;

import java.util.Scanner;

public class Ej15_ProgramaResuelveEcuacionesGrado2 {

    public static void main(String[] args) {

        // 15.	Realiza un programa que resuelva ecuaciones de segundo grado. Inicializa 
        //los valores de a, b y c. Si el número sobre el que hay que calcular la raíz es 
        //negativo, informa al usuario de que la ecuación no tiene solución real.
        
        System.out.println("Calculadora de ecuaciones de segundo grado");
        System.out.println("------------------------------------------");
               
        //Declaro las variables y el scanner
        int coeficiente1;
        int coeficiente2;
        int terminoIndependiente;
        int contenidoRaiz;
        int resultado1;
        int resultado2;
        Scanner datos = new Scanner(System.in);
        
        //El usuario introduce los coeficientes y el termino independiente
        System.out.println("Introduce a (el coeficiente de x^2");
        coeficiente1 = datos.nextInt();
        System.out.println("Introduce b (el coeficiente de x");
        coeficiente2 = datos.nextInt();
        System.out.println("Introduce a (el termino independiente");
        terminoIndependiente = datos.nextInt();
        
        //Con esta variable y el siguiente if compruebo si la ecuacion tiene resultados naturales 
        //posibles
        contenidoRaiz = (int) (Math.pow(coeficiente2, 2)-2*coeficiente1*terminoIndependiente);
        
        if (contenidoRaiz<0){
            System.out.println("La ecuacion no tiene solucion real");
        } else { //Si la ecuacion tiene resultados posibles, los calculo y los muestro
            resultado1 = (int) ((-coeficiente2 + Math.sqrt(contenidoRaiz))/(2*coeficiente1));
            resultado2 = (int) ((-coeficiente2 - Math.sqrt(contenidoRaiz))/(2*coeficiente1));
             
            System.out.println("La primera solucion de la ecuacion es: " + resultado1 +
                    " y la segunda solucion es: " + resultado2);
        }
    } 
}
