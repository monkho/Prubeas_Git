import java.util.Scanner;
import java.util.Random;
import java.time.LocalDate;
import java.time.LocalTime;

public class Uber {
  // Valores de la clase
  private String rfc;
  private String telefono;
  private String pagWeb;
  private String correo;

  // Solo para datos extras
  private int val, val1, val2, val3;
  private int cRestaurantes, cPedidos, cPersonas;
  private String cad;

  // Instancia de clases
  private Persona personas[] = new Persona[2000];
  Restaurante restaurantes[] = new Restaurante[100];
  Pedido pedidos[] = new Pedido[2000];

  Scanner sc = new Scanner(System.in);
  Random rand = new Random();
  LocalDate fecha;
  LocalTime hora;

  // Constructores de la clase
  public Uber() {

  }
  public Uber(String rfc, String telefono, String correo, String pagWeb) {
    this.rfc = rfc;
    this.telefono = telefono;
    this.pagWeb = pagWeb;
    this.correo = correo;
    inicializaDatos();
  }

  private void inicializaDatos(){

    restaurantes[0] = new Restaurante("Mi Lola", "Colonia Centro no. 1908", "MILO190802", "11:00am a 6:00pm", "La mejor comida casera de la ciudad", "milola.com.mx", "4433444433", "milola@comida.com", true, 1);
    restaurantes[0].capturarMenu("Alitas picantes", "Alitas con salsa buffalo", 90f, 50, 2, true);
    restaurantes[0].capturarMenu("Ceviche de camaron", "Camaron cocido con trozos de piña, jicama, pepino y clamato, con un toque picante", 170f, 40, 1, true);
    restaurantes[0].capturarMenu("Calamares fritos gris", "Calamares fritos salteados al ajo con chile cuaresmillo", 170f, 70, 1, true);
    restaurantes[0].capturarMenu("Alitas Juan Pablo", "Salsa a tu eleccion: habanero cremoso, buffalo y BBQ", 170f, 70, 1, true);

    // p = (Propietario) personas[20];
    // restaurantes[0].setMiPropietario(p.getId());

    // -------------------------------------------------------------------------------------------------

    // Restaurante 2
    restaurantes[1] = new Restaurante("Subway", "La estancia", "SUBRFC032", "11:00am a 8:00pm", "Los mejores sandwiches", "subway.com", "89779654354", "atencion@subway.com", false, 2);
    restaurantes[1].capturarMenu("Jamon de cerdo", "Sandwich de jamon de cerdo, con verdura, en 15 y 20 cm", 50f, 20, 2, true);
    restaurantes[1].capturarMenu("Costillas BBQ", "Sandwich costillas BBQ, con verdura, en 15 y 20 cm", 65f, 40, 2, true);
    restaurantes[1].capturarMenu("Pollo", "Sandwich de pollo, con verdura, en 15 y 20 cm", 35f, 15, 2, true);
    restaurantes[1].capturarMenu("Ensalada de pollo Rostisserie", "Ensalada con pollo, pepino, jitomate y cebolla", 40f, 10, 2, true);
    restaurantes[1].capturarMenu("Jamon de cerdo", "Sandwich de jamon de cerdo, con verdura, en 15 y 20 cm", 50f, 20, 2, true);

    // p = (Propietario) personas[21];
    // restaurantes[1].setMiPropietario(p.getId());

    // -------------------------------------------------------------------------------------------------

    // Restaurante 3
    restaurantes[2] = new Restaurante("Italianni", "Av. Villa madero no. 908", "ITAL908098", "3:00pm a 6:00pm", "Conoce el sabor de la cocina italiana al mejor precio", "italiannis.com.mx", "89779654354", "italiannis@comida.com", false, 2);
    restaurantes[2].capturarMenu("Antipast0", "Entremestes calientes o friso de Carpaccio, Caprese y Frutti di mare", 150.90f, 40, 4, true);
    restaurantes[2].capturarMenu("Antipast0", "Entremestes calientes o friso de Carpaccio, Caprese y Frutti di mare", 150.90f, 40, 4, true);
    restaurantes[2].capturarMenu("Budin", "Migas de pan, arroz, semola y bizcocho", 90.90f, 30, 4, true);
    restaurantes[2].capturarMenu("Antipast0", "Entremestes calientes o friso de Carpaccio, Caprese y Frutti di mare", 150.90f, 40, 4, true);
    restaurantes[2].capturarMenu("Pastel de Tiramisu", "Pastel de Tiramisu con cafe y chocolate", 320.80f, 40, 4, true);

    // p = (Propietario) personas[22];
    // restaurantes[2].setMiPropietario(p.getId());

    // -------------------------------------------------------------------------------------------------

    // Restaurante 4
    restaurantes[3] = new Restaurante("Pizza hut", "Av. tres puentes no 32", "PIZHUT984978", "11:00am a 8:00pm", "Las mejores pizzas de la ciudad", "pizzahut.mx", "89779654354", "pizza@hut.com", true, 2);
    restaurantes[3].capturarMenu("Pizza hawaiana", "Pizza de pepperonni con piña", 200f, 35, 2, true);
    restaurantes[3].capturarMenu("Pizza a la mexicana", "Pizza de pepperonni y 2 quesos con pimiento rojo y verde", 220f, 35, 2, true);
    restaurantes[3].capturarMenu("Carnes frias", "Pizza de carnes frias, chorizo, peperoni, tocino", 250f, 35, 2, true);
    restaurantes[3].capturarMenu("4 quesos", "Pizza con queso cheddar, manchego, oaxaca y azul", 180f, 35, 2, true);
    restaurantes[3].capturarMenu("Peperoni", "Pizza de pepperonni con quso manchego", 190f, 35, 2, true);

    // p = (Propietario) personas[23];
    // restaurantes[3].setMiPropietario(p.getId());

    // -------------------------------------------------------------------------------------------------

    // Restaurante 5
    restaurantes[4] = new Restaurante("Mikono", "Centro historico de morelia", "MIKO98765", "11:00am a 6:00pm", "Venta de comida japonesa a precio accesible", "mikono.mx", "89779654354", "mikono@comida.com", false, 4);

    restaurantes[4].capturarMenu("Special mix grill", "Pollo jebab y costillas a la parrilla con papas y vegetales salteados", 165f, 55, 1, true);
    restaurantes[4].capturarMenu("Bifteki mykonos", "Costilla de res servida con tzaztki y papas fritas", 120f, 90, 1, false);
    restaurantes[4].capturarMenu("Bifteki Special", "Costilla de res servida con tzaztki y papas fritas", 120f, 55, 1, false);
    restaurantes[4].capturarMenu("Kyuuri ebi", "Tiras de camaron, cangrejo, pulpo, pepino y pimiento rojo, bañados en aderezo agridulce", 72f, 55, 4, true);
    restaurantes[4].capturarMenu("Mao especial", "Verduras, camaron, cangrejo y salsa tampico", 72f, 55, 4, true);

    // p = (Propietario) personas[24];
    // restaurantes[4].setMiPropietario(p.getId());

    // Contador de restaurantes
    cRestaurantes = 5;

    //----------------------------------------------------------------
    //----------------------------------------------------------------
    //----------------------------------------------------------------

    personas[0] = new Cliente("Obed Gonzalez Hernandez", "4434856692", "ogh142003@gmail.com", "14-09-2003", "Col. loma de las carreas", "58000", 500.00f, 'H', "976545678998765434567");

    personas[1] = new Cliente("Maria Ofelia Gonzalez", "4432442244", "ofelia@gmail.com", "11-08-2000", "Vicente Riva palacio #23", "58040", 200.00f, 'M', "976545678998765434567");

    personas[2] = new Cliente("Ma. del Rocio Hernandez Pinon", "4433679813", "mrhp74@gmail.com", "19-01-1974", "Santiaguito calle Allende #43", "58460", 1000f, 'M', "976545678998765434567");

    personas[3] = new Cliente("Brenda Gonzalez Hernandez", "4433009987", "brengonh@gmail.com", "23-06-2000", "Calle insurgentes de la nacion #12", "58000", 900f, 'M', "976545678998765434567");

    personas[4] = new Cliente("Hector Altamirano", "99887654563", "hector@gmail.com", "14-01-1990", "Loma Bonita #16", "58000", 500.00f, 'H', "976545678998765434567");

    personas[5] = new Cliente("Paz Serrano", "3243443423", "pazserr@gmail.com", "14-09-1976", "Col loma de las carreras #20", "58000", 500.00f, 'M', "976545678998765434567");

    personas[6] = new Cliente("Desireth Espino", "4545907823", "desireth@gmail.com", "24-01-1999", "1ra de mayo #43", "58000", 500.00f, 'M', "976545678998765434567");

    personas[7] = new Cliente("Carolina Espino", "4490238912", "caroesp@gmail.com", "14-02-1983", "Av. Francisco I Madero #52", "58000", 500.00f, 'M', "976545678998765434567");

    personas[8] = new Cliente("Obed Gonzalez Hernandez", "4433224421", "ogh142003@gmail.com", "14-09-2003", "Ing. Elias Perez Avalos #90", "58000", 500.00f, 'H', "976545678998765434567");

    personas[9] = new Cliente("Silvestre Hernandez", "4342132413", "silvher@gmail.com", "15-06-1980", "Vicente Guerrero #901", "58000", 500.00f, 'H', "976545678998765434567");

    //----------------------------------------------------------------
    //----------------------------------------------------------------
    //----------------------------------------------------------------

    personas[10] = new Repartidor("4434856692", "Obed Gonzalez Hernandez", "GOHO030914", "ogh142003@gmail.com", "111000342453", "Bicicleta Windsor, rojo con negro", "Lomas del Santiaguito #1024", "976545678998765434567", "14-09-2003", 'H', 'B', false);

    personas[11] = new Repartidor("4434027043", "Jose Ruben Gonzalez Serrano", "GOSR690118", "jrgs.1969@gmail.com", "667498294035", "Bicicleta Benotto rodado 27", "Lomas de las carreras No. 9", "53096579835453223467", "18-01-1969", 'H', 'B', false);

    personas[12] = new Repartidor("4433679813", "Ma. del Rocio Hernandez Pinon", "HEPR740119", "mrhp74@gmail.com", "0099868756435", "null", "Lomas de las carreras No. 18", "09786756734764357860", "19-01-1974", 'M', 'P', false);

    personas[15] = new Repartidor("4433009987", "Brenda Gonzalez Hernandez", "GOHB000623", "brengonh@gmail.com", "09593767254", "Nissan Versa mod. 17", "Morelia Centro No. 97", "983487562873658723645", "23-06-2000", 'M', 'A', false);

    personas[14] = new Repartidor("4434592241", "Dafne Desireth Hernandez Espino", "HEED040809", "dafhesp2004@gmail.com", "0857385673", "Yamaha Tracer 900", "Loma Bonita No. 10", "89579485298456874523", "09-08-2004", 'M', 'M', false);

    personas[13] = new Repartidor("4432013735", "Marcos Gonzalez Hernandez", "GOHM990618", "mgh99@gmail.com", "097986756567", "Yamaha FZ21", "Lopez Mateos No. 106", "8487756829058974786", "23-06-2000", 'H', 'M', false);

    personas[16] = new Repartidor("4435669023", "Reyes Adair Villagran Chavez", "VICR030210", "reyesadairvillagran@gmail.com", "890358301204", "Italika mod. 2019", "Av. Madero No. 201", "95306729709853245343", "21-01-2003", 'H', 'M', false);

    personas[17] = new Repartidor("4433567890", "Dreyk Hernandez Espino", "HEED080821", "dreykhernandez_1000@gmail.com", "345628659783465", "Chevrolet Chevy", "Loma Bonita No. 106", "9457908234759843598", "21-08-2008", 'H', 'A', false);

    personas[18] = new Repartidor("44527598", "Raul Ramirez Baeza", "RABR860120", "raulramirez@gmail.com", "093420985729837503", "Nissan Versa", "Calle Jade No 104", "878674653435643", "1986-01-20", 'H', 'A', false);

    personas[19] = new Repartidor("4432013735", "Marcos Gonzalez Hernandez", "GOHM990618", "mgh99@gmail.com", "097986756567", "Yamaha FZ21", "Lopez Mateos No. 106", "8487756829058974786", "23-06-2000", 'H', 'M', false);

    //----------------------------------------------------------------
    //----------------------------------------------------------------
    //----------------------------------------------------------------

    Propietario p;

    personas[20] = new Propietario("Alfonso Martinez", "4439024892", "alfonsomartinez@gmail.com", "09-12-1999", "Morelia Morelia", 'H', "991209MARA", "Ingeniero");
    p = (Propietario) personas[20]; //
    p.setMiRestaurante(restaurantes[0].getRfc());

    personas[21] = new Propietario("Angel Gabriel Anguiano", "4434535463", "anguianogabriel@gmail.com", "09-11-1989", "Morelia Centro", 'H', "ANGA891109", "Inversionista");
    p = (Propietario) personas[21]; //
    p.setMiRestaurante(restaurantes[1].getRfc());

    personas[22] = new Propietario("Monica Garcia", "4467558978", "monicagarcia@gmail.com", "01-02-1990", "Av Periodismo", 'M', "GAMO900201", "Empresaria");
    p = (Propietario) personas[22]; //
    p.setMiRestaurante(restaurantes[2].getRfc());

    personas[23] = new Propietario("Miguel Hernandez", "998765434", "hernandezmigui@gmail.com", "09-07-1999", "Momunento a Lazaro Cardenas", 'H', "HEMI990709", "Estudiante");
    p = (Propietario) personas[23]; //
    p.setMiRestaurante(restaurantes[3].getRfc());

    personas[24] = new Propietario("Dafne Hernandez", "4435789098", "dafne@gmail.com", "09-08-2000", "Maravatio", 'M', "HEDA000809", "Estudiante");
    p = (Propietario) personas[24]; //
    p.setMiRestaurante(restaurantes[4].getRfc());

    cPersonas = 25;

    //----------------------------------------------------------------
    //----------------------------------------------------------------
    //----------------------------------------------------------------

    // Pedidos

    Repartidor r;
    r = (Repartidor) personas[12];
    pedidos[0] = new Pedido(personas[9].getTelefono(), restaurantes[2].getRfc(), personas[4].getDomicilio(), "00323", r.getRfc(), fecha = LocalDate.now(), hora = LocalTime.now(), 1, 1, 78.90f, 4, 5);
    pedidos[0].capturarDetalle(1, restaurantes[2].menu[4].getNombre(), "Especial", restaurantes[2].menu[4].getPrecio());

    r = (Repartidor) personas[11];
    pedidos[1] = new Pedido(personas[3].getTelefono(), restaurantes[2].getRfc(), "Lomas de las carreras", "00323", r.getRfc(), fecha = LocalDate.now(), hora = LocalTime.now(), 1, 1, 78.90f, 4, 5);
    pedidos[1].capturarDetalle(3, restaurantes[2].menu[4].getNombre(), "Especial", restaurantes[2].menu[4].getPrecio());

    cPedidos = 2;

  }

