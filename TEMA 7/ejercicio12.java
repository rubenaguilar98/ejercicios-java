public class tatocao{
  public static void main(String[] args){

    //Realiza un programa que pida 10 números por teclado y que los almacene en
    //un array. A continuación se mostrará el contenido de ese array junto al índice
    //(0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
    //“inicial” y “final”. Se debe comprobar que inicial es menor que final y que
    //ambos números están entre 0 y 9. El programa deberá colocar el número de
    //la posición inicial en la posición final, rotando el resto de números para que no
    //se pierda ninguno. Al final se debe mostrar el array resultante.
    
    int[] n = new int[10];
    int[] resultado = new int[10];
    int i;
    int nInicial;
    int nFinal;
    boolean valido;
    System.out.println("Introduzca 10 números separados por INTRO:");
    for (i = 0; i < 10; i++) {
      n[i] = Integer.parseInt(System.console().readLine());
    }
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
  }
}
