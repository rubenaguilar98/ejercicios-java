import java.util.Scanner;
public class ejercicio10 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    double mb;
    String linea;
    
    System.out.print("Intruce el numero de Mb a covertir: ");
    linea = System.console().readLine();
    mb = Double.parseDouble( linea );
    
    int resultado = (int)(mb*1024);
    
    System.out.printf("%.2f Mb equivalen a %s Kb \n", mb, resultado );
    linea = System.console().readLine();
    resultado = Integer.parseInt( linea );
  }
}
