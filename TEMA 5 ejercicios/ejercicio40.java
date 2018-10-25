public class ejercicio40{
  public static void main(String[] args){
    
    //Realiza un programa que pinte por pantalla un rombo hueco hecho con
    //asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
    //sea un número impar
  
  
  System.out.print("Por favor, introduzca la altura del rombo: ");
  int alturaIntroducida = Integer.parseInt(System.console().readLine());
  
  int espaciosInternos = 0;
  int espaciosPorDelante = alturaIntroducida / 2;
  
    if ((alturaIntroducida < 3) || (alturaIntroducida % 2 == 0)) {
      System.out.print("Datos incorrectos. Debe introducir una altura impar mayor o igual a 3");
    } else {
    int altura = 1;

      while (altura <= alturaIntroducida / 2 + 1) { // parte de arriba 

        for (int i = 1; i <= espaciosPorDelante; i++) { // inserta espacios delante
          System.out.print(" ");
        }
    
        System.out.print("*"); // pinta la línea
        for (int i = 1; i < espaciosInternos; i++) {
          System.out.print(" ");
        }
        if (altura>1) {
          System.out.print("*");
        }

        System.out.println();
        altura++;
        espaciosPorDelante--;
        espaciosInternos+=2;
      } 

      // parte de abajo
      espaciosInternos = alturaIntroducida - 3;
      espaciosPorDelante = 1;
      altura = 0;

      while (altura < alturaIntroducida / 2) {
    
        for (int i = 1; i <= espaciosPorDelante; i++) {    // inserta espacios delante
          System.out.print(" ");
        }
          System.out.print("*");// pinta la línea

        for (int i = 1; i < espaciosInternos; i++) {
          System.out.print(" ");
        }
        if(altura < alturaIntroducida / 2 - 1) {
        System.out.print("*");
        }
        System.out.println();
        altura++;
        espaciosPorDelante++;
        espaciosInternos -= 2;

      } 
    } 
  }
}
