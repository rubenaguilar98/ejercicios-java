public class ejercicio17{
  public static void main(String[] args){
    
    int num;
    
      do{
      System.out.println("Introduce un numero entero positivo " );
      num = Integer.parseInt(System.console().readLine());
      
       if(num<0){
       System.out.println("Es necesario que introduzca un numero positivo");
     }
        
      }while (num<0 );
        
        int suma = 0;
        
        for(int i = num; i < num + 100;i++){
          suma +=i;
        }
        System.out.println("La suma de los 100 numeros siguientes a " +num+" es " +suma );
      }
    }
        
        
