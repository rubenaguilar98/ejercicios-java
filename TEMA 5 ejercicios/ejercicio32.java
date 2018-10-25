public class ejercicio32{
  public static void main(String[] args){
    
    System.out.println("Introduzca un numero entero positivo: ");
    long numIntroducido = Integer.parseInt(System.console().readLine());
    
    long numero = numIntroducido;
    long volteado = 0;
    int  longitud = 0;
    
    if(numero == 0){
      longitud = 1;
    }
    while(numero>0){
      volteado = (volteado * 10)+ (numero % 10); //Le da la vuelta al numero y calcula la longitud
      numero /= 10;
      longitud++;
    }
    System.out.print("Numeros pares: ");
    
    int digito;
    int sumaPares=0;
    
    for(int i =0;i<longitud;i++){
      digito =(int)(volteado % 10);
      
      if ((digito % 2)==0){
        System.out.print(digito+" ");
        sumaPares += digito;
      }
      volteado /= 10;
    }
    System.out.println("\nSuma los digitos pares: "+sumaPares);
  }
}
    
    
