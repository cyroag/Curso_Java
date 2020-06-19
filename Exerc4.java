import java.util.Scanner;

public class Exerc4{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        float valorHora, horas, percINSS, salario;

        System.out.println("Digite o valor da hora trabalhada:");
        valorHora = teclado.nextFloat();
        System.out.println("Digite a quantidade de horas trabalhadas:");
        horas = teclado.nextFloat();
        System.out.println("Informe o percentual de desconto do INSS:");
        percINSS = teclado.nextFloat();

        salario = valorHora * horas * (100-percINSS)/100;

        System.out.printf("O Salario Liquido sera de: %.2f RS \n", salario);
    }
}