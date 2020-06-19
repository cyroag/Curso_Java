import java.util.Scanner;

public class Uri1072{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        int n,x,in=0,out=0;

        n = teclado.nextInt();

        for (int i=0; i<n; i++){
            x = teclado.nextInt();
            if (x >= 10 && x <= 20){
                in = in+1;
            }
            else{
                out = out+1;
            }
        }
        System.out.println(in+" in");
        System.out.println(out+" out");
    }
}