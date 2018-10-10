public class ejercicio5 {
  public static void main (String[] args) {
    String linea;
    
    
    double a;
    double b;
    
    System.out.println("Este programa resuelve la ecuacion ax +b = 0");
    System.out.println("Introduzca el valor de a :");
    linea = System.console().readLine();
    a = Double.parseDouble(linea);
    
    
    System.out.println ("Introduzca ahora el valor de b ");
    linea = System.console().readLine();
    b = Double.parseDouble(linea);
    
      if (a > 0 ) {
      System.out.println("x = " +(-b/a));
    
      } else {
      System.out.println ("Esta ecuacion no tiene solucion real");
    }    
  }
}
//ESTE ESTA HECHO CON STRING, A CONTINUACON SIN STRING:
//public class ejercicio5 {
  //public static void main (String[] args) {

    //System.out.println("Este programa resuelve la ecuacion ax +b = 0");
    //System.out.println("Introduzca el valor de a :");
    //double a = Double.parseDouble(System.console().readLine());

    //System.out.println ("Introduzca ahora el valor de b ");
    //double b = Double.parseDouble(System.console().readLine());

      //if (a > 0 ) {
      //System.out.println("x = " +(-b/a));
    
      //} else {
      //System.out.println ("Esta ecuacion no tiene solucion real");
    //}    
  //}
//}
