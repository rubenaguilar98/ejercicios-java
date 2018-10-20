public class ejercicio15{
  public static void main(String[] args){
    int base;
    int exponente;
    int exponente2;
    int potencias;
    int contador = 0;
    
    System.out.print("Introduzca la base (entera)");
    base = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca el exponente (entero)");
    exponente = Integer.parseInt(System.console().readLine());

    
      do{
      contador++;
      System.out.println(""+base+"^"+exponente--+"");
      }while (contador <5);
  

  }
}
