import java.util.Scanner;

public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int codigo,quantidade;
        float valor;

        System.out.println("Digite o codigo do item e a quantidade");

        codigo = teclado.nextInt();
        quantidade = teclado.nextInt();

        if(codigo == 1){
            System.out.printf("Total: R$ %.2f\n",valor=quantidade*4.00f);
        }
        else{
            if(codigo == 2){
                System.out.printf("Total: R$ %.2f\n",valor=quantidade*4.50f);
            }
            else{
                if(codigo == 3){
                    System.out.printf("Total: R$ %.2f\n",valor=quantidade*5.00f);
                }
                else{
                    if(codigo == 4){
                        System.out.printf("Total: R$ %.2f\n",valor=quantidade*2.00f);
                    }
                    else{
                        System.out.printf("Total: R$ %.2f\n",valor=quantidade*1.50f);
                    }
                }
            }
        }
    }
}