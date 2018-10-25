public class ejercicio21{
  public static void main (String[] args){
    
  double nota1;
  double nota2;
   System.out.println("Introduzca la nota del primer examen:");
   nota1= Double.parseDouble(System.console().readLine());
   
   System.out.println("Introduzca la nota del segundo examen:"); 
   nota2= Double.parseDouble(System.console().readLine());
     
     double media = ((nota1 + nota2)/2);
     
      if (media >= 5) {
      System.out.println("La media del primestre es : " + media);
      }else{
      System.out.println("La media es menor que 5, esta suspenso");
    }
  }
}

