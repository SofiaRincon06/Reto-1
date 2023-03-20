import java.util.Scanner;

public class Reto1 {
   //crear metodo
    public static void main(String[] args) {
        //instanciar clase 
      Scanner Registro=new Scanner(System.in);
      //solicitar datos
      System.out.print("Ingrese la temperatura que desea en grados Fahrenheit: ");
    //declracion de variables
      Double fahrenheit=Registro.nextDouble();
      Double celsius=(fahrenheit-32) * 5/9;
      //imprimir resultados 
      System.out.println(fahrenheit+  "Los grados Fahrenheit equivale a" +celsius+ "Los grados celsius");
      //limpiar bufer
      Registro.close();

    }
}
