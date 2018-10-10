public class ejercicio9 {
  public static void main (String[] args) {
  
    
    System.out.println("Programa para resulver ecuaciones de segundo grado: ax² + bx + c =0 ");
    
    System.out.println("Introduce los valores: ");
    

    
    System.out.print("a = ");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.print("b = ");
    double b = Double.parseDouble(System.console().readLine());
    
    System.out.print(" c = ");
    double c = Double.parseDouble(System.console().readLine());
    
      if ((a == 0) && (b == 0) && (c == 0)) {
      System.out.print("Tiene infinitas soluciones");
      }

  
      if ((a == 0) && (b != 0 ) && (c != 0 )) {
      
      double excepcion1 = (-c/b);
      System.out.print("x1 : " +excepcion1);
      System.out.print(" x2 : " +excepcion1);
    
      }
      if ((a != 0) && (b != 0) && (c == 0)) {
      double excepcion2 = (-b/a);
      System.out.print(" x1 : " +excepcion2);
      System.out.print(" x2 : 0");
      }
      if ((a != 0) && (b != 0) && ( c!= 0)) {
    
      double x1 = (-b + (Math.sqrt(b*b)+(-4*a*c))/(2*a)); //No esta comprobado si da bien
      double x2 = (-b - (Math.sqrt(b*b)+(-4*a*c))/(2*a));
    
      System.out.printf(" x1 = %.2f  ",x1);
      System.out.printf(" x2 = %.2f  ",x2);
      }
  }
}
