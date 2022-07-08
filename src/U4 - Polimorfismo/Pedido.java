import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

public class Pedido implements Basica{
  Scanner sc = new Scanner(System.in);

  private int cDetalle;

  Detalle detalle[] = new Detalle[5];

  private String telefonoCliente; //
  private String rfcRestaurante; //
  private String domicilioPedido; //
  private String folio;
  private String rfcRepartidor;
  private LocalDate fecha; //
  private LocalTime hora; //
  private int formaPago;
  private int status; //
  private float costoEnvio;
  private int calificacionRestaurante; //
  private int calificacionRepartidor; //

  private float costoTotal;

  // Constructores
	public Pedido() {

	}
	public Pedido(String telefonoCliente, String rfcRestaurante, String domicilioPedido, String folio, String rfcRepartidor, LocalDate fecha, LocalTime hora, int formaPago, int status, float costoEnvio, int calificacionRestaurante, int calificacionRepartidor) {
		this.telefonoCliente = telefonoCliente;
		this.rfcRestaurante = rfcRestaurante;
		this.domicilioPedido = domicilioPedido;
		this.folio = folio;
		this.rfcRepartidor = rfcRepartidor;
		this.fecha = fecha;
		this.hora = hora;
		this.formaPago = formaPago;
		this.status = status;
		this.costoEnvio = costoEnvio;
		this.calificacionRestaurante = calificacionRestaurante;
		this.calificacionRepartidor = calificacionRepartidor;
	}

  // Pedido
  // private void inicializaDetalles() {
  //   detalle[0] = new Detalle();
  //
  //   cDetalle = 1;
  // }
  public void capturarDetalle(int cantidad, String producto, String indicacionesEspeciales, float precio){
    detalle[cDetalle++] = new Detalle(cantidad, producto, indicacionesEspeciales, precio);
  }
  public void capturarDetalle(){
    detalle[cDetalle] = new Detalle();
    detalle[cDetalle].capturar();
    cDetalle++;
  }
  public void mostrarDetalle(){
    for(int i=0; i<cDetalle; i++)
      detalle[i].mostrar();
  }

  // getters y setters
	public String getTelefonoCliente() {
		return telefonoCliente;
	}
	public void setTelefonoCliente(String telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}

	public String getRfcRestaurante() {
		return rfcRestaurante;
	}
	public void setRfcRestaurante(String rfcRestaurante) {
		this.rfcRestaurante = rfcRestaurante;
	}

	public String getDomicilioPedido() {
		return domicilioPedido;
	}
	public void setDomicilioPedido(String domicilioPedido) {
		this.domicilioPedido = domicilioPedido;
	}

	public String getFolio() {
		return folio;
	}
	public void setFolio(String folio) {
		this.folio = folio;
	}

	public String getRfcRepartidor() {
		return rfcRepartidor;
	}
	public void setRfcRepartidor(String rfcRepartidor) {
		this.rfcRepartidor = rfcRepartidor;
	}

	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public int getFormaPago() {
		return formaPago;
	}
	public void setFormaPago(int formaPago) {
		this.formaPago = formaPago;
	}

	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

	public float getCostoEnvio() {
		return costoEnvio;
	}
	public void setCostoEnvio(float costoEnvio) {
		this.costoEnvio = costoEnvio;
	}

	public int getCalificacionRestaurante() {
		return calificacionRestaurante;
	}
	public void setCalificacionRestaurante(int calificacionRestaurante) {
		this.calificacionRestaurante = calificacionRestaurante;
	}

	public int getCalificacionRepartidor() {
		return calificacionRepartidor;
	}
	public void setCalificacionRepartidor(int calificacionRepartidor) {
		this.calificacionRepartidor = calificacionRepartidor;
	}

  public String queSoy(){
    return "Pedido";
  }

  // Metodos de la clase
  public void mostrar() {
    System.out.println("\n\n-------------------Pedido-------------------");
    System.out.println("Telefono del cliente                      : " + telefonoCliente);
    System.out.println("Rfc del restaurante                       : " + rfcRestaurante);
    System.out.println("Domicilio del pedido                      : " + domicilioPedido);
    System.out.println("Folio                                     : " + folio);
    System.out.println("Rfc del repartidor                        : " + rfcRepartidor);
    System.out.println("Fecha                                     : " + fecha);
    System.out.println("Hora                                      : " + hora);
    System.out.print("Forma de pago (1. Tarjeta, 2. Efectivo)   : ");
    if(formaPago == 1) System.out.println("Tarjeta");
    if(formaPago == 2) System.out.println("Efectivo");
    // System.out.println();
    System.out.print("Status                                    : ");
    switch(status) {
      case 0: System.out.println("Aun no se recoge"); break;
      case 1: System.out.println("Repartidor en local"); break;
      case 2: System.out.println("Repartidor en camino"); break;
      case 3: System.out.println("Entrega exitosa!"); break;
      case 4: System.out.println("Fallo en la entrega :c"); break;
    }
    System.out.println("Costo del envio                           : $" + costoEnvio);
    System.out.print("Calificacion del restaurante              : ");
    for(int i=0; i < calificacionRestaurante; i++) System.out.print("*");

    System.out.print("\nCalificacion del repartidor               : ");
    for(int i=0; i < calificacionRepartidor; i++) System.out.print("*");
    System.out.println();
    detalle[0].mostrar();

    costoTotal = costoEnvio + (detalle[0].getPrecio() * detalle[0].getCantidad());
    // costoTotal = Math.round(costoTotal * 100f) / 100f;

    System.out.println("\nSu pedido tendra un costo de: $" + String.format("%.2f", costoTotal) + ", incluyendo el envio.");
    if(formaPago == 1) System.out.print("El pago se cargo a la tarjeta");
    else if(formaPago == 2) System.out.println("El pago se realizo con efectivo");
    System.out.println();
  }
  public void capturar(){
    System.out.println("-------------------Nuevo Pedido-------------------");
    System.out.print("Telefono del cliente                        : "); telefonoCliente = sc.nextLine();
    System.out.print("Rfc del restaurante                         : "); rfcRestaurante = sc.nextLine();
    System.out.print("Domicilio del pedido                        : "); domicilioPedido = sc.nextLine();
    System.out.print("Folio                                       : "); folio = sc.nextLine();
    System.out.print("Rfc del repartidor                          : "); rfcRepartidor = sc.nextLine();
    // System.out.print("Fecha                                       : "); fecha = sc.nextLine();
    // System.out.print("Hora                                        : "); hora = sc.nextLine();
    System.out.print("Forma de pago (1. Tarjeta, 2. Efectivo)     : "); formaPago = sc.nextInt();
    System.out.print("Status                                      : "); status = sc.nextInt();
    System.out.print("Costo del envio                             : "); costoEnvio = sc.nextFloat();
    System.out.print("Calificacion del restaurante                : "); calificacionRestaurante = sc.nextInt();
    System.out.print("Calificacion del repartidor                 : "); calificacionRepartidor = sc.nextInt();
  }
}
