import java.util.Scanner;

public class validar{
  public static void main(String [] args){
    Scanner leer= new Scanner (System.in);
      System.out.println("ingrese su nombre: ");
     String name = leer.nextLine();
     System.out.println( name + " ingrese fecha de nacimiento");
     short actual = 2026;
     short usuario = leer.nextShort();
     byte edad= (byte)(actual - usuario);
     if ( edad < 18) {
      System.out.println( " no puedes ingresar " );
    }
    else{
      System.out.println( " Bienvenido ");
    }
  }
}