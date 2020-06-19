import java.util.Scanner;

public class Exerc3{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        float salario,gasto,kw,total;

        System.out.println("Digite o valor do salario minimo:");
        salario = teclado.nextFloat();
        System.out.println("Digite a quantidade de kw gasto:");
        gasto = teclado.nextFloat();

        kw = salario/700;

        System.out.printf("O valor de cada kw e: %.2f RS \n", kw);

        total = gasto*kw;

        System.out.printf("O valor total a ser pago e: %.2f RS \n",total);

        System.out.printf("Valor total a ser pago com desconto: %.2f RS \n", total*0.9);
    }
}