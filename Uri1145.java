import java.util.Scanner;

public class Uri1145{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        int x,y;

        x = teclado.nextInt();
        y = teclado.nextInt();

        for(int i=0; i<y; i++){
            for(int j=0; j<x; j++){
                System.out.println((j*i+1)+" "+(j*i+2)+" "+(j*i+3));
            }
        }
    }
}