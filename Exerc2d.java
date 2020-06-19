import java.util.Scanner;

public class Exerc2d{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        float area,diag1,diag2;

        System.out.println("Digite o valor da diagonal 1:");
        diag1 = teclado.nextFloat();
        System.out.println("Digite o valor da diagonal 2:");
        diag2 = teclado.nextFloat();

        area = diag1 * diag2;

        System.out.println("O valor da area do losango e:" + area);
    }
}