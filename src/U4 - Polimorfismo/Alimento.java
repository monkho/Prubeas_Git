import java.util.Scanner;

public class Alimento implements Basica{
  private String nombre;
  private String descripcion;
  private float precio;
  private int tiempo;
  private int tipo;
  private boolean estaDisponible;

  // Constructores y mas
	public Alimento() {
	}
	public Alimento(String nombre, String descripcion, float precio, int tiempo, int tipo, boolean estaDisponible) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.tiempo = tiempo;
		this.tipo = tipo;
		this.estaDisponible = estaDisponible;
	}

  // getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public boolean isEstaDisponible() {
		return estaDisponible;
	}
	public void setEstaDisponible(boolean estaDisponible) {
		this.estaDisponible = estaDisponible;
	}

  public String queSoy(){
    return "Alimento";
  }

  // Datos de la clase
  public void capturar(){
    Scanner sc = new Scanner(System.in);

    System.out.println("---------Captura menu---------");
    System.out.print("Nombre del platillo           : "); nombre = sc.nextLine();
    System.out.print("Descripcion del platillo      : "); descripcion = sc.nextLine();
    System.out.print("Precio                        : "); precio = sc.nextFloat();
    System.out.print("Tiempo de preparacion         : "); tiempo = sc.nextInt();
    System.out.print("Tipo de platillo              : "); tipo = sc.nextInt();
    System.out.print("Disponibilidad de platillo    : "); estaDisponible = sc.nextBoolean();
  }
  public void mostrar(){
    System.out.println("----------Menu de hoy----------");
    System.out.println("Platillo                    : " + nombre);
    System.out.println("Descripcion                 : " + descripcion);
    System.out.println("Precio                      : $" + precio);
    System.out.println("Tiempo de preparacion       : " + tiempo + " minutos");
    System.out.print("Tipo de platillo            : ");
    switch(tipo){
      case 1: System.out.println("Comida mexicana"); break;
      case 2: System.out.println("Comida rapida"); break;
      case 3: System.out.println("Comida china"); break;
      case 4: System.out.println("Comida japonesa"); break;
      case 5: System.out.println("Comida italiana"); break;
    }
    System.out.print("Disponibilidad de platillo  : ");
    if(estaDisponible == true){System.out.println("Alimento listo para preparacion");}
    else {System.out.println("Por el momento no tenemos disponible el platillo");}
  }
}
