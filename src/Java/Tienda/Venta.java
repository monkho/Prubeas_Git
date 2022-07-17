import java.util.Scanner;
import java.io.Serializable;
import java.time.LocalDateTime;

public class Venta implements Serializable{
  private DetalleVenta detalle = new DetalleVenta[100];
  private int cDetalle;

  private LocalDateTime fechaVenta;
  private int folio;
  private String rfcCliente;
  private String rfcEmpleado;
  private static int contador;

  public void capturarDetalle(String idProducto, int cantidad, float precioUnitario){
    detalle[cDetalle++] = new DetalleVenta(idProducto, cantidad, precioUnitario);
  }
  public void capturarDetalle(){
    detalle[cDetalle] = new DetalleVenta();
    detalle[cDetalle].capturar();
    cDetalle++;
  }
  public void mostrarDetalle(){
    for(int i=0; i<cDetalle; i++) detalle[i].mostrar();
  }

	public Compra() {
		super();
	}
	public Compra(LocalDateTime fechaVenta, String rfcCliente, String rfcEmpleado) {
		super();
		this.fechaVenta = fechaVenta;
		this.rfcProveedor = rfcProveedor;
		this.folio = ++contador + 1000;
	}

	public LocalDateTime getCompra() {
		return compra;
	}
	public void setCompra(LocalDateTime compra) {
		this.compra = compra;
	}

	public String getrfcCliente() {
		return rfcCliente;
	}
	public void setrfcCliente(String rfcCliente) {
		this.rfcCliente = rfcCliente;
	}

	public String getrfcEmpleado() {
		return rfcEmpleado;
	}
	public void setrfcEmpleado(String rfcEmpleado) {
		this.rfcEmpleado = rfcEmpleado;
	}

	public int getFolio() {
		return folio;
	}
	public void setFolio(int folio) {
		this.folio = folio;
	}

  @Override
  public void mostrar(){
    System.out.println("Fecha de la compra    : " + fechaCompra);
    System.out.println("Rfc del Cliente       : " + rfcCliente);
    System.out.println("Rfc del Empleado      : " + rfcEmpleado);
    System.out.println("Folio de la compra    : " + folio);
  }
  @Override
  public void capturar(){
    System.out.print("Fecha de la compra    : "); fechaCompra = sc.nextLine();
    System.out.print("Rfc del proveedor     : "); rfcCliente = sc.nextLine();
    System.out.print("Rfc del empleado      : "); rfcEmpleado = sc.nextLine();
  }
  @Override
  public String miClase(){
    return "Venta";
  }
}
