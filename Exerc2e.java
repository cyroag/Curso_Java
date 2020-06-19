import java.util.Scanner;

public class Exerc2e{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        float area,bmenor,bmaior,altura;

        System.out.println("Digite o valor da base menor, base maior e altura pressionando enter a cada valor");
        bmenor = teclado.nextFloat();
        bmaior = teclado.nextFloat();
        altura = teclado.nextFloat();

        area = (bmenor + bmaior) * altura /2;

        System.out.println("O valor da area do trapezio e:" + area);
    }

}