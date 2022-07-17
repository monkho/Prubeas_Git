import java.util.Scanner;
import java.io.Serializable;
import java.time.LocalDateTime;

public class Compra implements Serializable{
  private DetalleCompra detalle = new DetalleCompra[100];
  private int cDetalle;

  private LocalDateTime fechaCompra;
  private String rfcProveedor;
  private int folio;

  public void capturarDetalle(String idProducto, int cantidad, float precioUnitario, float impuestos){
    detalle[cDetalle++] = new DetalleCompra(idProducto, cantidad, precioUnitario, impuestos);
  }
  public void capturarDetalle(){
    detalle[cDetalle] = new DetalleCompra();
    detalle[cDetalle].capturar();
    cDetalle++;
  }
  public void mostrarDetalle(){
    for(int i=0; i<cDetalle; i++) detalle[i].mostrar();
  }

	public Compra() {
		super();
	}
	public Compra(LocalDateTimefechaCompra fechaCompra, String rfcProveedor, int folio) {
		super();
		this.fechaCompra = fechaCompra;
		this.rfcProveedor = rfcProveedor;
		this.folio = folio;
	}

	public LocalDateTime getFechaCompra() {
		return fechaCompra;
	}
	public void setCompra(LocalDateTime fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public String getrfcProveedor() {
		return rfcProveedor;
	}
	public void setrfcProveedor(String rfcProveedor) {
		this.rfcProveedor = rfcProveedor;
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
    System.out.println("Rfc del proveedor     : " + rfcProveedor);
    System.out.println("Folio de la compra    : " + folio);
  }
  @Override
  public void capturar(){
    System.out.print("Fecha de la compra    : "); fechaCompra = sc.nextLine();
    System.out.print("Rfc del proveedor     : "); rfcProveedor = sc.nextLine();
    System.out.print("Folio de la compra    : "); folio = sc.nextInt();
  }
}
