import java.util.Scanner;

public class Uri1007{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int A,B,C,D,DIFERENCA;

        System.out.println("Digite os valores A, B, C e D");
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

        DIFERENCA = (A*B)-(C*D);

        System.out.println("DIFERENCA = " + DIFERENCA);
    }
}