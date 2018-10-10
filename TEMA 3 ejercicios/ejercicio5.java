import java.util.Scanner;
public class ejercicio5 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);

    double b;
    double h;
    String linea;
    
    System.out.print("Introduzca la base del rectangulo : ");
    linea = System.console().readLine();
    b = Double.parseDouble( linea );
    
    System.out.print("Introduzca la altura del rectangulo: ");
    linea = System.console().readLine();
    h = Double.parseDouble( linea );
    
    System.out.println("El area del rectangulo es = " + (b*h));
  }
}
