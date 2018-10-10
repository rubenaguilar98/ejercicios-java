public class ejercicio11 {
  public static void main(String[] args) {
    
    System.out.println("Introduce que hora es exactamente, sin los minutos: ");
    int hora = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce ahora los minutos exactos: ");
    int minuto = Integer.parseInt(System.console().readLine());
    
      if (minuto > 59) {
      System.out.println("Introduzca bien los minutos");
      } else if (hora >23){
        System.out.print("Introduzca bien la hora");
      }else{
        
        int resultado = ((24*60-(hora*60+minuto))*60);
        System.out.printf("Para media noche quedan %s segundos ",resultado);

    }
  }
}
