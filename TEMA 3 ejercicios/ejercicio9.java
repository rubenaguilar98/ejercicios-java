import java.util.Scanner;
public class ejercicio9 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    double r;
    double h;
    String linea;
    
    System.out.println("Introduzca el valor de r:");
    linea = System.console().readLine();
    r = Double.parseDouble( linea );
    
    System.out.println("Introduzca el valor de h");
    linea = System.console().readLine();
    h = Double.parseDouble( linea );
    
    double v = (double)((3.14*r*r*h)/3);
  
        System.out.printf("El volumen es: %.3f \n ", v);
    linea = System.console().readLine();
    v = Double.parseDouble( linea );
  }
}
    
    
    
