public class ejercicio10 {
  public static void main (String[] args) {
    
    String horoscopo = "";
    
    System.out.print("introduce el numero del mes que nació ");
    int mes = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el dia : ");
    int dia = Integer.parseInt(System.console().readLine());
    
    switch(mes) {
      case 1 :
      if (dia < 21) {
        horoscopo = "capricornio";
        System.out.print("capricornio");
      }else{ 
        horoscopo = "acuario";
        System.out.print("acuario");
      }
      break;
      
      case 2 : 
      if (dia <20) {
        horoscopo = "acuario";
        System.out.print("acuario");
      }else{ 
        horoscopo = "piscis";
        System.out.print("piscis");
      }
      break;
      
      case 3 :
      if ( dia < 21 ) {
        horoscopo = "piscis";
        System.out.print("piscis");
      }else{
        horoscopo = "aries";
        System.out.print("aries");
      }
      break;
      
      case 4:
      if (dia < 21 ) {
        horoscopo = "aries";
        System.out.print("aries");
      }else{
        horoscopo = " tauro ";
        System.out.print("tauro");
      }
      break;

      case 5 :
      if (dia < 21) {
        horoscopo = "tauro";
        System.out.print("tauro");
      }else{ 
        horoscopo = "geminis";
        System.out.print("geminis");
      }
      break;
      
      case 6 : 
      if (dia <20) {
        horoscopo = "geminis";
        System.out.print("geminis");
      }else{ 
        horoscopo = "cancer";
        System.out.print("cancer");
      }
      break;
      
      case 7 :
      if ( dia < 21 ) {
        horoscopo = "cancer";
        System.out.print("cancer");
      }else{
        horoscopo = "Leo";
        System.out.print("leo");
      }
      break;
      
      case 8 :
      if (dia < 21 ) {
        horoscopo = "leo";
        System.out.print("leo");
      }else{
        horoscopo = " virgo ";
        System.out.print("virgo");
      }
      break;

      case 9 :
      if (dia < 21) {
        horoscopo = "virgo";
        System.out.print("virgo");
      }else{ 
        horoscopo = "libra";
        System.out.print("libra");
      }
      break;
      
      case 10 : 
      if (dia <20) {
        horoscopo = "libra";
        System.out.print("libra");
      }else{ 
        horoscopo = "escorpio";
        System.out.print("escorpio");
      }
      break;
      
      case 11:
      if ( dia < 21 ) {
        horoscopo = "escorpio";
        System.out.print("escorpio");
      }else{
        horoscopo = "sagitario";
        System.out.print("sagitario");
      }
      break;
      
      case 12:
      if (dia < 21 ) {
        horoscopo = "sagitario";
        System.out.print("sagitario");
      }else{
        horoscopo = "capricornio ";
        System.out.print("capricornio");
      }
      break;
      default:
      
      System.out.println("Su horoscopo es : " +horoscopo);
    }
  }
}
  
  
