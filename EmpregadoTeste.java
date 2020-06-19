import java.util.Scanner;

public class EmpregadoTeste{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        int opcao;
        String nome;
        Empregado e1, e2, e3;

        e1 = new Empregado("Cyro", "analista TI", 1000.00);
/*      
        e2 = new Empregado("Joao", "coordenador", 2000.00);
        e3 = new Empregado("Pedro", "gerente", 3000.00);
*/

        do{
            System.out.println("Digite sua opção: 1- Sair "/*/ 2- Consultar cargo / 3- Alterar cargo / 4- Consultar salário / 5- Alterar salário /*/+" / 6- Aumentar salário / 7- Imprimir Empregados");
            opcao = teclado.nextInt();

            switch(opcao){
/*                case 1:
                    System.out.println("Digite o nome do funcionario, cargo e seu salario:");
                    Empregado(teclado.nextLine(), teclado.nextLine(), teclado.nextDouble());
                    System.out.println("Funcionario incluido!");
                    break;
                case 2:
                    System.out.println("Digite o nome do empregado:");
                    nome = teclado.nextLine();
                    if(nome == "Cyro"){
                        System.out.println(e1.getCargo());
                        break;
                    }
                    else if(nome == "Joao"){
                        System.out.println(e2.getCargo());
                        break;
                    }
                    else if(nome == "Pedro"){
                        System.out.println(e3.getCargo());
                        break;
                    }
*/
                case 2:
                    System.out.println(e1.getCargo());
                    break;

                case 6:
                    System.out.println("Digite o percentual de aumento:");
                    e1.aumentarSalario(teclado.nextDouble());
                    System.out.println(String.format("R$ %.2f",e1.getSalario()));
                    break;
                case 7:
                    System.out.println(e1.imprimir());
                    break;
                case 1:
                    System.out.println("Fim do programa!");
                

            }
        }while(opcao != 1);


    }
}