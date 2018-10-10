public class ejercicio7{
  public static void main(String[] args){

    int pass;
    int oportunidad = 4;
    boolean adivinada = false;
    
    do{
      System.out.println("Introduzca la contraseña:");
      pass = Integer.parseInt(System.console().readLine());
      
      if (pass == 4321){
        adivinada = true;
      }else{
        System.out.println("Contraseña fallida");
      
      oportunidad--;
      
      System.out.println("Le quedan "+oportunidad+" intentos.");
    }
      
    }while ((oportunidad > 0) && (!adivinada));
    
    if (adivinada){
      System.out.println("Acceso permitido");
    }else{
      System.out.println("Ha agotado el numero de intentos.");
    }
      
    
  }
}
