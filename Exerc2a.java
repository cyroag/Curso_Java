import java.util.Scanner; 

public class Exerc2a{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float lado, area;

        System.out.println("Digite o lado do quadrado:");

        lado = teclado.nextFloat();

        area = lado * lado;

        System.out.println("O valor da area é = " +area);
    }
}