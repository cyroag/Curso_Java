import java.util.Scanner;

public class Uri1018{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        int n,centena,resto1,cinq,resto2,vinte,resto3,dezena,resto4,cinco,resto5,dois,unidade;

        System.out.println("Digite o valor:");
        n = teclado.nextInt();

        centena = n/100;
        resto1 = n%100;
        cinq = resto1/50;
        resto2 = resto1%50;
        vinte = resto2/20;
        resto3 = resto2%20;
        dezena = resto3/10;
        resto4 = resto3%10;
        cinco = resto4/5;
        resto5 = resto4%5;
        dois = resto5/2;
        unidade = resto5%2;

        System.out.println(n);
        System.out.println(centena+" nota(s) de R$ 100,00");
        System.out.println(cinq+" nota(s) de R$ 50,00");
        System.out.println(vinte+" nota(s) de R$ 20,00");
        System.out.println(dezena+" nota(s) de R$ 10,00");
        System.out.println(cinco+" nota(s) de R$ 5,00");
        System.out.println(dois+" nota(s) de R$ 2,00");
        System.out.println(unidade+" nota(s) de R$ 1,00");
    }
}