  // Datos de los clientes
  public void mostrarClientes() {
    for (int i = 0; i < cPersonas; i++)
      if(personas[i].queSoy().equals("Cliente"))
        personas[i].mostrar();
  }
  public void mostrarClientes(String cadena){
    // Imprime solo los repartidores que conicidan con la cadena pasada
    String megaCadena;
    Cliente c;
    for(Persona p : personas){ // For extendido
      if(p == null) return;
      if(p.queSoy().equals("Cliente"))
        c = (Cliente) p;
      else
        continue;

      megaCadena = c.getNombreCompleto() + c.getTelefono() + c.getCorreo() + c.getFechaNac() + c.getDomicilio() + c.getSexo() + c.getMunicipio() + c.getCodigoPostal() + c.getSaldo() + c.getCuentaBancaria();
      if(megaCadena.contains(cadena)) c.mostrar();

      megaCadena = "";
    }
  }
  public void mostrarClientes(char caracter){
    Cliente c;
    for(int i=0; i < cPersonas; i++){
      if(personas[i].queSoy().equals("Cliente"))
        c = (Cliente) personas[i];
      else
        continue;

      if(c.getSexo() == caracter) personas[i].mostrar();
    }
  }
  public void capturarCliente() {
    personas[cPersonas] = new Cliente();
    personas[cPersonas].capturar();
    cPersonas++;
  }

