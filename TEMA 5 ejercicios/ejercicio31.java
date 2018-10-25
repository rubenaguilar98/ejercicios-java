public class ejercicio31{
  public static void main(String[] args){
    
    int altura;
    System.out.println("Introduce una altura");
    altura = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce un caracter :" );
    String caracter = System.console().readLine();
    System.out.println("-----------------------------");
    
    int h = 0;
    int contador;
    
    while(h<=altura){
      for(int i = 1;h!=altura;i++){
      h++;
      System.out.println(caracter);
        if(h==altura){
          for(int n = 1;n<=(altura/2+1);n++){
          System.out.print(caracter);
          }
        }
      }
    }
  }
}

     
