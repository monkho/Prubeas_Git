import java.util.Scanner;

public class Detalle{
  Scanner sc = new Scanner(System.in);

  private int cantidad; //
  private String producto; //
  private String indicacionesEspeciales; //
  private float precio; //

  // Constructor
	public Detalle() {
	}
	public Detalle(int cantidad, String producto, String indicacionesEspeciales, float precio) {
		this.cantidad = cantidad;
		this.producto = producto;
    this.indicacionesEspeciales = indicacionesEspeciales;
		this.precio = precio;
	}


	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}

  public String getIndicacionesEspeciales(){
    return indicacionesEspeciales;
  }
  public void getIndicacionesEspeciales(String indicacionesEspeciales){
    this.indicacionesEspeciales = indicacionesEspeciales;
  }

  public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}

  public void mostrar(){
    System.out.println("\n---------------Detalle----------------");
    System.out.println("Cantidad                  : " + cantidad);
    System.out.println("Producto                  : " + producto);
    System.out.println("Indicaciones especiales   : " + indicacionesEspeciales);
    System.out.println("Precio                    : " + precio);
  }
  public void capturar(){
    System.out.println("\n---------------Nuevo Detalle----------------");
    System.out.print("Cantidad                  : "); cantidad = sc.nextInt();
    System.out.print("Producto                  : "); producto = sc.nextLine();
    System.out.print("Indicaciones especiales   : "); indicacionesEspeciales = sc.nextLine();
    System.out.print("Precio                    : "); precio = sc.nextFloat();
  }


}
