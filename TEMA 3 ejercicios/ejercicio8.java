import java.util.Scanner;
public class ejercicio8 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int hT ;
    String linea;
    
    System.out.println("Introduzca el numero de horas trabajadas esta semana; ");
    linea = System.console().readLine();
    hT = Integer.parseInt ( linea );
     
     System.out.printf("El salario correspondiente de esta semana es de: %s euros \n" , (hT*12));
  }
}

