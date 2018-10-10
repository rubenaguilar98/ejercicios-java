public class ejercicio6 {
  public static void main  (String[] args) {
    
    double g = 9.81;
    
    System.out.print("Calcular el tiempo que tarda un objeto en caer al suelo");
    System.out.println("Introduzca la altura en metros desde al que cae el objeto; ");
    Double h = Double.parseDouble(System.console().readLine());
    
    double t = Math.sqrt(2*h/g); //para poner raiz : Math.sqrt
    System.out.printf("El tiempo que tarda en caer el objeto es %.2f segundos ",t);
  }
}
