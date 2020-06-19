import java.util.Scanner;

public class Uri1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        int alcool=0, gasolina=0, diesel=0, escolha;

        escolha = teclado.nextInt();

        while(escolha != 4){
            if (escolha == 1){
                alcool = alcool+1;
            }
            else if (escolha == 2){
                gasolina = gasolina+1;
            }
            else if (escolha == 3){
                diesel = diesel+1;
            }
            escolha = teclado.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+alcool);
        System.out.println("Gasolina: "+gasolina);
        System.out.println("Diesel: "+diesel);
    }
}