public class ejercicioclase2 {
  public static void main (String[] args){

    
    System.out.println("Introduzca una hora");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca una minuto");
    int minuto =Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca una segundos");
    int segundo = Integer.parseInt(System.console().readLine());
    
    int horaFinal = segundo + 1;
    
    if (hora >= 25){
      System.out.println("Intruduza una hora de 0 a 24");
    }else if (minuto >= 59){
      System.out.println("Intruduza una minuto de 1 a 59");
    }else if (segundo >= 59){
      System.out.println("Intruduza una segundo de 1 a 59");
    }else{
      System.out.printf("Solucion %s h %s minutos %s segundos : ",hora,minuto,horaFinal);
    }
  }
}
    
    
    
    
    
