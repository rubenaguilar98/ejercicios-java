public class ejercicio14 {
  public static void main(String[] args) {
    
    System.out.println("Inserte un numero entero: ");
    int x = Integer.parseInt(System.console().readLine());
    
    
    if (x%2 == 0){
      System.out.println("El numero es par");
    }else{
      System.out.println("El numero es impar");
    }
    if (x%5 == 0){
      System.out.println("El numero es divisible por 5");
    }else{
      System.out.println("El numero no es divisible por 5");
    }
  }
}
