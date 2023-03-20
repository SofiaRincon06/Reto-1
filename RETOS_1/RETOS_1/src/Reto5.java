import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        //declrar variables 
        String nombreCajero;
        String nombreCliente;
        int documentoCliente;
        int numeroProductos=0;
        double precioProducto=0;
        String nombreProdcuto;
        int productosRegistrados = 0;   
        double totalCompra=0;
        double iva=0;
        //instanciar clase 
        Scanner Registro=new Scanner(System.in);
        //solicitar datos
        System.out.println("Ingrese su nombre cajero ");
        nombreCajero=Registro.next();
        System.out.println("Ingrese el nombre del cliente ");
        nombreCliente=Registro.next();
        System.out.println("Ingrese el N° de documento del cliente ");
        documentoCliente=Registro.nextInt();
        System.out.println("Ingrese el N° de prodcutios que desea llevar el cliente  ");
        numeroProductos=Registro.nextInt();
        //crear bluce 
       while (productosRegistrados<numeroProductos){
        System.out.println("Ingrese el nombre del prodcuto que lleva ");
        nombreProdcuto=Registro.next();
        System.out.println("Ingrese el valor del producto ");
        precioProducto=Registro.nextInt();
        //sentencia
        totalCompra=precioProducto+totalCompra;
        productosRegistrados=productosRegistrados+1;
       }
       //operaciones 
       iva=totalCompra*0.19;
       totalCompra=totalCompra+iva;
       //imprimir los resultados 
       System.out.println("El nombre del cajero es: " +nombreCajero);
       System.out.println("El nombre del cliente es: " +nombreCliente);
       System.out.println("El N° de documento del cliente es : " +documentoCliente);
       System.out.println("El total de su compra fue " +totalCompra+ " Gracias por su compra =) ");
       //limpiar bufer 
       Registro.close();
    }
}
