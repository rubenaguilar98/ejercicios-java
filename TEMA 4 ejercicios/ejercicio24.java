public class ejercicio24 {
  public static void main (String[] args) {
    
    System.out.println("Introduzca  cual es su cargo: ");
    System.out.println("Prog. Junior --> Pulse 1 ");
    System.out.println("Prog. Senior --> Pulse 2");
    System.out.println("Jefe de proyecto --> Pulse 3");
    int puesto = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduzca cuantos dias de viaje visitando a clientes a realizado: ");
    int diasViaje = Integer.parseInt(System.console().readLine());
    
    System.out.println("Pulse 1 si usted esta casado/a");
    System.out.println("Pulse 2 si usted esta soltero/a");
    int estadoCivil = Integer.parseInt(System.console().readLine());
    
    double sueldoBase = 0;
    switch (puesto){
      case 1:
        sueldoBase = 950;
        break;
      case 2:
        sueldoBase = 1200;
        break;
      case 3:
        sueldoBase = 1600;
        default :
        System.out.println("Introduzca correctamente el puesto,por favor.");
    }
    
    
    double IRPF = 0;
    
    double eurosExtra = diasViaje * 30;
    
    double sueldoBruto = eurosExtra + sueldoBase;
    
    double restaIRPF = sueldoBruto * IRPF;
    
    double sueldoNeto = sueldoBruto - restaIRPF;
    
    
    if (estadoCivil == 1){
      IRPF = 20;

    }else if (estadoCivil == 2){
      IRPF = 25;
      
    }else{
      System.out.println("Introduzca bien su estado civil");
    }
    
    double calculoIRPF = (sueldoBruto * IRPF)/100;
        
    
    System.out.println("___________________________");
    System.out.printf("~Sueldo base        %5.2f $\n",sueldoBase);
    System.out.printf("~Dietas(%s)          %5.2f $\n",diasViaje,eurosExtra);
    System.out.println("___________________________");
    System.out.printf("~Sueldo bruto      %5.2f $\n",sueldoBruto);
    System.out.printf("Retencion IRPF(%s)%5.2f $\n",IRPF,calculoIRPF);
    System.out.println("___________________________");
    System.out.printf("Sueldo neto        %5.2f $\n",sueldoNeto);
    System.out.println("___________________________");
  }
}
