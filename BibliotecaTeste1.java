import java.util.Scanner;

public class BibliotecaTeste{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int opcao, livro;
        Biblioteca acervo[];

        acervo = new Biblioteca[5];

        acervo[0] = new Biblioteca("Livro 0","Autor 0",2000,"Cat 0",1,1,false);
        acervo[1] = new Biblioteca("Livro 1","Autor 1",2001,"Cat 1",2,2,false);
        acervo[2] = new Biblioteca("Livro 2","Autor 2",2002,"Cat 2",3,3,false);
        acervo[3] = new Biblioteca("Livro 3","Autor 3",2003,"Cat 3",4,4,false);
        acervo[4] = new Biblioteca("Livro 4","Autor 4",2004,"Cat 4",5,5,false);

        do{
            System.out.println("Sistema de Biblioteca\n\n1 - Listar livros\n2 - Solicitar empréstimo\n3 - Devolver livro\n0 - Sair");
            
            opcao = teclado.nextInt();

            switch(opcao){
                case 0:
                    System.out.println("Obrigado por utilizar o sistema!");
                    break;
                case 1:
                    for(int i=0; i<acervo.length; i++){
                        System.out.println(acervo[i].imprimir());
                    }
                    break;
                case 2:
                    System.out.println("Selecione o livro:");
                    livro = teclado.nextInt();
                    if(acervo[livro].isEmprestado() == true){
                        System.out.println("Livro indisponivel");
                    }
                    else{
                        System.out.println("Livro disponivel. Retire o livro na localizacao: "+acervo[livro].getEstante()+" - "+acervo[livro].getPrateleira());
                        acervo[livro].emprestar();
                    }
                    break;
                case 3:
                    System.out.println("Selecione o livro:");
                    livro = teclado.nextInt();
                    if(acervo[livro].isEmprestado() == false){
                        System.out.println("Livro já foi devolvido");
                    }
                    else{
                        System.out.println("Devolva o livro na localizacao: "+acervo[livro].getEstante()+" - "+acervo[livro].getPrateleira());
                        acervo[livro].devolver();
                    }
                    break;
            }
        }while(opcao != 0);
    }
}