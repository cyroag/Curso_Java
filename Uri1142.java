import java.util.Scanner;

public class Uri1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        int n;

        n = teclado.nextInt();

        for (int i=0; i<n; i++){
            System.out.println((1+4*i)+" "+(2+4*i)+" "+(3+4*i)+" PUM");
        }
    }
}