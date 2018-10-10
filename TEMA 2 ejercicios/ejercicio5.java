public class ejercicio5 {
  public static void main(String[] args) {
    int peseta = 500;
    double euro = peseta/166.386;
    
    System.out.printf( peseta + " pesetas son " + euro + " euros");
  }
}

public class test{
  public static void main(String[] args) {
    int numero1;
    int numero2;
    int resultado;
    String lineaDeEntrada;
    
    System.out.println ("Introduzca los dos numeros que quiera sumar: ");
    lineaDeEntrada = System.console().readLine();
    numero1 = Integer.parseInt (lineaDeEntrada);
    
    
    System.out.println ("Introduzca los dos numeros que quiera sumar: ");
    lineaDeEntrada = System.console().readLine();
    numero2 = Integer.parseInt (lineaDeEntrada);
    
    System.out.printf("numero1 = %d + numero2 = %d\n",numero1,numero2);
    
    resultado = numero1 + numero2;
    System.out.println("La suma de los numeros es " +resultado);
    
  }
}
