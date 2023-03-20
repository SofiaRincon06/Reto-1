import java.util.Random;
import java.util.Scanner;
public class Reto8 { 
    //crear metodo
    public static void main(String[] args) { 
         // Generador de números (1-100)
        Random rand = new Random(); 
        //declarar variables 
        int numAdivinar = rand.nextInt(100) + 1; 
        //instanciar clase 
        Scanner Registro=new Scanner(System.in);
        int oportunidades=10; 
        int numeroDeIntentos; 
         
        //crear bucle 
        while (oportunidades>0) { 
            System.out.print("Ingresa un número, te quedan" + oportunidades + "de oportunidades para seguir jugando " ); 
            numeroDeIntentos=Registro.nextInt();
            if (numeroDeIntentos == numAdivinar) { 
                System.out.println("¡Adivinaste el número! GANASTE "); 
                System.out.println("Te tomó " + oportunidades + " ese número de oportunidades a ganar. "); 
            } else if (numeroDeIntentos<numAdivinar) { 
                System.out.println("El número a adivinar es mayor."); 
            } else { 
                System.out.println("El número a adivinar es menor."); 
            } 
            oportunidades--; 
        } 
        //crear condicion 
        if (oportunidades==0) { 
            System.out.println("Lo siento, no lograste adivinar el número :( La proxima será. "); 
            System.out.println("El número a adivinar era: " + numAdivinar); 
        } 
        //limpiar bufer 
        Registro.close();

    } 

 

}
