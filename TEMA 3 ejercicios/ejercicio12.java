import java.util.Scanner;
public class ejercicio12 {
  public static void main(String[] args) {
    String linea;                                       //HECHO CON CONSOLA Y NO POR SCANNER
    
    double n1;
    double nT;
    
    
    System.out.print("Intruce la nota del primer examen: ");
    linea = System.console().readLine();
    n1 = Double.parseDouble(linea);
    
    
    System.out.print("Intruce la nota total deseada : ");
    linea = System.console().readLine();
    nT = Double.parseDouble(linea);
    
    
    double resultado = (double)((nT-(n1*0.4))/0.6);
    
    System.out.printf("La nota necesaria en el segundo examen es: %.2f \n " ,resultado );
    linea = System.console().readLine();
    resultado = Double.parseDouble(linea);
  }
}
