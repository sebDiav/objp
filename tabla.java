import java.util.Scanner;

public class tabla {
 public static void main ( String [] args){
   Scanner leer = new Scanner(System.in);
   System.out.println("ingresa tu nombre");
   String name = leer.nextLine();

   System.out.println( name + " Hola en java desde consola ");
   System.out.println( name + " ingresa un numero para la tM ");
   byte numero;
   numero = leer.nextByte();
   System.out.println( " la tabla de numero:  " + numero + "  es: ");
   byte i=0;
   while(numero>=i){
   System.out.println(numero + " x " + i + " = = " + (numero*i));
   i = (byte)(i+1);
   }
  }
}