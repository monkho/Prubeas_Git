import java.util.Scanner;
import java.time.LocalDate;

public class Cliente extends Persona{
  LocalDate fechaActual = LocalDate.now();
  int anioActual;

  protected int anioNacimiento;

  protected Cliente(){

  }
  protected Cliente(String nombre, String telefono, String correo, int anioNacimiento){
    super(nombre, telefono, correo);
    this.anioNacimiento = anioNacimiento;
  }

  protected int getAnioNacimiento(){
    return anioNacimiento;
  }
  protected void setAnioNacimiento(int anioNacimiento){
    this.anioNacimiento = anioNacimiento;
  }

  @Override
  protected void mostrar(){
    super.mostrar();
    System.out.println("Edad: " + (anioActual - anioNacimiento));
  }
  @Override
  protected void capturar(){
    super.capturar();
    Scanner sc = new Scanner(System.in);
    System.out.print("Anio de nacimiento: "); anioNacimiento = sc.nextInt();
  }
  @Override
  protected String miClase(){
    return "Cliente";
  }
}
