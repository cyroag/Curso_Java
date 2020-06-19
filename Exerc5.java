import java.util.Scanner;

public class Exerc5{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        float hora,minuto,veloc,tempo,distancia,litros;

        System.out.println("Digite o tempo gasto na viagem. Primeiro as horas e depois os minutos");
        hora = teclado.nextFloat();
        minuto = teclado.nextFloat();
        System.out.println("Informe a velocidade media:");
        veloc = teclado.nextFloat();

        tempo = hora + minuto/60;

        distancia = tempo*veloc;
        litros = distancia/12;

        System.out.printf("A quantidade de litros de combustivel gasto e de %.3f L \n", litros);
    }
}