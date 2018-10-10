public class ejercicio24maestro {
  public static void main (String[] args) {
    int puesto;
    int diasViaje;
    int estadoCivil;
    
    double sueldoBase = 0;
    double dietas;
    double sueldoBruto;
    int porcentajeIRPF = 0;
    double retencionIRPF;

    System.out.println("Introduzca  cual es su cargo: ");
    System.out.println("Prog. Junior --> Pulse 1 ");
    System.out.println("Prog. Senior --> Pulse 2");
    System.out.println("Jefe de proyecto --> Pulse 3");
    
    String entrada = System.console().readLine();
    puesto = Integer.parseInt(entrada);
    
    System.out.println("Introduzca cuantos dias de viaje visitando a clientes a realizado: ");
    entrada = System.console().readLine();
    diasViaje = Integer.parseInt(entrada);
    
    System.out.println("Pulse 1 si usted esta casado/a");
    System.out.println("Pulse 2 si usted esta soltero/a");
    entrada = System.console().readLine();
    estadoCivil = Integer.parseInt(entrada);
    
    
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
      dietas = diasViaje * 30;
      
      sueldoBruto = sueldoBase + dietas;

        
        
    if (estadoCivil == 1){
      porcentajeIRPF = 25;

    }else if (estadoCivil == 2){
      porcentajeIRPF = 20;
      
    }else{
      System.out.println("Introduzca bien su estado civil");
    }
    retencionIRPF = (sueldoBruto * porcentajeIRPF)/100.0;

    System.out.println("___________________________");
    System.out.printf("~Sueldo base        %5.2f $\n",sueldoBase);
    System.out.printf("~Dietas(%s)          %5.2f $\n",diasViaje,dietas);
    System.out.println("___________________________");
    System.out.printf("~Sueldo bruto      %5.2f $\n",sueldoBruto);
    System.out.printf("Retencion IRPF(%s)  %5.2f $\n",porcentajeIRPF,retencionIRPF);
    System.out.println("___________________________");
    System.out.printf("Sueldo neto         %5.2f $\n",sueldoBruto-retencionIRPF);
    System.out.println("___________________________");
  }
}
    
    
