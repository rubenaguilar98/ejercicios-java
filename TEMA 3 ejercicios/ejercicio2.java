import java.util.Scanner;
public class ejercicio2 {
  public static void main (String[] args) {
    double pesetasEuros = 166.386; //Pongo a y b para ahorrar espacio
    double eur;
    
    Scanner s = new Scanner(System.in); //Pongo s para ahorrar poner palabras
    
    System.out.println ("Euros: ");
    
    eur = Double.parseDouble(s.nextLine());
    
    int resultado = (int)(eur*pesetasEuros);
    
    
    System.out.printf("%.2f Euros son: %d pesetas",eur,resultado);
    
  }
}
    
