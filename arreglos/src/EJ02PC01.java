    import java.util.Scanner;
public class EJ02PC01 {

    public static int validarNumero()
    {
        int entero=0;
        boolean flag = true;

        do {
            try {
                Scanner readint= new Scanner(System.in);
                entero = readint.nextInt();
                flag = false;
            }catch (Exception e){
                e.getMessage();
                System.out.println("X--ERROR--X:>>>Es un entero Inválido.");
                System.out.print("Digite un número valido: ");
                flag = true;
            }
        } while (flag);
        return entero;
    }

    public static int[] A;
    public static int tam;
    public static int num;
    public static void poblarArreglo(){
        A = new int[tam];
        for (int i = 0; i < tam; i++) {
            int nro=i*num;
            A[i] = nro;
            System.out.println("["+nro+"]");
        }

    }

    // Buscar un elementode
    public static int buscarElemento(int elemento){
        int posición=0;
        for (int i=0;i<A.length;i++)
        {
            if (elemento==A[i])
            {
                posición=i+1;
            }
        }

        return posición;
    }
    public static int[] getPares(int tam, int[] lista){
        int [] A= new int [tam]; // Almacen temporal
        int j=0; // Contador
        for (int i = 0; i < lista.length; i++) {
            if(lista[i]!=0)
            {
                if (lista[i]%2==0){
                    A[j]=lista[i];
                    j++;
                }
            }
            if(j==tam)break;
        }
        return A;
    }
    public static void mostrarElementos( int[] lista){
        scan.escribir("Los elementos del Arreglo son = (  ");
        for (int i = 0; i < lista.length; i++) {
            if ( i == lista.length-1 )
                scan.escribir(lista[i]+"");
            else
                scan.escribir(lista[i] + ", ");
        }
        scan.escribirLn(" )");
    }
    public static void main(String[] args) {

        scan.escribir("Digite el tamaño del Arreglo: ");
        tam = validarNumero();

        scan.escribir("Digite un número, para hallar su múltiplo: ");
        num = validarNumero();
        poblarArreglo();


        mostrarElementos(A);
        scan.escribir("Ingrese un elemento del Arreglo que decea buscar: ");
        int elemento = validarNumero();
        int posición = buscarElemento(elemento);
        scan.escribirLn("El elemento: "+elemento);
        scan.escribirLn("Esta ubicado en la posición: " + posición);

        int tam1=0;
        for (int i = 0; i < tam; i++) {
            if(A[i]!=0)
            {
                if (A[i]%2==0){
                    tam1++;
                }
            }
        }
        int[]B=getPares(tam1,A);

        scan.escribirLn(" --->>>Elementos pares del arreglo >");
        mostrarElementos(B);

    }
    }




