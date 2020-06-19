import java.util.Scanner;

public class Exerc2g{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

            float volume,lado;

            System.out.println("Digite o valor do lado do cubo:");
            lado = teclado.nextFloat();

            volume = lado * lado * lado;

            System.out.println("O volume do cubo e:" + volume);
    }
}