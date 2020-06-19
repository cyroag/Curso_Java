import java.util.Scanner;

public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        int quant=0, num;

        for (int cont=1;cont<=5;cont++){
            num = teclado.nextInt();
            if(num%2 == 0){
                quant = quant+1;
            }
        }
        System.out.println(quant+" valores pares");
    }
}
