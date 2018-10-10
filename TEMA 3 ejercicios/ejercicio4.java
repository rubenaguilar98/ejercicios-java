import java.util.Scanner;
public class ejercicio4 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);

    int a;
    int b;
    String linea;
    
    System.out.print("Introduzca el primer numero: ");
    linea = System.console().readLine();
    a = Integer.parseInt( linea );
    
    System.out.print("Introduzca el segundo numero: ");
    linea = System.console().readLine();
    b = Integer.parseInt( linea );
    
    System.out.println("x = " + a);
    System.out.println("y = " + b);
    System.out.println( "x + y = " + (a + b));
    System.out.println( "x - y = " + (a - b));
    System.out.println( "x * y = " + (a * b));
    System.out.println( "x / y = " + (a / b));
    
  }
}
