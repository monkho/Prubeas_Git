import java.util.Scanner;

public class Cliente extends Persona{
  Scanner sc = new Scanner(System.in);

  private String municipio;
  private String codigoPostal;
  private String cuentaBancaria;
  private float saldo;

  // Constructores
	public Cliente() {
    super();
	}
	public Cliente(String nombreCompleto, String telefono, String correo, String fechaNac, String municipio, String codigoPostal, float saldo, char sexo, String cuentaBancaria) {

    super(nombreCompleto, telefono, correo, fechaNac, municipio, sexo);
		this.municipio = municipio;
		this.codigoPostal = codigoPostal;
		this.saldo = saldo;
    this.cuentaBancaria = cuentaBancaria;
	}

  // getters y setters
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

  public String getCuentaBancaria(){
    return cuentaBancaria;
  }
  public void setCuentaBancaria(String cuentaBancaria){
    this.cuentaBancaria = cuentaBancaria;
  }

  @Override
  public String queSoy(){
    return "Cliente";
  }

  // Datos de CLiente
  @Override
  public void capturar(){
    System.out.println("------------------Nuevo Cliente-------------------");
    super.capturar();
    System.out.print("Municipio           : "); municipio = sc.nextLine();
    System.out.print("Codigo postal       : "); codigoPostal = sc.nextLine();
    System.out.print("Saldo               : "); saldo = sc.nextFloat();
    System.out.print("Cuenta bancaria     : "); cuentaBancaria = sc.nextLine();
  }
  @Override
  public void mostrar(){
    System.out.println("\n-------------------Cliente-------------------");
    super.mostrar();
    System.out.println("Municipio              : " + municipio);
    System.out.println("Codigo postal          : " + codigoPostal);
    System.out.println("Saldo                  : $" + saldo);
    System.out.println("Cuenta bancaria        : " + cuentaBancaria);
  }
}
