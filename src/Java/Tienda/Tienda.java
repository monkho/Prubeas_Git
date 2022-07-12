public class Tienda{
  private String nombre;
  private String direccion;
  private String rfc;
  private String telefono;
  private String horario;

  // Constructores
  public Tienda(){

  }
  public Tienda(String nombre, String direccion, String rfc, String telefono, String horario){
    this.nombre = nombre;
    this.direccion = direccion;
    this.rfc = rfc;
    this.telefono = telefono;
    this.horario = horario;
  }

  // Metodos
  

  // Getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}

  public void mostrar(){
    System.out.println("\t\tAbout Tienda:");
    System.out.println("\nBienvenida/o a " + nombre);
    System.out.println("Nos encuentras en: " + direccion);
    System.out.println("Nuestro numero de contacto a tu disposicion: " + telefono);
    System.out.println("Conoce nuestro horario de trabajo: " + horario);
  }
}
