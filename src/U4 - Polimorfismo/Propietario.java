import java.util.Scanner;

public class Propietario extends Persona{
  Scanner sc = new Scanner(System.in);

  private String rfc;
  private String ocupacion;
  private String cuentaBancaria;
  private int id; // Optional
  private static int cProp; // Contador para id
  private String miRestaurante;

  public Propietario(){
    this.id = ++cProp + 100;
  }
  public Propietario(String nombreCompleto, String telefono, String correo, String fechaNac, String domicilio, char sexo, String rfc, String ocupacion /*,String miRestaurante*/){
    super(nombreCompleto, telefono, correo, fechaNac, domicilio, sexo);
    this.rfc = rfc;
    this.ocupacion = ocupacion;
    this.id = ++cProp + 100;
    // this.miRestaurante = miRestaurante;
  }

  public String getRfc(){
    return rfc;
  }
  public void setRfc(String rfc) {
    this.rfc = rfc;
  }

  public int getId(){
    return id;
  }

  public String getOcupacion(){
    return ocupacion;
  }
  public void setOcupacion(String ocupacion) {
    this.ocupacion = ocupacion;
  }

  public String getMiRestaurante(){
    return miRestaurante;
  }
  public void setMiRestaurante(String miRestaurante) {
    this.miRestaurante = miRestaurante;
  }

  @Override
  public String queSoy(){
    return "Propietario";
  }

  @Override
  public void capturar(){
    System.out.println("\n-------------------Nuevo propietario-------------------");
    super.capturar();
    System.out.print("RFC             : "); rfc = sc.nextLine();
    System.out.print("Cuenta bancaria : "); cuentaBancaria = sc.nextLine();
  }
  @Override
  public void mostrar(){
    System.out.println("\n-------------------Propietarios-------------------");
    super.mostrar();
    System.out.println("RFC                   : " + rfc);
    System.out.println("Id                    : " + id);
    System.out.println("Ocupacion             : " + ocupacion);
  }
}
