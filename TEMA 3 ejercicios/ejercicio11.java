import java.util.Scanner;
public class ejercicio11 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in); //no es necesario poner el scanner y System.console().readLine(); con solo uno basta | s.nextDouble(); |
    
    int kb;
    String linea;
    
    System.out.print("Intruce el numero de Kb a covertir: ");
    linea = System.console().readLine();
    kb = Integer.parseInt( linea );
    
    double resultado = (double)(kb/1024);
    
    System.out.printf("%s Kb equivalen a %.2f Mb \n", kb, resultado );
    linea = System.console().readLine();
    resultado = Double.parseDouble( linea );
  }
}

