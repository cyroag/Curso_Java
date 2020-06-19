import java.util.Scanner;

public class Uri1035{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int a,b,c,d;

        System.out.println("Digite os valores de A, B, C e D:");
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();

        if(b>c && d>a && c+d>a+b && c>0 && d>0 && a%2==0){
            System.out.println("Valores aceitos");
        }
        else{
            System.out.println("Valores nao aceitos");
        }
    }
}