import java.util.Scanner;

public class Uri1003{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        int A,B,SOMA;

        System.out.println("Digite os valores de A e B");
        A = teclado.nextInt();
        B = teclado.nextInt();

        SOMA = A + B;

        System.out.println("SOMA = " + SOMA);
    }
}