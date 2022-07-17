import java.util.Scanner;

public class Empleado extends Persona{
  Scanner sc = new Scanner(System.in);

  private int tipo;
  private int turno;
  private String usuario;
  private String contrasenia;

  public Empleado(){

  }
  public Empleado(String nombre, String telefono, String correo, int tipo, int turno, String usuario, String contrasenia){
    super(nombre, telefono, correo);
    this.tipo = tipo;
    this.turno = turno;
    this.usuario = usuario;
    this.contrasenia = contrasenia;
  }

  public int getTipo(){
    return tipo;
  }
  public void setTipo(int tipo){
    this.tipo = tipo;
  }

  public int getTurno(){
    return turno;
  }
  public void setTurno(int turno){
    this.turno = turno;
  }

  public String getUsuario(){
    return usuario;
  }
  public void setUsuario(String usuario){
    this.usuario = usuario;
  }

  public String getContrasenia(){
    return contrasenia;
  }
  public void setContrasenia(String contrasenia){
    this.contrasenia = contrasenia;
  }

  @Override
  public void mostrar(){
    super();
    System.out.print("Tipo de empleado            : " + tipo);
    switch(tipo){
      case 1: System.out.println("Mostrador."); break;
      case 2: System.out.println("Caja."); break;
      case 3: System.out.println("Almacen."); break;
    }
    System.out.print("Turno del empleado          : " + turno);
    switch(turno){
      case 1: System.out.println("Matutino."); break;
      case 2: System.out.println("Vespertino."); break;
    }
    System.out.println("Usuario del empleado        : " + usuario);
    System.out.println("Contrasenia del empleado    : " + contrasenia);
  }
  @Override
  public void capturar(){
    super();
    Scanner sc = new Scanner();
    System.out.print("Tipo de empleado:(1=mostrador, 2=caja, 3=almacen) "); tipo = sc.nextInt();
    System.out.print("Turno del empleado:(1=matutino, 2=vespertino) "); turno = sc.nextInt();
    System.out.print("Usuario del empleado: "); usuario = sc.nextLine();
    System.out.print("Contrasenia del empleado: "); contrasenia = sc.nextLine();
  }
  @Override
  protected String miClase(){
    return "Empleado";
  }
}