  // Datos de los repartidores
  // Dos metodos con el mismo nombre, pero distintas acciones, es sobrecarca de metodos
  public void mostrarRepartidores() {
    for (int i = 0; i < cPersonas; i++)
      if (personas[i].queSoy().equals("Repartidor"))
        personas[i].mostrar();
  }
  public void mostrarRepartidores(String cadena){
    // Imprime solo los repartidores que conicidan con la cadena pasada
    String megaCadena;
    Repartidor r;
    for (int i = 0; i < cPersonas; i++){
      if(personas[i].queSoy().equals("Repartidor"))
        r = (Repartidor) personas[i]; // Hacer un "cast" para engañar al compilador por los tipos de datos
      else
        continue;

      megaCadena = r.getNombreCompleto() + r.getTelefono() + r.getCorreo() + r.getFechaNac() + r.getDomicilio() + r.getSexo() + r.getRfc() + r.getLicencia() + r.getDescripcionVehiculo() + r.getCuentaBancaria() + r.getTipoVehiculo();

      if(megaCadena.contains(cadena)){personas[i].mostrar();}

      megaCadena = "";
    }
  }
  public void mostrarRepartidores(char caracter){
    Repartidor r;
    for(int i = 0; i < cRestaurantes; i++){
      if(personas[i].queSoy().equals("Repartidor"))
        r = (Repartidor) personas[i];
      else
        continue;

      if(r.getSexo() == caracter || r.getTipoVehiculo() == caracter) personas[i].mostrar();
    }
  }
  public void capturaRepartidor() {
    personas[cPersonas] = new Repartidor();
    personas[cPersonas].capturar();
    cPersonas++;
  }


