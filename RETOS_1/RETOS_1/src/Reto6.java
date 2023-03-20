import java.util.Random;
import java.util.Scanner;

public class Reto6 {
    public static void main(String[] args) {
        //Declarar variables
        String nombreUsuario;
        int usu; 
        int bot;
        int numeroRepeticiones = 0;
        int vecesJugadas= 0;
        int numeroVidas = 3;
        double ganancias = 0;
        double perdidas = 0;
        double apuesta = 0;
        double saldo = 0;
        double sumatoriaTotal = 0;
        //Instanciar clases
        Scanner Registro =new Scanner(System.in);
        //generador aleatorio
        Random rand=new Random();
        //solicitar datos 
        System.out.println("Ingrese su nombre ");
        nombreUsuario=Registro.next();
        System.out.println("Digite el número de veces que quiere jugar máximo 10: ");
        numeroRepeticiones=Registro.nextInt(); 
          
        //Crear la condición
        if (numeroRepeticiones > 10 || numeroRepeticiones < 0) {
            System.out.println("El número de intentos no es correcto");
            return;
           
        }
        System.out.println("digite su saldo a inicial: ");
        saldo=Registro.nextDouble();
        System.out.println("digite la cantidad que desea apostar: ");
        apuesta=Registro.nextInt();
        //crear bucle
        while (numeroVidas > 0 && vecesJugadas<numeroRepeticiones) {
        System.out.println("Bienvenido al juego de Cara o Sello");
        System.out.println("Por favor, seleccione:");
        System.out.println("1. Cara");
        System.out.println("2. Sello");
        usu=Registro.nextInt();
            //crear condicion
        if (usu < 1 || usu > 2) {
            System.out.println("Opción incorrecta. Por favor seleccione 1 o 2.");
            return;
        }
        bot = rand.nextInt(2) + 1;
        System.out.print("Cayó: ");
        //crear condicion
        switch (bot) {
            case 1:
                System.out.println("Cara");
                break;
            case 2:
                System.out.println("Sello");
                break;
        }
        //crear condicion
        if (usu == bot) {
            System.out.println("Ganaste venciste a la computadora ");
            ganancias = apuesta * 0.1;
            apuesta = apuesta + ganancias;
            System.out.println("Has ganado: " + apuesta);
            saldo = saldo + apuesta;
            System.out.println("Tu saldo es: " + saldo);
            vecesJugadas = vecesJugadas + 1;
            System.out.println("Usted ha jugado: "+ vecesJugadas);
            sumatoriaTotal = sumatoriaTotal + ganancias;
            //crear condicion
        } else {            
            System.out.println("Perdiste la computadora te vencio ");
            perdidas = apuesta * 0.1;
            apuesta = apuesta - perdidas;
            System.out.println("Gracias por jugar: " + nombreUsuario + " perdido: "+perdidas);
            numeroVidas = numeroVidas - 1;
            saldo = saldo - apuesta;
            System.out.println("Tu saldo es de: " + saldo);
            System.out.println("Te quedan: " +numeroVidas + " vidas");
            vecesJugadas = vecesJugadas + 1;
            System.out.println("Has jugado: "+ vecesJugadas);
            sumatoriaTotal = sumatoriaTotal - perdidas;
        }
        }
        //imprimir los resultados 
            System.out.println("Gano o perdio: " + sumatoriaTotal);
        
            //Limpiar el buffer
            Registro.close();

    }
}
    
