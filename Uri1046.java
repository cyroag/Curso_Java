import java.util.Scanner;

public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        int hinicial, hfinal, duracao;

        hinicial = teclado.nextInt();
        hfinal = teclado.nextInt();

        if(hfinal < hinicial){
            duracao = hfinal + 24 - hinicial;
        }
        else if(hfinal == hinicial){
            duracao = 24;
        }
        else{
            duracao = hfinal - hinicial;
            }
        System.out.println("O JOGO DUROU "+duracao+" HORA(S)");
    }
}