import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int func,horas;
        double valor,salario;

        System.out.println("Digite o numero do funcionario, as horas trabalhadas e o valor/hora:");
        func = teclado.nextInt();
        horas = teclado.nextInt();
        valor = teclado.nextDouble();

        salario = horas*valor;

        System.out.println("NUMBER = "+func);
        System.out.println("SALARY = U$ "+salario);
    }
}