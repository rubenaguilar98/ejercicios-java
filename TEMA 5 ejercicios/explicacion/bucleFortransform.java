public class bucleFortransform{
  public static void main (String[] args){
    int acumulador=0;
    int sumando;

    
    System.out.print ("Dime cuantos numeros quieres que escriba");
    int numSumandos = Integer.parseInt(System.console().readLine());
    
  
    
    //for(int i=1; i <= laVoluntad; i++){
    
    int i = 0;
    while(i<numSumandos){
      System.out.println("Introduzca el sumando n1" +(i+1)+ ": ");
      sumando = Integer.parseInt(System.console().readLine());
      acumulador += sumando;
      i++;
    }
    System.out.print("La suma de los " +numSumandos+"numeros introducidos es: "+acumulador);
  }
}
