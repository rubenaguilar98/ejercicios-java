public class ejercicio3 {
  public static void main(String[] args) {

    System.out.print("Introduza un numero del 1 al 7 para indicar el dia de la semana correspondiente: ");
    int n = Integer.parseInt(System.console().readLine());
    
    String diaSemana;
    
    switch (n) {
      case 1:
        diaSemana= "lunes";
        System.out.println("Lunes");
        break;
      case 2:
        diaSemana= "martes";
        System.out.println("Martes");
        break;
      case 3:
        diaSemana= "miercoles";
        System.out.println("Miercoles");
        break;
      case 4:
        diaSemana= "jueves";
        System.out.println("Jueves");
        break;  
      case 5:
        diaSemana= "viernes";
        System.out.println("Viernes");
        break;
      case 6:
        diaSemana= "sabado";
        System.out.println("Sabado");
        break;
      case 7:
        diaSemana= "domingo";
        System.out.println("Domingo");
        break;
      default:
        System.out.println("Valor erroneo,por favor,intruduza un numero del 1 al 7");
      }
  }
}
