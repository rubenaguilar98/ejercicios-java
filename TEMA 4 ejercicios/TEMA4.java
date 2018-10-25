public class TEMA4 {
  public static void main (String[] args) {
    String linea;
    
    System.out.println("Le voy a decir si el nº introducido es apr o impar: ");
    System.out.println("Introduzca el numero: ");
    
    linea = System.console().readLine();
    int numero = Integer.parseInt(linea);
    
    if((numero%2)==0) { //el numero es par
      System.out.printf("El numero %d es par. \n",numero);
    
    }else{
      System.out.printf("El numero %d es impar. \n",numero);
    
    }
  }
}
    
