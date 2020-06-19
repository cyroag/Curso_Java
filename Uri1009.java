import java.util.Scanner;

public class Uri1009{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        String nome;
        double salario, venda, total;

        nome = teclado.nextLine();
        salario = teclado.nextDouble();
        venda = teclado.nextDouble();

        total = salario + 0.15*venda;

        System.out.printf("TOTAL = R$ %.2f\n",total);
    }
}