public class ejercicio9{
  public static void main(String[] args){
    
    int n;
    int cifras = 1;
    
    System.out.println("Introduce un numero: ");
    n = Integer.parseInt(System.console().readLine());
    
    while(n > 10){
    
    n /=10;
    cifras++;
  }
  
    System.out.println("El numero tiene: " +cifras+" cifras");
  }
}

    
    
    