  // Datos de los restaurantes
  public void mostrarRestaurantes(){
    System.out.println(cRestaurantes);
    for(int i = 0; i < cRestaurantes; i++)
      restaurantes[i].mostrar();

    do {
      System.out.print("\n\tDesea ver algun menu?(1=si, 0=no): "); val = sc.nextInt();
      if(val == 1)
        mostrarMenu();
    } while (val!=0);

    do {
      System.out.print("\n\tDesea ver el/los propietarios?(1=si, 0=no): "); val = sc.nextInt();
      if(val == 1){
        mostrarPropietarios();
      }
      else{
        System.out.println("Esa opcion no existe!");
      }
    } while (val != 0);
  }
  public void mostrarMenu(){
    for(int i = 0; i < cRestaurantes; i++)
      System.out.println((i+1) + ".- " + restaurantes[i].getNombre());

    System.out.print("Selecciones el restaurante a mostrar: "); val = sc.nextInt();
    restaurantes[val-1].mostrarMenu();
  }
  public void mostrarRestaurantes(String cadena){
    // Imprime solo los repartidores que conicidan con la cadena pasada
    String megaCadena;
    Restaurante r;
    for (int i = 0; i < cRestaurantes; i++){
      r = restaurantes[i];
      megaCadena = r.getNombre() + r.getDomicilio() + r.getRfc() + r.getHorario() +
      r.getDescripcion() + r.getSitioWeb() + r.getTelefono() + r.getCorreo() +
      r.getTipo();
      if(megaCadena.contains(cadena)){restaurantes[i].mostrar();}
      // else {System.out.println("Valor no encontrado!");}

      megaCadena = "";
    }
  }
  public void capturarRestaurante(){
    do {
      System.out.print("\nDesea capturar un \n1). nuevo restaurante, un \n2). propietario en restaurante \n3). alimento en restaurante \n0). Salir"); val = sc.nextInt();

      if(val == 1){
        restaurantes[cRestaurantes] = new Restaurante();
        restaurantes[cRestaurantes].capturar();
        cRestaurantes++;
      }

      else if(val == 2){
        System.out.println("\nSeleccione el restaurante para agregar el propietario: ");
        for(int i = 0; i < cRestaurantes; i++)
          System.out.println((i+1) + ".- " + restaurantes[i].getNombre());

        System.out.println();
        val = sc.nextInt();
        capturarPropietario(val);
      }

      else if (val == 3){
        System.out.println("Seleccione el restaurante para agregar el menu: ");
        for(int i = 0; i < cRestaurantes; i++)
          System.out.println((i+1) + ".- " + restaurantes[i].getNombre());

        val = sc.nextInt();
        restaurantes[val-1].capturarMenu();

      }
      else if (val > 3) System.out.println("\n\nLa opcion que eligio no existe, vuelva a elegir\n\n");
    } while (val != 0);
  }

