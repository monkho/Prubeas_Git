import java.util.Scanner;

public class Proveedor extends Persona{
  private String direccion;

  public Proveedor(){

  }
  public Proveedor(String nombre, String telefono, String correo, String direccion){
    super(nombre, telefono, correo);
    this.direccion = direccion;
  }

  public int getDireccion(){
    return direccion;
  }
  public void setDireccion(String direccion){
    this.direccion = direccion;
  }

  @Override
  public void mostrar(){
    super.mostrar();
    System.out.println("Direccion: " + direccion);
  }
  @Override
  public void capturar(){
    Scanner sc = new Scanner(System.in);
    super.capturar();
    System.out.print("Direccion: "); direccion = sc.nextLine();
  }
  @Override
  protected String miClase(){
    return "Proveedor";
  }
}
