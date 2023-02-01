import java.util.Arrays;
import java.util.Scanner;

public class EJ02PC02 {

    public static void  Write(String mensaje){System.out.print(mensaje);}
    public static int pedir_numero()
    {
        int a=0;
        boolean flag = true;

        do {
            try {
                Scanner readint= new Scanner(System.in);
                a = readint.nextInt();
                flag = false;
            }catch (Exception e){
                e.getMessage();
                Write("[ERROR-X: Digito ingresado no es un número--XXXX \n Digile el número nuevamente: ");
                flag = true;
            }
        } while (flag);
        return a;
    }

    public static int[] poblarPares( int tam){
        int[] a = new int[tam];
        for (int i = 1; i < tam+1; i++) {
            int numero=i*2;
            a[i-1] = numero;
            Write("["+numero+"]");
        }
        return a;
    }
    public static int[] poblarImpares( int tam){
        int[] a = new int[tam];
        int numero=1;
        for (int i = 0; i < tam; i++) {

            a[i] = numero;
            Write("["+numero+"]");
            numero+=2;
        }
        return a;
    }
    public static void mostrarArreglo( int[] list){
        Write("\nOrden de Lista = ( ");
        for (int i = 0; i < list.length; i++) {
            if ( i == list.length-1 )
                Write(list[i]+"");
            else
                Write(list[i] + "/ ");
        }
        Write(" )");
    }


    public static void main(String[] args) {

        Write("Ingrese el tamaño del Primer arreglo : ");
        int tam1=pedir_numero();
        int []A=poblarPares(tam1);

        Write("\nIngrese el tamaño del Segundo arreglo:  ");
        int tam2=pedir_numero();
        int []B=poblarImpares(tam2);


        int []C=new int[tam2+tam1];
        for(int i=0;i<(tam1);i++){
            C[i]=A[i];
        }
        int j=0;
        for(int i=tam1;i<(tam1+tam2);i++){
            C[i]=B[j];
            j++;
        }
        Arrays.sort(C);
        mostrarArreglo(C);


    }
}




