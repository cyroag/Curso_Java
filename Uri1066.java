import java.util.Scanner;

public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int pares=0, impares=0, positivos=0, negativos=0, num;


        for(int i=0; i<5; i++){
            num = teclado.nextInt();
            if(num%2 == 0){
                pares = pares+1;
            }
            else{
                impares = impares+1;
            }
            if(num > 0){
                positivos = positivos+1;
            }
            else if(num != 0){
                negativos = negativos+1;
            }
        }
        System.out.println(pares+" valor(es) par(es)");
        System.out.println(impares+" valor(es) impar(es)");
        System.out.println(positivos+" valor(es) positivo(s)");
        System.out.println(negativos+" valor(es) negativo(s)");
    }
}