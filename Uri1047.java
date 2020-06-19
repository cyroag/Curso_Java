import java.util.Scanner;

public class Uri1047{
    public static void main(String args []){
        Scanner teclado = new Scanner (System.in);

        int hi, mi, hf, mf, horarioinicial, horariofinal, duracao, horas=0, minutos=0;

        hi = teclado.nextInt();
        mi = teclado.nextInt();
        hf = teclado.nextInt();
        mf = teclado.nextInt();

        horarioinicial = hi*60+mi;
        horariofinal = hf*60+mf;

        if(horariofinal>horarioinicial){
            duracao = horariofinal-horarioinicial;
            horas = duracao/60;
            minutos = duracao%60;
        }

        if(horariofinal == horarioinicial){
            horas = 24;
            minutos = 0;
        }

        if(horariofinal<horarioinicial){
            duracao = 1440-horariofinal-horarioinicial;
            horas = duracao/60;
            minutos = duracao%60;
        }
       
        System.out.println("O JOGO DUROU "+horas+" HORA(S) E "+minutos+" MINUTO(S)");
    }
}