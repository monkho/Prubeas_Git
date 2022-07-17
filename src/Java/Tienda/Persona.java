import java.util.Scanner;
import java.io.Serializable;

public class Persona implements Interface, Serializable{
  protected String nombre;
  protected String telefono;
  protected String correo;

  // Constructores
  protected Persona () {

  }
  protected Persona(String nombre, String telefono, String correo){
    this.nombre = nombre;
    this.telefono = telefono;
    this.correo = correo;
  }

  // Getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}

  @Override
  protected void mostrar(){
    System.out.println("Nombre      : " + nombre);
    System.out.println("Telefono    : " + telefono);
    System.out.println("Correo      : " + correo);
  }
  @Override
  protected void capturar(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Nombre      : "); nombre = sc.nextLine();
    System.out.print("Telefono    : "); telefono = sc.nextLine();
    System.out.print("Correo      : "); correo = sc.nextLine();
  }
  @Override
  protected String miClase(){
    return "Persona";
  }
}
