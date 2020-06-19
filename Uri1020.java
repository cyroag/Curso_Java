import java.util.Scanner;

public class Uri1020{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        int total, anos, meses, dias, resto1;

        System.out.println("Digite a quantidade de dias:");
        total = teclado.nextInt();

        anos = total/365;

        resto1 = total%365;

        meses = resto1/30;

        dias = resto1%30;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
}