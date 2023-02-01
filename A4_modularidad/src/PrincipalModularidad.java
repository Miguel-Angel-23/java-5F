import java.util.Random;
import java.util.Scanner;

public class PrincipalModularidad {


    public static int leerEntero(){
        boolean flag = true;
        int e = 0;
        Scanner sc;
        do {
            try {

                sc = new Scanner(System.in); // Ingreso de datos del teclado

                e = sc.nextInt();  // Convierte el dato en Entero
                flag=false;

            }

            catch (Exception ex){
                System.out.println("*Error: ingrese un numero válido.");
                System.out.print("--->>Ingrese un número: ");
                flag= true;
//            ex.printStackTrace();
//            System.out.print(ex.getMessage());
            }

        }
        while(flag);

        return e;
    }

    public static int leerEnt(){
        return new Scanner(System.in).nextInt();
    }

    public static int sumar(int num1, int num2){
        int suma = num1 + num2;
        return suma;
    }

    public static int restar(int num1, int num2){
        int dif = num1 - num2;
        return dif;
    }

    public static int multiplicar(int num1, int num2){
        int prod = num1 * num2;
        return prod;
    }

    public static int dividir(int num1, int num2){
        int cos = num1 / num2;
        return cos;

        }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[031m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        int opcion;
        do {

            System.out.println(ANSI_RED+ "******* MENU *******"+ ANSI_RESET);
            System.out.println(ANSI_CYAN+"  0- Salir."+ ANSI_RESET);
            System.out.println(ANSI_CYAN+"  1- Sumar."+ ANSI_RESET);
            System.out.println(ANSI_CYAN+"  2- Restar."+ ANSI_RESET);
            System.out.println(ANSI_CYAN+"  3- Multiplicar."+ ANSI_RESET);
            System.out.println(ANSI_CYAN+"  4- Dividir."+ ANSI_RESET);
            System.out.print(ANSI_YELLOW+"--->> Ingrese una opción: "+ ANSI_RESET);
            opcion = leerEntero();
            int num1 = 0;
            int num2 = 0;
            if (opcion != 0) {

                switch ( opcion ){
            case 0:
                    System.out.println("Gracias por usar esta humilde calculadora. Vuelva pronto");
                    break;
                    case 1:
                     System.out.print("Ingrese sumado1 entero: ");
                     num1 = leerEntero();
                     System.out.print("Ingrese sumando2 entero: ");
                     num2 = leerEntero();
                     System.out.println("La suma de " + num1 + " y " + num2 + " es: " + sumar(num1, num2));
                        break;

                    case 2:
                     System.out.print("Ingrese minuendo entero: ");
                     num1 = leerEntero();
                     System.out.print("Ingrese sustraendo entero: ");
                     num2 = leerEntero();
                     System.out.println("La diferencia de " + num1 + " y " + num2 + " es: " + restar(num1, num2));
                        break;

                    case 3:
                     System.out.print("Ingrese un numero entero: ");
                     num1 = leerEntero();
                     System.out.print("Ingrese otro numero entero: ");
                     num2 = leerEntero();
                     System.out.println("El producto de " + num1 + " y " + num2 + " es: " + multiplicar(num1, num2));
                        break;

                    case 4:
                     System.out.print("Ingrese un numero entero: ");
                     num1 = leerEntero();
                     System.out.print("Ingrese otro numero entero: ");
                     num2 = leerEntero();

                        if (num2 == 0){
                            System.out.println("Error: el divisor no puede ser cero (0):");
                            System.out.println(ANSI_GREEN+"  0- Regresar al menu anterior. "+ANSI_RESET);
                            System.out.println(ANSI_GREEN+"  1- Ingresa un nuevo divisor. "+ANSI_RESET);
                            System.out.print("  --->> Seleccione una opcion: ");
                            int opcionDivisor = leerEntero();
                            if (opcionDivisor == 0){
                                System.out.println("  Regresando al menu anterior ...");
                            }
                            else{
                                System.out.print("  --->> Nuevo divisor: ");
                                num2 = leerEntero();
                                if (num2 == 0){
                                    System.out.println("    Ingresaste cero nuevamente \n Regresando al menu principal...");
                                } else {
                                    System.out.println("El cosiente de " + num1 + " y " + num2 + " es: " + dividir(num1, num2));
                                }
                            }
                        }else{
                            System.out.println("El cosiente de " + num1 + " y " + num2 + " es: " + dividir(num1, num2));
                        }

                        break;

                    default:
                        System.out.println("Esa opción no es válida.");
                        break;
                }
            } else {
                System.out.println("Gracias por usar esta humilde calculadora. Vuelva pronto");
            }
        } while ( opcion > 0 );
    }
}


