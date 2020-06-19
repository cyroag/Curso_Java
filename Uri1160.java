import java.util.Scanner;

public class Uri1160{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        int PA,PB,anos=0;
        Double G1,G2;

        PA = teclado.nextInt();
        PB = teclado.nextInt();
        G1 = teclado.nextDouble();
        G2 = teclado.nextDouble();

        do{
            PA = (int)(PA+PA*G1/100);
            PB = (int)(PB+PB*G2/100);
            anos++;
            if (anos > 100){
                break;
            }            
        } while (PA <= PB);
        if (anos > 100){
            System.out.println("Mais de 1 seculo.");
        }
        else{
            System.out.println(anos +" anos.");
        }
        
    }
}