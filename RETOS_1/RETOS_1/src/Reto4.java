import java.util.Random;
import java.util.Scanner;

public class Reto4 {
    //crear metodo
    public static void main(String[] args) {
        //generador aleatorios>
      Random random=new Random();
      //declarar variables // 0 es piedra, 1 es papel, 2 es tijera
        int opcionComputadora = random.nextInt(3); 
        String[] opciones = {"piedra", "papel", "tijera"};
        //instanciar clase 
        Scanner Registro=new Scanner(System.in);
        //solicitar los datos 
        System.out.println("Juguemos a Piedra, Papel o Tijera! Digita la opción que deseas (piedra, papel o tijera): ");
        String opcionJugador = Registro.nextLine().toLowerCase();

        System.out.println("La computadora escogío" + opciones[opcionComputadora] + ".");
        //crear condicional
        if (opcionJugador.equals(opciones[opcionComputadora])) {
            System.out.println("¡Es un empate!");
        } else if (opcionJugador.equals("piedra")) {
            if (opciones[opcionComputadora].equals("papel")) {
                System.out.println("¡Perdiste! El papel envuelve a la piedra.");
            } else {
                System.out.println("¡Ganaste! La piedra aplasta a las tijeras.");
            }
        } else if (opcionJugador.equals("papel")) {
            if (opciones[opcionComputadora].equals("tijera")) {
                System.out.println("¡Perdiste! Las tijeras cortan el papel.");
            } else {
                System.out.println("¡Ganaste! El papel envuelve a la piedra.");
            }
        } else if (opcionJugador.equals("tijera")) {
            if (opciones[opcionComputadora].equals("piedra")) {
                System.out.println("¡Perdiste! La piedra aplasta a las tijeras.");
            } else {
                System.out.println("¡Ganaste! Las tijeras cortan el papel.");
            }
        } else {
            System.out.println("Opción inválida. Ingresa piedra, papel o tijera.");
        }
        //limpiar bufer
        Registro.close();
    }
}
    


