import java.util.Scanner;

public class Uri1067{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        int x, i=1;

        x = teclado.nextInt();

        while(i<=x){
            if(i%2 != 0){
                System.out.println(i);
            }
            i++;
        }
    }
}