
import java.util.Random;
import java.util.Scanner;

public class Reto3 {
    //crear metodo
    public static void main(String[] args) {
      //declracion de variables 
      String nombreJugador;
      int montoInicial=100000;
      double montoApuesta;
      double montoTotal;
      //instanciar clase 
        Scanner Registro=new Scanner(System.in);
        //solicitar datos
        System.out.println("Digite su nombre ");
        nombreJugador=Registro.next();
        System.out.println("Hola " +nombreJugador + "tu monto incial es de " +montoInicial);
        montoInicial=Registro.nextInt();
        System.out.println("Digite el valor que quiere apostar ");
        montoApuesta=Registro.nextDouble();
        System.out.println("Digite cara o sello ");
        String eleccion=Registro.nextLine();
        montoTotal=montoApuesta-montoInicial;

         //crear condicion 
         if(montoApuesta>montoInicial){
            System.out.println("Usted no puede ingresar mas de " +montoInicial);
            } else if(montoTotal==montoInicial){
               System.out.println("Usted a perdido el monto de "+montoTotal);
         }
         //generador de numeros
         Random rand=new Random();
         int resultadoLanzamiento=rand.nextInt (2); 
         String resultadoJuego;
         //crear condicion
         if (resultadoLanzamiento==0){
            resultadoJuego= "cara" ;
         } else {
            resultadoJuego="sello";

         }
         if (eleccion.equalsIgnoreCase(resultadoJuego)) {
            System.out.println("Ganasta la moneda cayo en " +resultadoJuego+ " y la maquina perdio ");
         }else {
            System.out.println("Perdiste la moneda cayo en " +resultadoJuego+ " y la maquina gano ");
         }
         //limpiar bufer
         Registro.close();
    }
    
}
