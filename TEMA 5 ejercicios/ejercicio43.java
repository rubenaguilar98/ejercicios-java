public class ejercicio43 {
  public static void main(String[] args) {
    
    //Escribe un programa que permita partir un número introducido por teclado en
    //dos partes. Las posiciones se cuentan de izquierda a derecha empezando por
    //el 1. Suponemos que el usuario introduce correctamente los datos, es decir,
    //el número introducido tiene dos dígitos como mínimo y la posición en la que
    //se parte el número está entre 2 y la longitud del número. No se permite en
    //este ejercicio el uso de funciones de manejo de String (por ej. para extraer
    //subcadenas dentro de una cadena).
  
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());
    
    System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
    long posicion = Long.parseLong(System.console().readLine());
    
    long numero = numeroIntroducido;
                                                  // calcula la longitud del número
    int longitud = 0;
    
    do {
      numero /= 10;
      longitud++;
    } while (numero > 0);
      
      long parteIzquierda = numeroIntroducido / (long)(Math.pow(10, longitud - posicion + 1)); // parte izquierda
      
      long parteDerecha = numeroIntroducido % (long)(Math.pow(10, longitud - posicion + 1)); // parte derecha
      
        System.out.print("Los números partidos son el " + parteIzquierda + " y el " + parteDerecha + ".");
  }
}
