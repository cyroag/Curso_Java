import java.util.Scanner;

public class Exerc2c{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float area,base,altura;

        System.out.println("Digite o valor da base:");
        base = teclado.nextFloat();
        System.out.println("Digite o valor da altura:");
        altura = teclado.nextFloat();

        area = (base * altura)/2;

        System.out.println("O valor da area do tringulo e:" + area);

    }
}