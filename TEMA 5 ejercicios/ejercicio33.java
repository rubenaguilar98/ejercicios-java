public class ejercicio33{
  public static void main(String[] args){
    
    System.out.println("Introduce una altura: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce un caracter: ");
    String caracter = System.console().readLine();
    
    System.out.println("------------------------------");
    
    int h = 1;
    int espacios = altura -1;
    
      for(int n=1;n<altura;n++){
        System.out.print(caracter);
        
        for(int i = 2;i<altura;i++){
          System.out.print(" ");
      }
      System.out.println(caracter);
    }
   System.out.print(" ");
   
      for(int j=2;j < altura;j++){
      System.out.print(caracter);
      }
    
  }
}
