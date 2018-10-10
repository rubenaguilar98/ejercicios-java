public class ejercicio1 {
  public static void main(String[] args) {
    
    String dia;
    System.out.println("Introduzca el dia de la semana ");
    
    dia = System.console().readLine();
    
    if (dia.equals("lunes")) {
      System.out.println("A primera hora el lunes toca SINF");
      
    }else if (dia.equals("martes")) {
      System.out.println("A primera hora el martes toca PROG");
      
    }else if (dia.equals("miercoles")) {
       System.out.println("A primera hora el miercoles toca EED"); 
       
    }else if (dia.equals("jueves")) {
       System.out.println("A primera hora el jueves toca EED"); 
    }else if (dia.equals("viernes")) {
      System.out.println("A primera hora el viernes toca SINF");
     
    }else{ 
      System.out.println("ERRORRRRRRRRRRRRRRRRRRRRRRRRR"); 
      
    }
  }
}  
