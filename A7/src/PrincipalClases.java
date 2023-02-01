import java.util.*;

public class PrincipalClases {
    public static void mostrarFlores(List<Object> flores){
        System.out.println("NOMBRE\t\tAROMA\t\t\tCOLOR\t\tPRECIO");
        for (Object flor: flores) {
            CFlor fl = (CFlor) flor;
            System.out.println(fl.getNombre()+"\t\t"+
                    fl.getAroma()+"\t\t"+
                    fl.getColor()+"\t\t"+
                    fl.getPrecio());
        }
    }

    public static void mostrarFlorPos(int posicion, List<Object> flores){
        int pos = 0;
        Boolean flag = true;
        do{
            if(posicion == pos) {
                //flores.get(posicion).mostrar();
                CFlor fl1 = (CFlor) flores.get(posicion);
                fl1.mostrar();
                flag = false;
            }
            pos++;
        }while (flag);
    }

    public static void mostrarFlor(String nombre, String color, List<Object> objetos){
        Object obj = objetos.get(0);
        if (obj instanceof CFlor)
            for (Object f : objetos) {
                CFlor fl = (CFlor) f; // Casting de datos
                if (fl.getNombre().equals(nombre) && fl.getColor().equals(color)) {
                    fl.mostrar();
                }
            }
        else if (obj instanceof CCliente)
            for (Object f: objetos) {
                CCliente fl = (CCliente) f;
                if(fl.getNombres().equals(nombre) && fl.getApellidos().equals(color)){
                    fl.mostrar();
                }
            }
    }

    public static void menuPrincipal(){
        System.out.println("*********** MENU PRINCIPAL ***********");
        System.out.println("0- Salir");
        System.out.println("1- Gestionar Flores.");
        System.out.println("2- Gestionar Clientes.");
        System.out.println("3- Gestionar Vendedores.");
        System.out.println("4- Gestionar Ventas.");
        System.out.println("   Ingrese una opcion>>  ");
    }
    public static void menuFlores(){
        System.out.println("*********** MENU FLORES ***********");
        System.out.println("0- Salir.");
        System.out.println("1- (C) Crear (Create).");
        System.out.println("2- (R) Mostrar (Read).");
        System.out.println("3- (U) Actualizar (update).");
        System.out.println("4- (D) Eliminar (Delete).");
        System.out.println("   Ingrese una opcion>>  ");
    }

    public static void main(String[] args) {
        List<Object> flores = new ArrayList<Object>();
        List<Object> clientes = new ArrayList<Object>();
        List<CVendedor> vendedores = new ArrayList<CVendedor>();
        List<CVenta> ventas = new ArrayList<CVenta>();
        List<CDetalleVenta> detalleVenta = new ArrayList<CDetalleVenta>();
        CFlor f = new CFlor("Rosa", 25);
        f.setColor("Azul");
        f.setAroma("Dulce");
        flores.add(f);
        flores.add(new CFlor("Clavel", 25));
        flores.add(new CFlor("Orquidea", 45));

        int opcionPrincipal;
        do{
            menuPrincipal();
            opcionPrincipal = new Scanner(System.in).nextInt();
            switch(opcionPrincipal){
                case 0:
                    System.out.println("Adios ...");
                    break;
                case 1:
                    int opcionFlores;
                    do {
                        menuFlores();
                        opcionFlores = new Scanner(System.in).nextInt();
                        switch (opcionFlores) {
                            case 0:
                                System.out.println("Regresando al menu Principal...");
                                break;
                            case 1:  // Insertar // Crear
                                CFlor flor = new CFlor();
                                flores.add(flor);
                                break;
                            case 2: // Mostrar
                                System.out.println("  Menu Mostrar Flor ");
                                System.out.println(" 0- Regresar al menu Flores");
                                System.out.println(" 1- Mostrar por posicion");
                                System.out.println(" 2- Mostrar por nombre y color");
                                System.out.println(" 3- Mostrar todas las flores");
                                System.out.println("   Ingrese una opcion>>  ");
                                int opcionMostrarFlores = new Scanner(System.in).nextInt();
                                switch (opcionMostrarFlores) {
                                    case 0:
                                        System.out.println(" ... Regresando al Menu Flores");
                                        break;
                                    case 1:
                                        System.out.println("Ingrese la posicion de la flor buscada: ");
                                        int posicion = new Scanner(System.in).nextInt();
                                        mostrarFlorPos(posicion, flores);
                                        break;
                                    case 2:
                                        System.out.println("Nombre: ");
                                        String n = new  Scanner(System.in).nextLine();
                                        System.out.println("Color: ");
                                        String c = new  Scanner(System.in).nextLine();
                                        mostrarFlor(n, c, flores);
                                        break;
                                    case 3:
                                        mostrarFlores(flores);
                                        break;
                                }
                                break;
                            case 3:  // Actualizar
                                System.out.println("  Menu Mostrar Flor ");
                                System.out.println(" 0- Regresar al menu Flores");
                                System.out.println(" 1- Actualizar un campo");
                                System.out.println(" 2- Actualizar todo");
                                System.out.println("   Ingrese una opcion>>  ");
                                int opcionActualizarFlor = new Scanner(System.in).nextInt();
                                switch (opcionActualizarFlor) {
                                    case 0:
                                        System.out.println(" ... Regresando al menu Flores");
                                        break;
                                    case 1:
                                        System.out.println("Ingrese la posicion a actualizar: ");
                                        int pos = new Scanner(System.in).nextInt();
                                        System.out.println("Ingrese campo que desea actualizar: ");
                                        String campo = new Scanner(System.in).nextLine();
                                        CFlor fl2 = (CFlor) flores.get(pos);
                                        switch (campo){
                                            case "nombre":
                                                System.out.println("Nuevo nombre: ");
                                                fl2.setNombre(new Scanner(System.in).nextLine());
                                                break;
                                            case "aroma":
                                                System.out.println("Nuevo aroma: ");
                                                fl2.setAroma(new Scanner(System.in).nextLine());
                                                break;
                                            case "color":
                                                System.out.println("Nuevo color: ");
                                                fl2.setColor(new Scanner(System.in).nextLine());
                                                break;
                                            case "precio":
                                                System.out.println("Nuevo precio: ");
                                                fl2.setPrecio(new Scanner(System.in).nextDouble());
                                                break;
                                        }
                                        break;
                                    case 2:

                                        break;
                                }
                                break;
                            case 4: break;
                            default:
                                break;
                        }
                        break;
                    } while ( opcionFlores != 0 );
                case 2:
                    break;
                case 3: break;
                case 4: break;
                default: break;
            }
        } while (opcionPrincipal != 0);
    }
}