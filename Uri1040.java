import java.util.Scanner;

public class Uri1040{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float n1,n2,n3,n4,media,exame,notafinal;

        System.out.println("Digite as notas do aluno");

        n1 = teclado.nextFloat();
        n2 = teclado.nextFloat();
        n3 = teclado.nextFloat();
        n4 = teclado.nextFloat();

        media = (n1*2 + n2*3 + n3*4 + n4)/10;

        System.out.printf("Media: %.1f\n",media);

        if(media >= 7.0f){
            System.out.println("Aluno aprovado.");            
        }
        else{
            if(media < 5.0f){
                System.out.println("Aluno reprovado.");
            }
            else{
                System.out.println("Aluno em exame.");
                exame = teclado.nextFloat();
                System.out.printf("Nota do exame: %.1f\n",exame);
                notafinal = (media + exame)/2.0f;
                if(notafinal >= 5.0f){
                    System.out.println("Aluno aprovado.");
                }
                else{
                    System.out.println("Aluno reprovado.");
                }
                System.out.printf("Media final: %.1f\n",notafinal);
            }
        }
    }
}