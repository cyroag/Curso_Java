import java.util.Scanner;

public class Uri1074{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int n,x;

        n = teclado.nextInt();
        for (int i=0; i<n; i++){
            x = teclado.nextInt();
            if(x == 0){
                System.out.println("NULL");
            }
            else{
                if(x > 0){
                    if (x%2 == 0){
                        System.out.println("EVEN POSITIVE");
                    }
                    else{
                        System.out.println("ODD POSITIVE");
                    }
                }
                else{
                    if(x%2 == 0){
                        System.out.println("EVEN NEGATIVE");
                    }
                    else{
                        System.out.println("ODD NEGATIVE");
                    }
                }
            }

        }
    }
}