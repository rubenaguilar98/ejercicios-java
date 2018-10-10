public class bucleDowhile{
  public static void main (String[] args){
    int acumulador = 0;
    int sumando;

    do{
      System.out.println("Introduzca el sumando (1 para terminar): ");
      sumando = Integer.parseInt(System.console().readLine());
      if (sumando != 1){     //Para que despues no se sume el uno y altere el resultado
      acumulador += sumando;
    }
      
    }while (sumando != 1);
    System.out.print("La suma de los numeros introducidos es: "+acumulador);
  }
}
      

