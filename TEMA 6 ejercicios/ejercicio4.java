public class ejercicio4{
  public static void main(String[] args){
    
    //Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos)
    //separados por espacios.
    
    int numero;
    
    for(int i = 0;i<=19;i++){
      numero = (int)(Math.random() * 11) + 1;
      System.out.print(numero + " ");
    }
  }
}
      
    
    
