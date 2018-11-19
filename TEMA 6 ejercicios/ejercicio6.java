public class ejercicio6{
  public static void main(String[] args){
    
    //Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe
    //adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido, el
    //programa dirá cuántas oportunidades quedan y si el número introducido es menor o
    //mayor que el que ha pensado.
    
    int numeroIntroducido = 0;
    int numeroAdivinar = (int)(Math.random()*101);
    int intentos = 4;
    
    System.out.println(numeroAdivinar);
    
    
    for(int i = 0; i<5;i++){
      System.out.println("Introduce un numero de 0 al 100 e intenta adivinar la contraseña");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      if(numeroIntroducido == numeroAdivinar){
        System.out.println("HAS ADIVINADO EL NUMERO ENHORABUENA");
        i = 5;
      }else{
        System.out.println("Has fallado, te quedan : "+intentos+" intento/s");
        if(numeroIntroducido < numeroAdivinar){
        System.out.println("El numero a adivinar es mayor");
        }
        if(numeroIntroducido > numeroAdivinar){
          System.out.println("El numeroa  adivinar es menor");
        }
      }
      intentos--;
    }
  }
}
      
      
