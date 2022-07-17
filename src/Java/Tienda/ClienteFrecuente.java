import java.util.Scanner;

public class ClienteFrecuente extends Cliente{
  private int idCliente;
  private static int contadorPersonas;
  private int puntos;

  public ClienteFrecuente(){

  }
  public ClienteFrecuente(String nombre, String telefono, String correo, int anioActual, int puntos){
    super(nombre, telefono, correo, anioActual);
    this.idCliente = ++contadorPersonas;
    this.puntos = puntos;
  }

  public int getIdCliente(){
    return idCliente;
  }

  public int getPuntos(){
    return puntos;
  }
  public void setPuntos(int puntos){
    this.puntos = puntos;
  }

  @Override
  public void mostrar(){
    super();
    System.out.println("Id del cliente      : " + idCliente);
    System.out.println("Puntos del Cliente  : " + puntos);
  }
  @Override
  public void capturar(){
    Scanner sc = new Scanner(System.in);
    super();
    System.out.print("Puntos: "); puntos = sc.nextInt();
  }
  @Override
  protected String miClase(){
    return "ClienteFrecuente";
  }
}
