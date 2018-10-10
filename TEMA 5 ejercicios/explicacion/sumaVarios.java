public class sumaVarios{
  public static void main (String[] args){
    int acumulador = 0;
    int sumando;
    System.out.println("Introduzca el numero de numeros que quiera sumar: ");
    int numSumandos = Integer.parseInt(System.console().readLine());
    
    for (int i=1; i<=numSumandos; i++){
      System.out.println("Introduzca el sumando nº"+ i +": ");
      sumando = Integer.parseInt(System.console().readLine());
      acumulador += sumando;
      
    }
    System.out.print("La suma de los" +numSumandos+ "numeros introducidos es: "+acumulador);
  }
}
      
