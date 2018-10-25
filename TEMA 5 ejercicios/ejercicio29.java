public class ejercicio29{
  public static void main(String[] args){
    
    int menores;
    int indivisible;
    
    System.out.println("Introduce un numero entero positivo :");
    menores = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce otro numero entero positivo :");
    indivisible = Integer.parseInt(System.console().readLine());
    
    System.out.println("_________________________");
    
      for(int i=menores;i>0;i--){
        if (i%indivisible == 0){
          System.out.println(i);
        }
      }
  }
}
