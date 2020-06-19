import java.util.Scanner;

public class Uri1051{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        float salario, aux, imposto;

        System.out.println("Digite o salario");
        salario = teclado.nextFloat();

        if(salario <= 2000){
            System.out.println("Isento");
        }
        else{
            if(salario <= 3000){
                aux = salario - 2000;
                imposto = aux*0.08f;
                System.out.printf("R$ %.2f\n", imposto);
            }
            else{
                if(salario <= 4500){
                    aux = salario - 3000;
                    imposto = aux*0.18f + 1000*0.08f;
                    System.out.printf("R$ %.2f\n", imposto);
                }
                else{
                    aux = salario - 4500;
                    imposto = aux*0.28f + 1500*0.18f + 1000*0.08f;
                    System.out.printf("R$ %.2f\n", imposto);                
                }
            }
        }
    }
}