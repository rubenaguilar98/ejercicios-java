public class ejercicio23{
  public static void main(String[] args){ 
    
    int num;
    int suma = 0;
    int contador = 0;
    
    System.out.println("Vaya introduciendo numeros hasta que la suma deellos supere 1000");
    
    while(suma <=1000){
      num = Integer.parseInt(System.console().readLine());
      suma += num;
      contador++;
    }
    System.out.println("Total acumulado: "+suma);
    System.out.println("Contador: "+contador);
    System.out.println("Media: "+suma / contador);
  }
}
    

