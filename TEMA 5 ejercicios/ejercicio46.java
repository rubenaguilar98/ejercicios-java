public class ejercicio46 {
  public static void main(String[] args) {
    
    //Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
    //asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar
    //que tanto la anchura como la altura sean mayores o iguales que 2, en caso
    //contrario se debe mostrar un mensaje de error.
    
    System.out.print("Por favor, introduzca la anchura del rectángulo (como mínimo 2): ");
    int anchura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Ahora introduzca la altura (como mínimo 2): ");
    int altura = Integer.parseInt(System.console().readLine());
    
    if ((anchura < 2) || (altura < 2)) {
      System.out.print("Lo siento, los datos introducidos no son correctos, ");
      System.out.println(" el valor mínimo para la anchura y la altura es 2.");
    } else {

      for (int i = 1; i <= anchura; i++) {  // Línea superior 
        System.out.print("*");
      }
      
      for (int i = 2; i < altura; i ++) { // Parte intermedia
        System.out.print("\n*");
        for (int espacios = 2; espacios < anchura; espacios++) {
          System.out.print(" ");
        }
          System.out.print("*");
      }

        System.out.println();

      for (int i = 1; i <= anchura; i++) { // Línea inferior
        System.out.print("*");
      }
    } // else
  }
}
