import java.util.Scanner;

public class Restaurante implements Basica{
  private String nombre;
  private String domicilio;
  private String rfc;
  private String horario;
  private String descripcion;
  private String sitioWeb;
  private String telefono;
  private String correo;
  private boolean estaAbierto;
  private int tipo;

  // Contador de instancias de alimento
  private int cMenu, cPropietario;

  // Instancia
  Alimento menu[] = new Alimento[15];
  Propietario propietarios[] = new Propietario[20];

  // Constructores
  public Restaurante(){

  }
	public Restaurante(String nombre, String domicilio, String rfc, String horario, String descripcion, String sitioWeb, String telefono, String correo, boolean estaAbierto, int tipo) {
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.rfc = rfc;
		this.horario = horario;
		this.descripcion = descripcion;
		this.sitioWeb = sitioWeb;
		this.telefono = telefono;
		this.correo = correo;
		this.estaAbierto = estaAbierto;
		this.tipo = tipo;
    // inicializaMenu();
	}

  // getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getSitioWeb() {
		return sitioWeb;
	}
	public void setSitioWeb(String sitioWeb) {
		this.sitioWeb = sitioWeb;
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

	public boolean isEstaAbierto() {
		return estaAbierto;
	}
	public void setEstaAbierto(boolean estaAbierto) {
		this.estaAbierto = estaAbierto;
	}

	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

  // Metodos de la clase
  public void capturarMenu(String nombre, String descripcion, float precio, int tiempo, int tipo, boolean estaDisponible){
    menu[cMenu++] = new Alimento(nombre, descripcion, precio, tiempo, tipo, estaDisponible);
  }
  public void capturarMenu(){
    menu[cMenu] = new Alimento();
    menu[cMenu].capturar();
    cMenu++;
  }
  public void mostrarMenu(){
    for(int i = 0; i < cMenu; i++)
      menu[i].mostrar();
  }
  public void mostrarNombreMenu(){
    for(int i = 0; i < cMenu; i++)
      System.out.println((i + 1) + ".- " + menu[i].getNombre());
  }

/*
  public void capturarPropietario(String nombreCompleto, String telefono, String correo, String fechaNac, String domicilio, char sexo, String rfc, String ocupacion){

    propietarios[cPropietario++] = new Propietario(nombreCompleto, telefono, correo, fechaNac, domicilio, sexo, rfc, ocupacion);
  }
  public void capturarPropietario(){
    propietarios[cPropietario] = new Propietario();
    propietarios[cPropietario].capturar();
    cPropietario++;
  }
  public void mostrarPropietario(){
    for(int i = 0; i < cPropietario; i++)
      propietarios[i].mostrar();
  }
*/

  public String queSoy(){
    return "Restaurante";
  }

  // Datos de la clase
  public void capturar(){
    Scanner sc = new Scanner(System.in);
    System.out.println("\n---------------Nuevo Restaurante---------------");
    System.out.print("Nombre                  : "); nombre = sc.nextLine();
    System.out.print("Domicilio               : "); domicilio = sc.nextLine();
    System.out.print("RFC                     : "); rfc = sc.nextLine();
    System.out.print("Horario                 : "); horario = sc.nextLine();
    System.out.print("Descripcion             : "); descripcion = sc.nextLine();
    System.out.print("Sitio Web               : "); sitioWeb = sc.nextLine();
    System.out.print("Telefono                : "); telefono = sc.nextLine();
    System.out.print("Correo                  : "); correo = sc.nextLine();
    System.out.print("Disponibilidad          : "); estaAbierto = sc.nextBoolean();
    System.out.print("Tipo de restaurante (1: comida mexicana, 2: comida rapida, ");
    System.out.print("3: comida china, 4: comida japonesa, 5: comida italiana)     :");tipo = sc.nextInt();
  }
  public void mostrar(){
    System.out.println("\n---------------Restaurante---------------");
    System.out.println("Nombre                  : " + nombre);
    System.out.println("Domicilio               : " + domicilio);
    System.out.println("RFC                     : " + rfc);
    System.out.println("Horario                 : " + horario);
    System.out.println("Descripcion             : " + descripcion);
    System.out.println("Sitio Web               : " + sitioWeb);
    System.out.println("Telefono                : " + telefono);
    System.out.println("Correo                  : " + correo);
    System.out.print("Disponibilidad          : ");
    if(estaAbierto){System.out.println("Restaurante en servicio");}
    else {System.out.println("Restaurante sin disponibilidad por el momento");}
  }

}
