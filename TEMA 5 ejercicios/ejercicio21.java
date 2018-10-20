public class ejercicio21{
  public static void main(String[] args){ 
  
    int n = 0;
    int sumaImpar = 0;
    int cantidad = 0;
    int cantidadImpar = 0;
    int maxPar= 0;
    int mediaImpar = 0;
    
    System.out.println("Introduzca numeros(Para terminar intoduzca un numero negativo)");
  
    while (n>=0){
      n = Integer.parseInt(System.console().readLine());
      cantidad++;
      if (n %2 ==1){
        sumaImpar += n;
        System.out.println("Impar");
        cantidadImpar++;
        mediaImpar = sumaImpar/cantidadImpar;
      }else{
        
        if (n> maxPar)
        maxPar = n;
        System.out.println("Par");
      }
    }
    
    System.out.println("Se han introducido: " +(cantidad-1) +" numeros");
    System.out.println("Media impar: "+mediaImpar);
    System.out.println("El Par mas grande es: "+maxPar);
      
    
  }
}
    
    
