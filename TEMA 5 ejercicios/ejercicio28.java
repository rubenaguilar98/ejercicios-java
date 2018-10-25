public class ejercicio28{
  public static void main(String[] args){
    
    int num;
    
    System.out.println("Introduce un numero para calcular su factorial");
    num = Integer.parseInt(System.console().readLine());
    
    int factorial = num;
    
    for(int i = 1; i<num; i++){
    factorial *=i;
    }
    System.out.println("El resultado es: "+factorial);
  }
}
