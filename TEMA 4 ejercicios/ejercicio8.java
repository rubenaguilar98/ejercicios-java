public class ejercicio8 {
  public static void main(String[] args) {
        System.out.println ("Este programa calcula la media de tres notas: ");
    
    System.out.print("Introduce la primera nota: ");
    Double nota1 = Double.parseDouble(System.console().readLine());
  
    System.out.print("Introduce la segunda nota: ");
    Double nota2 = Double.parseDouble(System.console().readLine());
  
    System.out.print("Introduce la tercera nota: ");
    Double nota3 = Double.parseDouble(System.console().readLine());
  
    double media = (nota1 + nota2 + nota3)/3;

    System.out.printf("La media es: %.2f",media);
    
    if (media < 5) {
    System.out.println(",Insuficiente");
    
    }else if ((media >= 5 )&&(media < 6)){
      System.out.println(",Suficiente");
    }else if ((media >= 6)&&(media < 7)){
      System.out.println(",Bien");
    }else if ((media >= 7)&&(media < 9)){
      System.out.println(",Notable");
    }else{
      System.out.println(",Sobresaliente");
    }
  }
}
