import java.util.Scanner;

public class Exerc20{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        int sexo;
        float altura,peso;

        System.out.println("Digite o sexo da pessoa (1-Homem/2-Mulher):");
        sexo = teclado.nextInt();
        System.out.println("Digite a altura:");
        altura = teclado.nextFloat();

        if(sexo == 1){
            peso = (72.7f*altura)-58.0f;
        }
        else{
            peso = (62.1f*altura)-44.7f;
        }

        System.out.println("Peso ideal:" +peso);
    }
}