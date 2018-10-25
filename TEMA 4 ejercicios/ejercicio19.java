public class ejercicio19{
  public static void main(String[] args){
    
    int n;
    int digitos = 0;
    
    System.out.print("Introduzca un numero entero de maximo 5 cifras: ");
    n = Integer.parseInt(System.console().readLine());
    

    if (n<10){
      digitos = 1;
    }
    
    if ((n<100)&&(n>10)){
      digitos = 2;
    }
    if ((n<1000)&&(n>100)){
      digitos = 3;
    }
    
    if ((n<10000)&&(n>1000)){
      digitos = 4;
    }
    if(n>=10000){
      digitos = 5;
    }
    System.out.println("Su numero tiene "+digitos+" cifras.");
  }
}
      
    
