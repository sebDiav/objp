import java.util.Scanner;

public class corbata{
 public static void main(String [] args){
  System.out.println("BIENVENIDO A ESTE PROGRAMA QUE TE AYUDARA A HACER UN NUDO DE CORBATA");
  System.out.println("PERO ANTES DE EMPEZAR NECESITAS UNA COSA MUY IMPORTANTE...");
  System.out.println("ASI ES ... HABLO DE UNA CORBATA... UNA VEZ LA TENGAS YA PODEMOS EMPEZAR");

  Scanner sc = new Scanner(System.in);
        int paso = 1;
        int opcion;

        while (paso <= 7) {

            // Mostrar el paso actual
            if (paso == 1) paso1();
            else if (paso == 2) paso2();
            else if (paso == 3) paso3();
            else if (paso == 4) paso4();
            else if (paso == 5) paso5();
            else if (paso == 6) paso6();
            else if (paso == 7) paso7();
            

            // Opciones del usuario
            System.out.println("¿Qué deseas hacer?");
            System.out.println("1 = continuar");
            System.out.println("2 = retroceder");
            System.out.println("3 = repetir paso");

            opcion = sc.nextInt();

            if (opcion == 1) {
                paso++;         
            }
            else if (opcion == 2) {
                paso--;        
            }
            else if (opcion == 3) {
                
            }

            
            if (paso < 1) paso = 1;
        }

        System.out.println("LISTO YA TIENES TU NUDO DE CORBATA");
    }

    public static void paso1() {
        System.out.println("\nPASO 1: Coloca la corbata alrededor del cuello, dejando la solapa grande de un lado y la pequeña del otro, dejando el lado de la solapa pequeña mas corto que que el de la solapa grande.");
    }

    public static void paso2() {
        System.out.println("\nPASO 2: ahora cruzas las 2 solapas en forma de cruz dejando la solapa pequeña en la parte de atras.");
    }

    public static void paso3() {
        System.out.println("\nPASO 3: da una vuelta por detras rodeando la solapa pequeña con la grande.");
    }

     public static void paso4() {
        System.out.println("\nPASO 4: vuelve a pasar la solapa grande por delante, ya tendras un aro suelto cerca del cuello.");
    }

     public static void paso5(){
        System.out.println("\nPASO 5: pasa la solapa grande por dentro del cuello, desde abajo hacia arriba.");
    } 

     public static void paso6(){
        System.out.println("\nPASO 6: introducela por el aro del frente, ese que hiciste antes.");
    }

     public static void paso7(){
        System.out.println("\nPASO 7: aprieta y ajustala, sostén la parte delgada y desliza el nudo hacia arriba hasta el cuello.");
    }


}

