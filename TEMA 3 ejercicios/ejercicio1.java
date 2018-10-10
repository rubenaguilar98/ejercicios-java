import java.util.Scanner;
public class ejercicio1 {
  public static void main (String[] args) {
    int a; //Pongo a y b para ahorrar espacio
    int b;
    
    Scanner s = new Scanner(System.in); //Pongo s para ahorrar poner palabras
    
    System.out.println ("Introduce los valores a multiplicar: ");
    a = Integer.parseInt(s.nextLine());
    
    System.out.println ("Introduce los valores a multiplicar: ");
    b = Integer.parseInt(s.nextLine());
    
    System.out.println("El producto de los dos numeros es: " +(a*b));
    
  }
}
    
    
