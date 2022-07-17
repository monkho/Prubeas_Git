import java.util.Scanner;
import java.io.Serializable;

public class DetalleVenta implements Interface, Serializable{
  private String idProducto;
  private int cantidad;
  private float precioUnitario;

	public DetalleVenta() {
		super();
	}
	public DetalleVenta(String idProducto, int cantidad, float precioUnitario) {
		super();
		this.idProducto = idProducto;
		this.cantidad = cantidad;
	}

	public String getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

  public float getprecioUnitario(){
    return precioUnitarioUnitario;
  }
  public void setprecioUnitario(float precioUnitarioUnitario){
    this.precioUnitarioUnitario = precioUnitarioUnitario;
  }

  @Override
  public void mostrar(){
    System.out.println("Id del producto   : " + idProducto);
    System.out.println("Cantidad          : " + cantidad);
    System.out.println("Precio unitario   : " + precioUnitario);
    System.out.println("\n\tTotal de la venta: " + (cantidad*precioUnitario));
  }
  @Override
  public void capturar(){
    System.out.print("Id del producto   : "); idProducto = sc.nextLine();
    System.out.print("Cantidad          : "); cantidad = sc.nextInt();
    System.out.print("Precio unitario   : "); precioUnitario = sc.nextFloat();
  }
  @Override
  public String miClase(){
    return "DetalleVenta";
  }
}
