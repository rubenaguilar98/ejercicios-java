public class ejercicio20{
  public static void main(String[] args){
    
    System.out.println("Introduce la altura: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce el caracter: ");
    String caracter = System.console().readLine();
    
    int h=1;
    int n=0;
    int espacios = altura-1;
    
    while (h<=altura){
      for(n=1; n<=espacios;n++){
        System.out.print(" ");
      }
      System.out.print(caracter);
      
      for(n=1;n<=(h*2-3);n++){
        if(h<altura){ //PREGUNTAR
        System.out.print(" ");
        }else{
        System.out.print(caracter);
        }
      }
      
      if(h!=1){
      System.out.print(caracter);
      }
        
      
      System.out.println();
      h++;
      espacios--;
    }
  }
}
    
    
