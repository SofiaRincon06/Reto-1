import java.util.Scanner;

public class Reto2 {
    //crear el metodo 
    public static void main(String[] args) {
        //declracion de varibles 
        int meses=0;
        //instanciar la clase 
        Scanner Registro=new Scanner(System.in);
        //Solicitar datos 
        System.out.println("Digite el peso del bebe en kg");
        //capturar datos 
        Double peso=Registro.nextDouble();
        System.out.println("Digite la edad del bebe en meses");
        meses=Registro.nextInt();
        //operaciones
        Double dosisVacuna=peso+10.0/meses*10*8;
        //imprimir resultados 
        System.out.println("La dosis aplicada es de  " +dosisVacuna+  "ml.");
        //limpiar bufer 
        Registro.close();
    }
}
