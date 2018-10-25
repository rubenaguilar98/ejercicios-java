public class ejercicio38{
  public static void main(String[] args) {
  
  //Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El
  //programa debe pedir la altura. Se debe comprobar que la altura sea un número
  //impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.

  System.out.print("Por favor, introduzca la altura del reloj de arena: ");
  int alturaIntroducida = Integer.parseInt(System.console().readLine());
  
  int altura = 1;
  int asteriscos = alturaIntroducida;
  int espaciosPorDelante = 0;
  
    if ((alturaIntroducida < 3) || (alturaIntroducida % 2 == 0)) {
    System.out.print("Datos incorrectos. Debe introducir una altura impar mayor o igual a 3");
  
    } else {

      while (altura < alturaIntroducida / 2 + 1) {       // parte de arriba 

        for (int i = 1; i <= espaciosPorDelante; i++) { // inserta espacios delante
        System.out.print(" ");
        }
        

        for (int i = 0; i < asteriscos; i++) {  // pinta la línea
        System.out.print("*");
        }
        System.out.println();
        altura++;
        espaciosPorDelante++;
        asteriscos -= 2;
      } 
      
      // parte de abajo 

      espaciosPorDelante = alturaIntroducida / 2;

      altura = 1;
    
      while (altura <= alturaIntroducida / 2 + 1) { 

        for (int i = 1; i <= espaciosPorDelante; i++) {  // inserta espacios delante
        System.out.print(" ");
        }
      

        for (int i = 0; i < asteriscos; i++) {  // pinta la línea
        System.out.print("*");
        }
      
        System.out.println();
        altura++;
        espaciosPorDelante--;
        asteriscos += 2;
      } 
    } 
  }
}
