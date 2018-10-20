public class ejercicio11{
  public static void main(String[] args){
    
    int num;
    int contador = 0;
    
    System.out.println("Introduzca un numero entero y se calculara el cuadrado y el cubo de ese mismo numero y sus 4 siguientes enteros");
    num = Integer.parseInt(System.console().readLine());
    
    while (contador<=5){
    
      System.out.println("| "+num+" | " +num*num+ " | " +(num*num)*(num));
      contador++;
      num++;
    }
  }
}

