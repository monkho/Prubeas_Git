import java.util.Scanner;
import java.io.IOException;

public class Test {

  public static String cadena;
  public static char caracter;

  public static Uber uberEats = new Uber("UPM191014S31", "8002832973", "help@uber.com", "www.uber.com.mx");

  public static void main(String[] args) {

    // Opcion para switch
    int opcion;

    do {
      opcion = mostrarMenu();
      switch (opcion) {
        case 11: uberEats.mostrarRepartidores(); break;
        case 12: uberEats.capturaRepartidor(); break;
        case 13: uberEats.mostrarRepartidores(cadena); break;

        case 21: uberEats.mostrarClientes(); break;
        case 22: uberEats.capturarCliente(); break;
        case 23:
          if(cadena.length() == 1) {uberEats.mostrarClientes(caracter); break;}
          else{uberEats.mostrarClientes(cadena); break;}
        // uberEats.mostrarClientes(cadena); break;

        case 31: uberEats.mostrarRestaurantes(); break;
        case 32: uberEats.capturarRestaurante(); break;
        case 33:
          if(cadena.length() == 1) {uberEats.mostrarRepartidores(caracter); break;}
          else {uberEats.mostrarRepartidores(cadena); break;}
        // uberEats.mostrarRestaurantes(cadena); break;

        case 41: uberEats.mostrarPedido(); break;
        case 42: uberEats.capturarPedido(); break;
      }
    } while (opcion != 0);
  }

  public static int mostrarMenu() {
    Scanner sc = new Scanner(System.in);
    System.out.print("\n1. Repartidor          2. Cliente          3. Restaurante          4. Pedido          5. Datos Uber          6. Limpiar pantalla          0. Salir  ");
    int opcion = sc.nextInt();

    if (opcion == 0)
      return 0;

    if(opcion == 5){
      uberEats.mostrar();
      return 50;
    }
    if(opcion == 6){
      clearScreen();
      return 60;
      // return 0;
    }


    System.out.print("\n1. Mostrar          2. Capturar          3. Buscar          0. Cancelar  ");
    opcion = opcion * 10 + sc.nextInt();

    if(opcion % 10 == 3){
      sc.nextLine();
      System.out.print("Ingrese la palabra a buscar: ");
      cadena = sc.nextLine();
      if(cadena.length() == 1){ caracter = cadena.charAt(0); }
    }

    return opcion;
  }

  public static void clearScreen(){
    for(int i = 0; i < 200; i++)
      System.out.print("\n");

    System.out.flush();
  }
}
