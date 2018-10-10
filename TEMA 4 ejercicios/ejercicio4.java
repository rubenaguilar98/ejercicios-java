public class ejercicio4 {
  public static void main (String[] args) {
    
    System.out.println("Introduzca la cantidad de horas trabajadas esta semana: "); 
    int h = Integer.parseInt(System.console().readLine());
    
    
      if (h <= 40) {
      System.out.println("El sueldo ganado esta semana es de: " +(h*12));
      
      } else { 
      System.out.println("El sueldo ganado esta semana es de: " +((h*16)-160));
    }
  }
}
//ESTE EJERCICIO ESTA HECHO SIN STRING, A CONTINUCAION CON STRING: 
//public class ejercicio4 {
  //public static void main (String[] args) {
    //String linea;
    
    //int h;
    
    //System.out.println("Introduzca la cantidad de horas trabajadas esta semana: ");
    //linea = System.console().readLine();
    //h = Integer.parseInt( linea);
  
      //if (h <= 40) {
      //System.out.println("El sueldo ganado esta semana es de: " +(h*12));
      
      //} else { 
      //System.out.println("El sueldo ganado esta semana es de: " +((h*16)-160));
    //}
  //}
//}
