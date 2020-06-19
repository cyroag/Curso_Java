import java.util.Scanner;

public class Uri1011{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double pi = 3.14159, v, r;

        System.out.println("Digite o raio da esfera:");
        r = teclado.nextDouble();

        v = (4.0/3)*pi*r*r*r;

        System.out.printf("VOLUME = %.3f\n",v);
    }
}