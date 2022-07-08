// Una clase abstracta no es posible instanciarla

import java.util.Scanner;

public abstract class Persona implements Basica{
  Scanner sc = new Scanner(System.in);

  protected String nombreCompleto;
  protected String telefono;
  protected String correo;
  protected String fechaNac;
  protected String domicilio;
  protected char sexo;

  // Constructores
	public Persona() {

	}
	public Persona(String nombreCompleto, String telefono, String correo, String fechaNac, String domicilio, char sexo) {
		this.nombreCompleto = nombreCompleto;
		this.telefono = telefono;
		this.correo = correo;
		this.fechaNac = fechaNac;
    this.domicilio = domicilio;
		this.sexo = sexo;
	}

  // getters y setters
	protected String getNombreCompleto() {
		return nombreCompleto;
	}
	protected void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	protected String getTelefono() {
		return telefono;
	}
	protected void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	protected String getCorreo() {
		return correo;
	}
	protected void setCorreo(String correo) {
		this.correo = correo;
	}

	protected String getFechaNac() {
		return fechaNac;
	}
	protected void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

  protected String getDomicilio(){
    return domicilio;
  }
  protected void setDomicilio(String domicilio) {
    this.domicilio = domicilio;
  }

	protected char getSexo() {
		return sexo;
	}
	protected void setSexo(char sexo) {
		this.sexo = sexo;
	}

  public String queSoy(){
    return "Persona";
  }

  // Datos de Persona
  public void capturar(){
    // System.out.println("------------------Nuevo Cliente-------------------");
    System.out.print("Nombre              : "); nombreCompleto = sc.nextLine();
    System.out.print("Telefono            : "); telefono = sc.nextLine();
    System.out.print("Correo              : "); correo = sc.nextLine();
    System.out.print("Fecha nacimiento    : "); fechaNac = sc.nextLine();
    System.out.print("Domicilio           : "); domicilio = sc.nextLine();
    System.out.print("Sexo                : "); sexo = sc.next().charAt(0); sc.nextLine();
  }
  public void mostrar(){
    // System.out.println("\n-------------------Cliente-------------------");
    System.out.println("Nombre                 : " + nombreCompleto);
    System.out.println("Telefono               : " + telefono);
    System.out.println("Correo                 : " + correo);
    System.out.println("Fecha de nacimiento    : " + fechaNac);
    System.out.println("Domicilio              : " + domicilio);
    System.out.print("Sexo                   : ");
    if(sexo == 'h' || sexo == 'H'){System.out.println("Hombre");}
    else if(sexo == 'm' || sexo == 'M'){System.out.println("Mujer");}
  }
}
