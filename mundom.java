import java.util.Scanner;

public class mundom{
public static void main(String arg[]){
 Scanner in = new Scanner(System.in);
 int op1=0, op2=0, op3=0, op4=0, op5=0, resultado;
 System.out.println("vaya pareces perdido en este mundo, no recuerdas quien eres?");
 System.out.println("yo puedo ayudarte a recordar,dime: ");
 System.out.println("te gustan los lugares calidos?");
 System.out.println("si,bastante=1");
 System.out.println("meh,ni me va ni me viene=2");
 System.out.println("no,soy mas de climas frios=3");
  op1 = in.nextInt();

 System.out.println("humm ya veo, y dime: ");
 System.out.println("te gustan los dulces? ");
 System.out.println("si, me encantan=1");
 System.out.println("pues estan bien=2");
 System.out.println("no, soy mas de sal=3");
  op2= in.nextInt();

 System.out.println("okey,okey...");
 System.out.println("que opinas de los combates?");
 System.out.println("son increibles pero, solo de ver=1");
 System.out.println("demasido esfuerzo, aunque aveces estan bien=2");
 System.out.println("me encantan, la emocion del combate es lo mejor=3");
  op3= in.nextInt();

 System.out.println("vaya creo que ya estoy viendo como eres");
 System.out.println("¡De repente, te encierran bajo llave en una habitación oscura!¿Qué haces?");
 System.out.println("patear la puerta=1");
 System.out.println("gritar por ayuda=2");
 System.out.println("pues ya que estoy limpiarla un poco=3");
  op4=in.nextInt();

 System.out.println("hummm ya veo ya veo, una ultima pregunta");
 System.out.println("te dan un regalo, que esperas que haya adentro?");
 System.out.println("espero sea que sea un postre=1");
 System.out.println("la forma parece de un libro, espero sea un libro=2");
 System.out.println("espero sean unos tenis estoy ansioso por correr=3");
  op5=in.nextInt();
 System.out.println("ya veo...entiendo...tu definitivamente eres... ");
 resultado =(op1 + op2 + op3 + op4 + op5);
 if (resultado==15) {
 System.out.println("ERES UN MUBKIP");
}
 else if (15>resultado && resultado>=12) { 
 System.out.println("ERES UN RIOLU");
}
 else if (resultado<12 && resultado>=9){
System.out.println("ERES UN TORCHIC");
}
else if(resultado<9 && resultado>=6){
 System.out.println("eres un TREECKO");
}
else{
System.out.println("eres un EEVEE");
}
 }
}