public class ejercicio25{
  public static void main(String[] args){
    
    System.out.println("Introduce un numero");
    int numero = Integer.parseInt(System.console().readLine());
    
    int numero2 = numero;
    int alreves = 0;
    
    while(numero2 > 0) {
      alreves = (alreves *10) + (numero2 % 10); //
      numero2 /=10;                             //
    }
    System.out.println(+numero+"|"+alreves);
  }
}
