public class ejercicio10{
  public static void main(String[] args){
    
    double n = 0;
    double suma = 0;
    int cantidad = 0;
    
    System.out.println("Introduzca la nota de los examenes(Para terminar intoduzca un numero negativo)");
  
    while (n>=0){
      n = Double.parseDouble(System.console().readLine());
      suma += n;
      cantidad++;
    }
    System.out.println("media :"+(suma-n)/(cantidad-1));
      
    
  }
}
    
    
      
    
