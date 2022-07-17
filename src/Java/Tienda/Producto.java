import java.util.Scanner;
import java.io.Serializable;

public class Producto implements Interface, Serializable{
  private String nombre;
  private String descripcion;
  private String marca;
  private String idProducto;
  private float precio;
  private int categoria;
  private int cantidad;

	public Producto() {

	}
	public Producto(String nombre, String descripcion, String marca, String idProducto, float precio, int categoria, int cantidad) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.marca = marca;
		this.idProducto = idProducto;
		this.precio = precio;
		this.categoria = categoria;
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

  @Override
  public void mostrar(){
    System.out.println("Nombre            : " + nombre);
    System.out.println("Descripcion       : " + descripcion);
    System.out.println("Marca             : " + marca);
    System.out.println("Id. del producto  : " + idProducto);
    System.out.println("Precio            : " + precio);
    System.out.println("Categoria         : " + categoria);
    System.out.println("Cantidad          : " + cantidad);
  }
  @Override
  public void capturar(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Nombre            : "); nombre = sc.nextLine();
    System.out.print("Descripcion       : "); descripcion = sc.nextLine();
    System.out.print("Marca             : "); marca = sc.nextLine();
    System.out.print("Id. del producto  : "); idProducto = sc.nextLine();
    System.out.print("Precio            : "); precio = sc.nextFloat();
    System.out.print("Categoria         : "); categoria = sc.nextInt();
    System.out.print("Cantidad          : "); cantidad = sc.nextInt();
  }

  @Override
  public String miClase(){
    return "Producto";
  }
}
