import java.util.Scanner;

public class Uri1060{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int quant=0;
        float num;

        for(int i = 0;i<6;i++){
            num = teclado.nextFloat();
            if(num>0){
                quant = quant+1;
            }
        }
        System.out.println(quant + " valores positivos");
    }
}