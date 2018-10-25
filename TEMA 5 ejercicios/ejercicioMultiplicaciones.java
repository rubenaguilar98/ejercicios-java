public class ejercicioMultiplicaciones{
  public static void main(String[] args){
    
    int numero;
    System.out.println("Introduce un numero");
    numero = Integer.parseInt(System.console().readLine());
    
    for(int i=1; i>0;i++){
      if ((numero >=0)&&(i < 16)){
      System.out.println(+numero+"*"+i+ " = " +numero*i);
      }
    }
  }
}
