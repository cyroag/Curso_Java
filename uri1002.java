import java.util.Scanner;

public class uri1002{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        double area, raio;
        double pi = 3.14159;

        System.out.println("Digite o raio do circulo:");
        raio = teclado.nextDouble();

        area = pi * raio * raio;

        System.out.printf("A=%.4f",area);
    }
}