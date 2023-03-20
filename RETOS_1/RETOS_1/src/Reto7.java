import java.util.Random;
import java.util.Scanner;

public class Reto7 {
    public static void main(String[] args) {
        //Declarar variables
        String nombreUsuario;
        int usu; 
        int consola;
        int numeroRepeticiones = 0;
        int vecesJugadas = 0;
        int numeroVidas = 3;
        double ganancias = 0;
        double perdidas = 0;
        double apuesta = 0;
        double saldo = 0;
        double sumatoriaTotal = 0;
        //Instanciar clases
        Scanner Registro=new Scanner(System.in);
        //generador aleatorio
        Random rand=new Random();
        //solicitar datos
        System.out.println("Ingrese su nombre");
        nombreUsuario =Registro.next();
        System.out.println("Ingresa el número de veces que quiere jugar, máximo tiene 10: ");
        numeroRepeticiones=Registro.nextInt();       
        //Crear la conidición
        if (numeroRepeticiones > 10 || numeroRepeticiones < 0) {
            System.out.println("El número de intentos supera el maximo");
            return;
        }
        System.out.println("Ingresa su saldo inicial: ");
        saldo=Registro.nextDouble();
        System.out.println("Ingresa el valor que desea apostar: ");
        apuesta=Registro.nextInt();
        //crear bucle 
        while (numeroVidas > 0 && vecesJugadas < numeroRepeticiones) {
        System.out.println("Bienvenido al juego de piedra, papel o tijeras");
        System.out.println("Por favor, seleccione: ");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijeras");
        usu=Registro.nextInt();
         //Crear la conidición
        if (usu < 1 || usu > 3) {
            System.out.println("Opción incorrecta, por favor seleccione 1 o 3");
            return;
        }
        consola = rand.nextInt(3) + 1;
        System.out.print("La computadora eligio: ");
         //Crear la conidición
        switch (consola) {
            case 1:
                System.out.println("Piedra");
                break;
            case 2:
                System.out.println("Papel");
                break;
            case 3:
                System.out.println("Tijeras");
                break;
        }
         //Crear la conidición
        if (usu == consola) {
            System.out.println("Empataron");
            vecesJugadas = vecesJugadas + 1;
            System.out.println("Has jugado: " + vecesJugadas);
        } else if(usu == 1 && consola == 3 || usu == 2 && consola == 1 || usu == 3 && consola == 2){            
            System.out.println("Ganaste venciste a la computadora ");
            perdidas = apuesta * 0.3;
            apuesta = apuesta + ganancias;
            vecesJugadas = vecesJugadas + 1;
            saldo = saldo + apuesta;
            System.out.println("Gracias por jugar: " + nombreUsuario +" su saldo anterior es de: " +saldo+ " ganaste: " +ganancias+ " los has hecho en: " +vecesJugadas);
            sumatoriaTotal = apuesta + ganancias;
        }else{
            System.out.println("Perdiste la computadora te gano ");
            perdidas = apuesta * 0.3;
            apuesta = apuesta - perdidas;
            System.out.println("Gracias por jugar: " + nombreUsuario +" su saldo anterior es de: " +saldo+ " perdiste: " +perdidas+ " los has hecho en: " +vecesJugadas);
            numeroVidas = numeroVidas - 1;
            System.out.println("Te quedan: "+numeroVidas+" vidas");
            sumatoriaTotal = apuesta - perdidas;
        }
        }
        //imprimir resultados 
            System.out.println("Gano o perdio: " + sumatoriaTotal);

            System.out.println("Gracias por usar el programa.");
            
            //Limpiar el buffer
            Registro.close();

        }


}

