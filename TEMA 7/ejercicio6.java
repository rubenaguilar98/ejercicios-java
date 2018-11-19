public class ejercicio6{
  public static void main(String[] args) {
    
    //Escribe un programa que lea 15 números por teclado y que los almacene en un
    //array. Rota los elementos de ese array, es decir, el elemento de la posición 0
    //debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
    //la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
    //del array.
    
    int[] numero = new int[15];
    int i;
    
    System.out.println("Vaya introduciendo numeros enteros y pulsando intro: ");  
    
    for(i=0;i<15;i++){
      numero[i]= Integer.parseInt(System.console().readLine());
    }
    System.out.println();
    
    System.out.println("Lugar de posicion( desde 0 )");
    
    for(i=0;i<15;i++){ //lugar de posicionamiento
    }
    for(i=0;i<75;i++){  //PINTA UNA LINEA DE SEPARACION
      System.out.print("-");
    }
    System.out.println();
    System.out.println("Array original");
    System.out.print(" |");
    for(i=0;i<15;i++){
      System.out.print(numero[i]+" ");
    }
    System.out.println("| ");
    int aux = numero[14];
    for(i = 14;i > 0; i--){
      numero[i]=numero[i-1];
    }
    numero[0]=aux;
    
    System.out.println("Array rotado a la derecha una posicion: ");
    for(i= 0; i < 15; i++){
      
    }
    for(i=0;i<75;i++){
      System.out.print("-");
    }
    System.out.println();
    System.out.print(" |");
    for(i=0;i<15;i++){
      System.out.print(" "+numero[i]);
    }
    System.out.println("| ");
  }
}
      

    
