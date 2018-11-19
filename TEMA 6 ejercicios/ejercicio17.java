public class ejercicio17 {
 public static void main(String[] args) {

   int filas = 0;
   int columnas = 0;


   System.out.print("Introduzca la altura: ");
   int altura = Integer.parseInt(System.console().readLine());

   System.out.print("Introduzca la anchura: ");
   int anchura = Integer.parseInt(System.console().readLine());

   int coordenadaFilas = (int)(Math.random()*(altura-2)+2);
   int coordenadaColumnas = (int)(Math.random()*(anchura-2)+2);

   for (filas = 1; filas <= altura; filas++) {
     for (columnas = 1; columnas <= anchura; columnas++) {

       if ((filas == 1) || (filas == altura)) {
         System.out.print("*");
       } else if ((columnas == 1) || (columnas==anchura)) {
         System.out.print("*");
       } else if ((coordenadaFilas == filas) && (coordenadaColumnas == columnas)) {
         System.out.print("&");
       } else {
         System.out.print(" ");
       }
     }
     System.out.println("");
   }
 }
}

