import java.util.Scanner;

public class Exerc2h{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float volume, diametro, altura;
        float pi = 3.14f;

        System.out.println("Digite o valor do diametro e da altura do cilindro:");
        diametro = teclado.nextFloat();
        altura = teclado.nextFloat();

        volume = pi * diametro/2 * diametro/2 * altura;

        System.out.printf("O volume do cilindro e: %.2f\n",volume);
    }

}