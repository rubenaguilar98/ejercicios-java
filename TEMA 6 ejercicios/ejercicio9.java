public class ejercicio9{
  public static void main(String[] args){
    
  int numero = 0;
  int n = 1;

    for(n = 1;numero != 24;n++){
      numero = (int)(Math.random()*101);
      System.out.println(numero);
    }
    System.out.println("FIN");
    System.out.println("Se han generado " +(n-1)+ " numeros");
  }
}
      
