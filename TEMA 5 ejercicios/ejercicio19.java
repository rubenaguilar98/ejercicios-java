public class ejercicio19{
  public static void main (String[] args){
    
    int altura;

    
    System.out.println("Introduce la altura");
    altura =  Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce el caracter: ");
    String caracter = System.console().readLine();
    
    int h = 1;
    int n = 0;
    int espacios = altura-1;
    
    while (h<=altura){
      
      for (n =1; n <= espacios; n++){
      System.out.print(" ");
      }
    
      for(n=1; n<h*2;n++){
      System.out.print(caracter);
      }
    
    System.out.println();
    
    h++;
    espacios--;
    }
  }
}

