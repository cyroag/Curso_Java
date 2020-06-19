import java.util.Scanner;

public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int quant=0;
        float num,media,soma=0;

        for(int i = 0;i<6;i++){
            num = teclado.nextFloat();
            if(num>=0){
                quant = quant+1;
                soma = soma + num;
            }
        }
        System.out.println(quant + " valores positivos");
        media = soma/quant;
        System.out.printf("%.1f\n",media);
    }
}