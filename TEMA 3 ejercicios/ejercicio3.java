import java.util.Scanner;
public class ejercicio3 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduce las pesetas a convertir: ");
    
    int pesetas= Integer.parseInt(s.nextLine());
    
    double euros;
    
    euros = (pesetas / 166.386);
    
    System.out.printf( pesetas+ " pesetas son %.2f euros\n", euros);
  }
}
