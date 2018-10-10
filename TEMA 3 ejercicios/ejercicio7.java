import java.util.Scanner;
public class ejercicio7 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    double p1;
    double p2;
    double p3;
    double p4;
    double p5;
    String linea;
    
    System.out.print("Introduzca el precio correspondiente en cada casilla de cada producto, si sobran casillas dele valor 0, Gracias ");
    linea = System.console().readLine();
    
    System.out.print("Producto 1: " );
    linea = System.console().readLine();
    p1 = Double.parseDouble( linea );
    
    System.out.print("Producto 2: " );
    linea = System.console().readLine();
    p2 = Double.parseDouble( linea );

    System.out.print("Producto 3: " );
    linea = System.console().readLine();
    p3 = Double.parseDouble( linea );

    System.out.print("Producto 4: " );
    linea = System.console().readLine();
    p4 = Double.parseDouble( linea );
    
    System.out.print("Producto 5: " );
    linea = System.console().readLine();
    p5 = Double.parseDouble( linea );
    
    System.out.printf("El total de su factura con el IVA incluido es: " + (p1 + p2 + p3 + p4 + p5)*1.21 );
    
    

  }
}
