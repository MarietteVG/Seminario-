import java.util.Scanner;

public class SumaNumeros
{
    public static void main( String[] args )
    {
        int n1, n2, suma;

        Scanner leer = new Scanner( System.in );

        System.out.print( "Introduzca primer número: " );
        n1 = leer.nextInt();

        System.out.print( "Introduzca segundo número: " );
        n2 = leer.nextInt();

        suma = n1 + n2;

        System.out.println( "RESULTADO="+ suma);
    }
}
