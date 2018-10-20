public class ejercicio13{
  public static void main(String[] args){
    
    int num;
     
    int contador = 0;
      
      System.out.println("Introduce hasta 10 numeros y el programa dira si son positivos o negativos");
    
      do{
        num =Integer.parseInt(System.console().readLine());
        if (num > 0){
          System.out.println("Positivo");
          contador++;
          num++;
        }else{
          System.out.println("Negativo");
        }
      }while (contador <10);
        System.out.println("Maximo de numeros alcanzados");

  }
}

  
  
  
  
