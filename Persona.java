import java.time.LocalDate;

public class Persona{
 
 public String name;
 public int id;
 public String nacionalidad;
 public double altura;
 public double peso;
 public LocalDate nacimiento;

 
 public static void main ( String [] args){
  
  Persona p1= new Persona();
  p1.name="falcao";
  p1.id= 9;
  p1.nacionalidad= "colombiano";
  p1.altura= 1.77;
  p1.peso= 74.0;

  System.out.println(p1.id);
   }
}