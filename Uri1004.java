import java.util.Scanner;

public class Uri1004{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        int A,B,PROD;

        System.out.println("Digite os valores de A e B");
        A = teclado.nextInt();
        B = teclado.nextInt();

        PROD = A * B;

        System.out.println("PROD = " + PROD);
    }
}