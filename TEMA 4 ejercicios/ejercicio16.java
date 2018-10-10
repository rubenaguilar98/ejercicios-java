public class ejercicio16 {
  public static void main(String[] args){
    
    int puntos = 0;
    
    System.out.println("Test de infidelidad");
    System.out.println("Responda 1 si es verdadero o 2 si es falso");
      
    System.out.println("Tu pareja parece estar mas inquieta de lo normal sin ningun motivo aparente");
    String respuesta = System.console().readLine();
    
    if (respuesta.equals ("1")){
      System.out.println("Si");
      puntos += 3;
    }
    
    System.out.println("Ha aumentado sus gastos de vestuario");
    respuesta = System.console().readLine();
    
    if (respuesta.equals ("1")){
      System.out.println("Si");
      puntos += 3;
    }
    
    System.out.println("Ha perdido el interes que mostraba anteriormente por ti");
    respuesta = System.console().readLine();
    
    if (respuesta.equals ("1")){
      System.out.println("Si");
      puntos += 3;
    }
    System.out.println(" Ahora se afeita y se asea con mas frecuencia(si es hombre) o ahora se arregla el pelo y se asea con mas frecuencia(si es mujer)");
    respuesta = System.console().readLine();
    
    if (respuesta.equals ("1")){
      System.out.println("Si");
      puntos += 3;
    }
    System.out.println("No te deja que mires la agenda de su telefono movil");
    respuesta = System.console().readLine();
    
    if (respuesta.equals ("1")){
      System.out.println("Si");
      puntos += 3;
    }
    System.out.println("A veces tiene llamadas que dice no querer contestrae cuando estas tu delante");
    respuesta = System.console().readLine();
    
    if (respuesta.equals ("1")){
      System.out.println("Si");
      puntos += 3;
    }
    System.out.println("Ultimamente se preocupa ams de en cuidar la linea y/o estar bronceado/a");
    respuesta = System.console().readLine();
    
    if (respuesta.equals ("1")){
      System.out.println("Si");
      puntos += 3;
    }
    System.out.println("Muchos dias viene tarde despus de trabajar poeque dice tener mucho mas trabajo");
    respuesta = System.console().readLine();
    
    if (respuesta.equals ("1")){
      System.out.println("Si");
      puntos += 3;
    }
    System.out.println("Has notado que ultimamente se perfuma mas");
    respuesta = System.console().readLine();
    
    if (respuesta.equals ("1")){
      System.out.println("Si");
      puntos += 3;
    }
    System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    respuesta = System.console().readLine();
    
    if (respuesta.equals ("1")){
      System.out.println("Si");
      puntos += 3;
    }
    
    if (puntos <= 10){
      System.out.println("Bien crack");
    }else if ((puntos > 10)&&(puntos <= 22)){
      System.out.println("Weno");
    }else{
      System.out.println("LAs cagao monstruo");
    }
    

    
    
  }
}
