public class ejercicioclasemaestro{
  public static void main(String[] args);{
    System.out.println("Introduzca un numero de 0 a 99: ");
    String s = System.console().readLine();
    int numero = Integer.parseInt(s);
    
    StringnumeroTexto= "" ;
    
    switch (numero/10) {
      case 0
        break;
      case 1
        numeroTexto= "diez";
        break;
      case 2
        numeroTexto = "veinte";
        break;
        
      case 3
        numeroTexto = "treinta";
        break;
      case 4
        numeroTexto = "cuarenta";
        break;
      case 5
        numeroTexto = "cincuenta";
        break;
      case 6
        numeroTexto = "sesenta";
        break;
      case 7
        numeroTexto = "setenta";
        break;
      case 8
        numeroTexto = "ochenta";
        break;
      case 9
        numeroTexto = "noventa";
        break;
      default:
      
    }
    
    if (numero > 10) {
      numeroTexto = numeroTexto + " y";
    
    switch (numero%10){
    
    case 1
    numeroTexto = numeroTexto + "uno";
      break;    
    case 2
    numeroTexto = numeroTexto + "dos";
      break;
    case 3
    numeroTexto = numeroTexto + "tres";
      break;    
    case 4
    numeroTexto = numeroTexto + "cuatro";
      break;    
    case 5
    numeroTexto = numeroTexto + "cinco";
      break;
    case 6
    numeroTexto = numeroTexto + "seis";
      break;    
    case 7 
    numeroTexto = numeroTexto + "siete";
      break;  
    case 8 
    numeroTexto = numeroTexto + "ocho";
      break;
    case 9 
    numeroTexto = numeroTexto + "nueve";
      break;
    
    default:
    }
    System.out.println(numeroTexto);
  }
}
    

  
  
