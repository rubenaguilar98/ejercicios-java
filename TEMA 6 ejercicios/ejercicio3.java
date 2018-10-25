public class ejercicio3{
  public static void main(String[] args){
    

    //Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de
    //48 cartas: 2, 3, 4, 5, 6, 7, 8, 9, sota, caballo, rey y as.
    
        String palo = "";
    String carta = "";
    
    int numeroPalo = (int)(Math.random()*4) + 1;
    
    switch(numeroPalo) {
      case 1:
        palo = "oro";
      break;
      
      case 2:
        palo = "basto";
      break;
      
      case 3:
        palo = "espada";
      break;
      
      case 4:
        palo = "copa";
      default:
      
    }
    
    int numeroCarta = (int)(Math.random()*13) + 1;
    
    switch(numeroCarta) {
      case 1:
        carta = "As";
      break;
      case 11:
        carta = "Sota";
      break;
      case 12:
        carta = "Caballo";
      break;
      case 13:
        carta = "Rey";
      break;
      default:
      carta = String.valueOf(numeroCarta);
    }
      System.out.println(carta + " de " + palo);
  }
}
