public class ejercicio36{
  public static void main(String[] args) {

 //Escribe un programa que diga si un número introducido por teclado es o no
 //capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
 //Programa debe aceptar números de cualquier longitud siempre que lo permita
 //el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
 //long en lugar de int ya que el primero admite números más largos.

  System.out.println("Introduce un numero: ");
  long numeroIntroducido = Integer.parseInt(System.console().readLine());
  
  long numero = numeroIntroducido;
  long volteado = 0;
  
  while(numero>0){
    volteado = (volteado * 10)+(numero % 10);
    numero /= 10;
  }
  
  if (volteado == numeroIntroducido){
    System.out.println("El numero "+numeroIntroducido+" es capicuo");
  }else{
      System.out.println("El numero "+numeroIntroducido+" no es capicuo");
    }
  }
}
  
  
