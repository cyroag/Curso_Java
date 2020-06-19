import java.util.Scanner;

public class Exerc2f{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        float volume,altura,largura,profundidade;

        System.out.println("Digite o valor da altura, largura e profunidade do paralelepipedo:");
        altura = teclado.nextFloat();
        largura = teclado.nextFloat();
        profundidade = teclado.nextFloat();

        volume = altura * largura * profundidade;

        System.out.println("O valor do volume do paralelepipedo e:" + volume);
    }
}