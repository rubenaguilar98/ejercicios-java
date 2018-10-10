public class ejercicio8{
  public static void main(String[] args){
    
    int num;
    int veces = 0;
    
      System.out.print("Indtroduce el numero para mostrar su tabla de multiplicar: ");
      num = Integer.parseInt(System.console().readLine());
      
    do{
      veces++;
      System.out.println(num + "x" +veces+ "=" +num * veces);
    }while (veces<= 9);
    }
  }
