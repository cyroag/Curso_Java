import java.util.Scanner;

public class Uri1036{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        double a,b,c,r1,r2;

        System.out.println("Digite os parametros");
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        if((b*b-4*a*c)<0 || a == 0){
            System.out.println("Impossivel calcular");
        }
        else{
            r1 = (-b+Math.sqrt(b*b-4*a*c))/(2.0f*a);
            r2 = (-b-Math.sqrt(b*b-4*a*c))/(2.0f*a);

            System.out.printf("R1 = %.5f\n",r1);
            System.out.printf("R2 = %.5f\n",r2);
        }        
    }
}