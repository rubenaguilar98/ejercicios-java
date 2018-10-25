public class ejercicio37{
  public static void main(String[] args) {

 //Realiza un conversor del sistema decimal al sistema de “palotes”.
 

  int num;
  
    do {
      System.out.print("Introduce un número entero positivo: ");
      num = Integer.parseInt(System.console().readLine());
      
    } while (num < 1);                             // Cuenta los números y calcula el reves
      System.out.print(num + " = ");

    int aux = num;
    int numDig = 0;
    int numReves = 0;
    
    while (aux > 0){
    numReves = ((numReves*10) + (aux % 10));
    aux /=10;
    numDig++;
    }
    
    int cifra = 0; 

    for (int i = 0; i < numDig; i++){              // Separa las cifras y escribe los palitos
    cifra = numReves%10;
    numReves /= 10;
    
    for (int j = 0; j < cifra; j++){
    System.out.print("|");
    }
    
      if (i < numDig-1){
      System.out.print("-");
      }
    }
  }
}

  