  // Datos del propietario
  public void capturarPropietario(int val){
    Propietario p;
    personas[cPersonas] = new Propietario();
    personas[cPersonas].capturar();
    p = (Propietario) personas[cPersonas];
    p.setMiRestaurante(restaurantes[val-1].getRfc());
    cPersonas++;
  }
  public void mostrarPropietarios(){
    for(int i = 0; i < cRestaurantes; i++)
      System.out.println((i+1) + ".- " + restaurantes[i].getNombre());

    System.out.print("Selecciones el restaurante a mostrar: "); val = sc.nextInt();
    for(int i = 0; i < cPersonas; i++){
      if(personas[i].queSoy().equals("Propietario")){
        Propietario p = (Propietario) personas[i];

        if(p.getMiRestaurante().contains(restaurantes[val-1].getRfc()))
          personas[i].mostrar();
        else
          continue;

      }
    }
  }

  // Pedido
  public void capturarPedido(){
    pedidos[cPedidos] = new Pedido();

    System.out.println("\n\n------------------------Clientes------------------------");
    for(int i=0; i<cPersonas; i++)
      if(personas[i].queSoy().equals("Cliente"))
        System.out.println((i+1) + ".- " + personas[i].getNombreCompleto());

    System.out.print("\nSeleccione el cliente: "); val = sc.nextInt();
    pedidos[cPedidos].setTelefonoCliente(personas[val-1].getTelefono());

    System.out.print("Desea enviarlo a la direccion por defecto?(1=si, 0=no): "); val1=sc.nextInt();
    switch (val1) {
      case 0:
        String megaCadena;
        Pedido p;
        System.out.print("Puede enviarlo a direcciones anteriormente usadas(1) o ingresar una nueva(2): "); val1 = sc.nextInt();
        if(val1 == 1){
          for(int i = 0; i < cPedidos; i++) {
            p = pedidos[i];
            megaCadena = p.getTelefonoCliente();

            if(megaCadena.contains(personas[val-1].getTelefono()))
              System.out.println((i) + ".- " + pedidos[i].getDomicilioPedido());
            else
              continue;
              
            megaCadena = "";
          }

          System.out.print("Indique la direccion: "); val1 = sc.nextInt();
          pedidos[cPedidos].setDomicilioPedido(pedidos[val1].getDomicilioPedido());
        }
        else if(val1 == 2){
          System.out.print("Indique la direccion: ");
          sc.nextLine(); cad = sc.nextLine();
          pedidos[cPedidos].setDomicilioPedido(cad);
        }
        break;
        // Fin del caso 0

      case 1: pedidos[cPedidos].setDomicilioPedido(personas[val-1].getDomicilio()); break;
      // Fin del caso 1
    }
    // Informacion del cliente necesaria guardada

    System.out.println("\n\n-------------------Restaurante-------------------");
    for(int i=0; i<cRestaurantes; i++)
      System.out.println((i+1) + ".- " + restaurantes[i].getNombre());

    System.out.print("Seleccione el restaurante: "); val = sc.nextInt();
    pedidos[cPedidos].setRfcRestaurante(restaurantes[val-1].getRfc());
    System.out.println("\n\nAlimento");
    restaurantes[val-1].mostrarNombreMenu();

    System.out.print("Seleccione el alimento: ");
    val1 = sc.nextInt();

    System.out.print("Desea su alimento preparado especialmente? (1: si, 0: no): "); val3 = sc.nextInt();
    if(val3 == 1) System.out.print("Indique sus preferencias: "); sc.nextLine(); cad = sc.nextLine();

    System.out.print("Indique la cantidad: "); val2 = sc.nextInt();

    // System.out.println("Especial: " + cad);
    pedidos[cPedidos].capturarDetalle(val2, restaurantes[val-1].menu[val1-1].getNombre(), cad, restaurantes[val-1].menu[val1-1].getPrecio());

    System.out.print("Indique su forma de pago (1: Tarjeta, 2: Efectivo): "); val = sc.nextInt();
    pedidos[cPedidos].setFormaPago(val);
    // Informacion del restaurante guardada

    cad = "";

    for(int i=0; i<6; i++) {
      cad += rand.nextInt(10);
    }
    pedidos[cPedidos].setFolio(cad);

    pedidos[cPedidos].setFecha(fecha = LocalDate.now());
    pedidos[cPedidos].setHora(hora = LocalTime.now());

    cad = "";
    cPedidos++;
  }
  public void mostrarPedido(){
    for(int i = 0; i < cPedidos; i++)
      pedidos[i].mostrar();
  }

  // getters y setters
  public String getRfc() {
    return rfc;
  }
  public void setRfc(String rfc) {
    this.rfc = rfc;
  }

  public String getTelefono() {
    return telefono;
  }
  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getPagWeb() {
    return pagWeb;
  }
  public void setPagWeb(String pagWeb) {
    this.pagWeb = pagWeb;
  }

  public String getCorreo() {
    return correo;
  }
  public void setCorreo(String correo) {
    this.correo = correo;
  }

  // Impresion de los datos de la clase
  public void mostrar() {
    System.out.println("---------------------Uber---------------------");
    System.out.println("\n[rfc      : " + rfc);
    System.out.println("\ntelefono  : " + telefono);
    System.out.println("\npagWeb    : " + pagWeb);
    System.out.println("\ncorreo    : " + correo + "]");
  }
}
