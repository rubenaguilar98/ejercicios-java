public class ejercicio26{
  public static void main(String[] args){
    
    int num;
    
    System.out.println("Introduce un muero como tope");
    num = Integer.parseInt(System.console().readLine());
    
    for(int i = 0; i<=num; i+=3){
      System.out.println(i);
    }
  }
}
