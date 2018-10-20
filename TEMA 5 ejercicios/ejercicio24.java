public class ejercicio24{
  public static void main(String[] args){
    
    
    System.out.println("Introduce un numero: ");
    int n = Integer.parseInt(System.console().readLine());
    
    int h = 1;
    int i;
    int espacios = n -1;
    
    
    while(h <= n){
      
      //insertar ESPACIOS:
      
      for(i = 1; i<=espacios;i++){
      System.out.print(" ");
    }
      //pinta la linea de numeros o caracteres:
      
      for(i=1;i < h; i++){
        System.out.print(i);
      }
      for(i=h;i > 0; i--) {
        System.out.print(i);
      }
      
      System.out.println();
      
      h++;
      espacios--;
    }

  }
}
