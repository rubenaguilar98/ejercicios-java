public class ejercicio22{
  public static void main (String[] args){
    
    System.out.println("Este programa muestra los numeros primos entre 2 y 100 ambos incluidos");
    
    boolean esPrimo;
    
      for (int i =2;i<=100;i++){
        esPrimo = true;
      
        for(int j=2;j<i;j++){
        
          if((i%j)==0){
          esPrimo = false;
          }
        } 
        if (esPrimo){
        System.out.println(i);
        }
      }
  }
}
