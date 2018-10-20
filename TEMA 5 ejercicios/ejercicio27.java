public class ejercicio27{
  public static void main(String[] args){
    
    int n;
    int cuenta = 0;
    int suma = 0;

    
    System.out.println("Introduce un numero como tope : ");
    n = Integer.parseInt(System.console().readLine());
    
    for (int i=1; i < n;i++){
      if (( i % 3 ) == 0){
      System.out.println(i + " ");
      cuenta++;
      suma +=i;
    }
  }
  
  System.out.print("Desde 1 hasta "+n+ " hay "+cuenta);
  System.out.println(" multiplos de 3 y suman :"+suma);




  }
}
