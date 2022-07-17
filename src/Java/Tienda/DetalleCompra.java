import java.util.Scanner;
import java.io.Serializable;

public class DetalleCompra implements Interface, Serializable{
  private String idProducto;
  private int cantidad;
  private float precioUnitario;
  private float impuestos;


	public DetalleVenta() {
		super();
	}
	public DetalleVenta(String idProducto, int cantidad, float precioUnitario, float impuestos) {
		super();
		this.idProducto = idProducto;
		this.cantidad = cantidad;
		this.impuestos = impuestos;
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

	public float getImpuestos() {
		return impuestos;
	}
	public void setImpuestos(float impuestos) {
		this.impuestos = impuestos;
	}

  @Override
  public void mostrar(){
    System.out.println("Id del producto   : " + idProducto);
    System.out.println("Cantidad          : " + cantidad);
    System.out.println("Precio unitario   : " + precioUnitario);
    System.out.println("Impuestos             : " + impuestos);
    System.out.println("Subtotal, antes de impuestos: " + (cantidad*precioUnitario));
    System.out.println("\n\tTotal de la compra: " + ((cantidad*precioUnitario) + (cantidad*precioUnitario)*impuestos));
  }
  @Override
  public void capturar(){
    System.out.print("Id del producto   : "); idProducto = sc.nextLine();
    System.out.print("Cantidad          : "); cantidad = sc.nextInt();
    System.out.print("precio unitario   : "); precioUnitario = sc.nextFloat();
    System.out.print("Impuestos             : "); impuestos = sc.nextFloat();
  }
  @Override
  public String miClase(){
    return "DetalleVenta";
  }
}
