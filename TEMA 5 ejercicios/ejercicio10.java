public class ejercicio10{
  public static void main(String[] args){
    
    double acumulador = 0;
    double valor;
    int conteo = 0;
    double media;
    
    System.out.println("Introduce un valor(negativo para terminar)");
    valor = Integer.parseInt(System.console().readLine());
  
    do{
    acumulador += valor;
    conteo++;
    System.out.println("Introdduce un valor(negativo para terminar)");
    valor = Integer.parseInt(System.console().readLine());
    
      
    }while(valor >= 0);
    media = acumulador/conteo;
    System.out.println("La media de las nota es : "+media);
    
  }
}
    
  
    
      
    
