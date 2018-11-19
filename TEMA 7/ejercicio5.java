public class ejercicio5{
  public static void main(String[] args) {
    
    //Escribe un programa que pida 10 números por teclado y que luego muestre
    //los números introducidos junto con las palabras “máximo” y “mínimo” al lado
    //del máximo y del mínimo respectivamente.
    
  int[] numero = new int[10];

    int maximo = Integer.MIN_VALUE; //BASTANTE UTIL
    int minimo = Integer.MAX_VALUE; //BASTANTE UTIL
    int i;
    
    System.out.println("Vaya introduciendo números enteros y pulsando INTRO:");
    
    for (i = 0; i < 10; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());
      
      if (numero[i] < minimo) {
        minimo = numero[i];
      }
      if (numero[i] > maximo) {
        maximo = numero[i];
      }
    }
    
    System.out.println();
    for (i = 0; i < 10; i++) {
      System.out.print(numero[i]);
      
      if (numero[i] == maximo) {
        System.out.print(" máximo");
      }
      if (numero[i] == minimo) {
        System.out.print(" mínimo");
      }
      System.out.println();
    }
  }
}
