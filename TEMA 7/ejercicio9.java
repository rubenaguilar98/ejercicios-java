public class ejercicio9{
  public static void main(String[] args) {
    
    //Realiza un programa que pida 8 números enteros y que luego muestre esos
    //números junto con la palabra “par” o “impar” según proceda.

    int[] numero = new int[8];
    
    for(int i = 0;i<8;i++){
      numero[i] = (int)(Math.random() * 101+1);
      if(numero[i] % 2 == 0){
        System.out.print(numero[i]+" Par ");
      }else{
        System.out.print(numero[i]+" Impar ");
      }
    }
  }
}
