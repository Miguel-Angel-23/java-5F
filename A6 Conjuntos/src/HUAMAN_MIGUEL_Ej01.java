 public class HUAMAN_MIGUEL_Ej01 {

    public static int[] unir(int[] A, int[] B) {
        int dup = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j])
                    dup++;
            }
        }
        int[] union = new int[A.length + B.length - dup];
        // COPIAR LOS ELEMENTOS DE A EN UNION
        for (int i = 0; i < A.length; i++) {
            union[i] = A[i];
        }

        int cont = 0;
        for (int i = 0; i < B.length; i++) {
            if (!existe(B[i], union)) {
                union[cont + A.length] = B[i];
                cont++;
            }
        }


        return union;
    }

    public static int[] intersectar(int[] a, int[] b){
//        int[] interseccion = new int[a.length + b.length];
        int tamInterseccion = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i] == b[j]) {
                    tamInterseccion++;
                }
            }
        }

        int[] interseccion = new int[tamInterseccion];

        int cont=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i] == b[j]) {
                    interseccion[cont] = a[i]; // b[j]
                    cont++;
                }
            }
        }

        return interseccion;
    }
    public static int [] Diferencia (int[] A, int []B){

        int conj = 0;
        int cont;
        int[]diferenciar = new int[A.length+B.length];
        for (int i = 0; i < A.length; i++) {
            cont=0;
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    cont++;
                }
            }

            if (cont == 0) {
                diferenciar [conj] = A[i];
                conj++;
            }
        }
        int[] Diferencia = new int[conj];

        int cont2 = 0;
        for (int i = 0; i < conj; i++) {
            Diferencia[cont2]= diferenciar [i];
            cont2++;
        }
        return Diferencia;
    }

    public static int [] Diferencia_Simetrica (int[] A, int []B){

        int[] difA = Diferencia(A, B);
        int[] difB = Diferencia(B, A);

        int[] DiferenciaSimetrica = new int[difA.length + difB.length];
        int cont=0;
        for (int i = 0; i < difA.length; i++){
            DiferenciaSimetrica[cont]=difA[i];
            cont++;
        }
        for (int i = 0; i < difB.length; i++){
            DiferenciaSimetrica[cont]=difB[i];
            cont++;
        }
        return DiferenciaSimetrica;

    }


    public static Boolean existe(int elem, int[] conj){
        Boolean flag = false;
        for (int i = 0; i < conj.length; i++) {
            if(conj[i] == elem)
                flag = true;
        }
        return flag;
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[031m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_GREEN = "\u001B[32m";


    public static int menu(){
        scan.escribirLn(ANSI_RED+"\n ------ MENU PRINCIPAL ------ "+ANSI_RESET);
        scan.escribirLn(ANSI_GREEN+"_______ OPERACIONES CON CONJUNTOS ______"+ANSI_RESET);
        scan.escribirLn(ANSI_GREEN+"0- Salir"+ANSI_RESET);
        scan.escribirLn(ANSI_GREEN+"1- Union"+ANSI_RESET);
        scan.escribirLn(ANSI_GREEN+"2- Interseccion"+ANSI_RESET);
        scan.escribirLn(ANSI_GREEN+"3- Diferencia"+ANSI_RESET);
        scan.escribirLn(ANSI_GREEN+"4- Diferencia Simétrica"+ANSI_RESET);
        scan.escribirLn(ANSI_GREEN+"5- Cambiar conjuntos"+ANSI_RESET);
        return scan.leerEntero(">> Ingrese una opcion (0 - 5)");
    }
    public static int[] leerConjunto(String nombre, int tam)    {
        int[] a = new int[tam];
        for (int i = 0; i < a.length; i++) {
            int validar = scan.leerEntero(nombre+"["+i+"]");
            while (existe(validar,a)){
                scan.escribirLn(ANSI_RED+"X-Error-X : Este valor se repite porfavor digite otro: "+ANSI_RESET);
               scan.escribirLn(ANSI_RED+"-->>Digite otro valor diferente para "+nombre+"["+i+"]"+ANSI_RESET);
                validar = scan.leerEntero(nombre+"["+i+"]");
            }
            a[i] =validar;
        }
        return a;
    }

    public static void mostrarConjunto(String nombre, int[] conj){
        scan.escribir(nombre+" = { ");
        for (int i = 0; i < conj.length; i++) {
            if ( i == conj.length-1 )
                scan.escribir(conj[i]+"");
            else
                scan.escribir(conj[i] + " ");
        }
        scan.escribirLn(" }");
    }

    public static void main(String[] args) {
        scan.escribirLn("____ OPERACIONES CON CONJUNTOS ____");
        String nombre1 = scan.leertexto("Nombre de primer Conjunto");
        int tam1 = scan.leerEntero("Tamaño de "+nombre1);
        int[] A = leerConjunto(nombre1,tam1);
        mostrarConjunto(nombre1,A);

        String nombre2 = scan.leertexto("Nombre de segundo Conjunto");
        int tam2 = scan.leerEntero("Tamaño de "+nombre2);
        int[] B = leerConjunto(nombre2,tam2);
        mostrarConjunto(nombre2,B);

        int opcion;
        do {
             opcion = menu();
            switch (opcion) {
                case 0:
                    scan.escribirLn("Adios Vuelva Pronto...");
                    break;
                case 1:
                    scan.escribirLn(ANSI_YELLOW+"Vamos a UNIR los conjuntos"+ANSI_RESET );
                    mostrarConjunto(nombre1, A);
                    mostrarConjunto(nombre2, B);
                    int[] union = unir(A, B);
                    mostrarConjunto(ANSI_YELLOW+"Union: "+"AuB "+ANSI_RESET , union);

                    break;
                case 2:
                    scan.escribirLn(ANSI_CYAN+"Vamos a INTERSECTAR los conjuntos"+ANSI_RESET);
                    mostrarConjunto(nombre1, A);
                    mostrarConjunto(nombre2, B);
                    mostrarConjunto(ANSI_CYAN+"Interseccion: "+"A∩B "+ANSI_RESET,intersectar(A,B));


                    break;
                case 3:
                    scan.escribirLn(ANSI_BLUE+"Vamos a hallar la DIFERENCIA de los conjuntos"+ANSI_RESET);
                    mostrarConjunto(nombre1, A);
                    mostrarConjunto(nombre2, B);
                    mostrarConjunto(ANSI_BLUE+"Diferencia de A: "+"A-B "+ANSI_RESET,Diferencia(A,B));
                    mostrarConjunto(ANSI_BLUE+"Diferencia de B: "+"B-A "+ANSI_RESET,Diferencia(B,A));
                    break;
                case 4:
                    scan.escribirLn(ANSI_GREEN+"Vamos a hallar la DIFERENCIA SIMÉTRICA de los conjuntos"+ANSI_RESET);
                    mostrarConjunto(nombre1, A);
                    mostrarConjunto(nombre2, B);
                    mostrarConjunto(ANSI_GREEN+"Diferencia Simetrica:  "+"AΔB "+ANSI_RESET,Diferencia_Simetrica(A,B));

                    break;
                case 5:

                    scan.escribirLn("Vamos a CAMBIAR los conjuntos");
                    nombre1 = scan.leertexto("Nombre de primer Conjunto");
                    tam1 = scan.leerEntero("Tamaño de "+nombre1);
                    A = leerConjunto(nombre1,tam1);
                    mostrarConjunto(nombre1,A);

                    nombre2 = scan.leertexto("Nombre de segundo Conjunto");
                    tam2 = scan.leerEntero("Tamaño de "+nombre2);
                    B = leerConjunto(nombre2,tam2);

                    break;
                default:
                    scan.escribirLn("Opcion fuera de rango (0 - 5)");

                    break;
            }
        }while (opcion!=0);
    }
    }

