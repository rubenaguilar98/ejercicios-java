public class ejercicio39{
  public static void main(String[] args) {
  
  //Escribe un programa que pida un número entero positivo por teclado y que
  //muestre a continuación los números desde el 1 al número introducido junto
  //con su factorial.
  
    System.out.println("Introduce un numero entero positivo: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    

    
    for(int n = 1;numeroIntroducido >= n; n++){
      int factorial = n;
    
      for(int i = 1 ;i < n ;i++){
      factorial *= i;
      }
      System.out.println(n+"! : " +factorial);
    }
  }
}






