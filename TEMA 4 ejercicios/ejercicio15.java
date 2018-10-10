public class ejercicio15 {
  public static void main(String[] args) {
    
    String vertice;
    

    
    System.out.println("Introduzca que caracter quiere que forme su piramide");
    
        String r = System.console().readLine();
    
    System.out.println("Introduca arriba,abajo,derecha o izquierda segun el lugar en el que quiera que  esté el vertice de la piramide: ");
    
    vertice = System.console().readLine();
    
    if (vertice.equals("arriba")) {
      System.out.println("    "+r);
      System.out.println("   "+r+r+r);
      System.out.println("  "+r+r+r+r+r);
      System.out.println(" "+r+r+r+r+r+r+r);
      System.out.println(""+r+r+r+r+r+r+r+r+r);
      
    }else if (vertice.equals("abajo")) {
      System.out.println("    "+r);
      System.out.println("   "+r+r+r);
      System.out.println("  "+r+r+r+r+r);
      System.out.println(" "+r+r+r+r+r+r+r);
      System.out.println(""+r+r+r+r+r+r+r+r+r);
      
    }else if (vertice.equals("izquierda")) {
      System.out.println("       "+r);
      System.out.println("      "+r+r);
      System.out.println("     "+r+r+r);
      System.out.println("    "+r+r+r+r);
      System.out.println("   "+r+r+r+r+r);
      System.out.println(" "+r+r+r+r+r+r+r);
      System.out.println(""+r+r+r+r+r+r+r+r);
      System.out.println(" "+r+r+r+r+r+r+r);
      System.out.println("  "+r+r+r+r+r+r);
      System.out.println("    "+r+r+r+r);
      System.out.println("     "+r+r+r);
      System.out.println("      "+r+r);
      System.out.println("       "+r);
  
      
      
      
      
    }else if (vertice.equals("derecha")) {
      System.out.println(""+r);
      System.out.println(""+r+r);
      System.out.println(""+r+r+r);
      System.out.println(""+r+r+r+r);
      System.out.println(""+r+r+r+r+r);
      System.out.println(""+r+r+r+r+r+r);
      System.out.println(""+r+r+r+r+r+r+r);
      System.out.println(""+r+r+r+r+r+r);
      System.out.println(""+r+r+r+r+r);
      System.out.println(""+r+r+r+r);
      System.out.println(""+r+r+r);
      System.out.println(""+r+r);
      System.out.println(""+r);
    }
  }
}
      
      
      
