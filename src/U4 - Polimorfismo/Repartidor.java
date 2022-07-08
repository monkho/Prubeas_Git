import java.util.Scanner;

public class Repartidor extends Persona{
  Scanner sc = new Scanner(System.in);

  private String rfc;
  private String licencia;
  private String descripcionVehiculo;
  private String cuentaBancaria;
  private char tipoVehiculo;
  private boolean disponible;

  // Constructor vacio, ambos sirven para inicializar los datos de la calase
  public Repartidor(){
    super();
    tipoVehiculo = 'M';
    disponible = false;
  }

	public Repartidor(String telefono, String nombreCompleto, String rfc, String correo, String licencia, String descripcionVehiculo, String domicilio, String cuentaBancaria, String fechaNac, char sexo, char tipoVehiculo, boolean disponible) {

    super(nombreCompleto, telefono, correo, fechaNac, domicilio, sexo);
    this.rfc = rfc;
		this.licencia = licencia;
		this.descripcionVehiculo = descripcionVehiculo;
		this.cuentaBancaria = cuentaBancaria;
		this.tipoVehiculo = tipoVehiculo;
		this.disponible = disponible;
	}

  public String getRfc(){
    return this.rfc;
  }
  public void setRfc(String rfc){
    this.rfc = rfc;
  }

  public String getLicencia(){
    return this.licencia;
  }
  public void setLicencia(String licencia){
    this.licencia = licencia;
  }

  public String getDescripcionVehiculo(){
    return this.descripcionVehiculo;
  }
  public void setDescripcionVehiculo(String descripcionVehiculo){
    this.descripcionVehiculo = descripcionVehiculo;
  }

  public String getCuentaBancaria(){
    return this.cuentaBancaria;
  }
  public void setCuentaBancaria(String cuentaBancaria){
    this.cuentaBancaria = cuentaBancaria;
  }

  public char getTipoVehiculo(){
    return this.tipoVehiculo;
  }
  public void setTipoVehiculo(char tipoVehiculo){
    this.tipoVehiculo = tipoVehiculo;
  }

  public boolean getDisponible(){
    return this.disponible;
  }
  public void setDisponible(boolean disponible){
    this.disponible = disponible;
  }

  @Override
  public String queSoy(){
    return "Repartidor";
  }

  // Datos de repartidor
  @Override
  public void capturar(){
    System.out.println("------------------Nuevo Repartidor-------------------");
    super.capturar();
    System.out.print("RFC                   : "); rfc = sc.nextLine();
    System.out.print("Licencia              : "); licencia = sc.nextLine();
    System.out.print("DescripcionVehiculo   : "); descripcionVehiculo = sc.nextLine();
    System.out.print("CuentaBancaria        : "); cuentaBancaria = sc.nextLine();
    System.out.print("TipoVehiculo          : "); tipoVehiculo = sc.next().charAt(0); sc.nextLine();
    // System.out.print("Disponibilidad        : "); disponible = sc.nextBoolean();
  }
  @Override
	public void mostrar() {
		System.out.println("\n------------------Repartidores-------------------");
    super.mostrar();
    System.out.println("RFC                   : " + rfc );
    System.out.println("Licencia              : " + licencia );
    System.out.println("DescripcionVehiculo   : " + descripcionVehiculo );
    System.out.println("CuentaBancaria        : " + cuentaBancaria );
    System.out.print("TipoVehiculo          : ");
    switch (tipoVehiculo){
      case 'M': System.out.println("Motocicleta"); break;
      case 'B': System.out.println("Bicicleta"); break;
      case 'A': System.out.println("Automovil"); break;
    }
    System.out.print("Disponibilidad        : ");
    if(disponible == true) {System.out.println("Repartidor en servicio");}
    else {System.out.println("Repartidor no disponible");}
	}
}
