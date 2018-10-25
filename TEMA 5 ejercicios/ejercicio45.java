public class ejercicio45 {
  public static void main(String[] args) {
    
      //Escribe un programa que cambie un dígito dentro de un número dando la
      //posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha
      //empezando por el 1. Se recomienda usar long en lugar de int ya que el
      //primero admite números más largos. Suponemos que el usuario introduce
      //correctamente los datos.

    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());
    
    System.out.print("Introduzca la posición dentro del número: ");
    long posicion = Long.parseLong(System.console().readLine());

    System.out.print("Introduzca el nuevo dígito: ");
    long digito = Long.parseLong(System.console().readLine());

    long numero = numeroIntroducido;

    int longitud = 0; // calcula la longitud del número
      do {
        numero /= 10;
        longitud++;
      } while (numero > 0);

      long parteIzquierda = numeroIntroducido / (long)(Math.pow(10, longitud - posicion + 1));  // parte izquierda con el dígito nuevo
      
        parteIzquierda = parteIzquierda * 10 + digito;

      long parteDerecha = numeroIntroducido % (long)(Math.pow(10, longitud - posicion)); // parte derecha

        numero = parteIzquierda * (long)(Math.pow(10, longitud - posicion))+ parteDerecha; // resultado
        
        System.out.print("El número resultante es " + numero);
  }
}
 
