import java.util.Scanner;

public class EbookTeste{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int opcao,livro,pagina;
        Ebook acervo[];

        acervo = new Ebook[5];

        acervo[0] = new Ebook("Ebook0","Autor0",10,2,5);
        acervo[1] = new Ebook("Ebook1","Autor1",5,5,5);
        acervo[2] = new Ebook("Ebook2","Autor2",100,0,5);
        acervo[3] = new Ebook("Ebook3","Autor3",8,7,5);
        acervo[4] = new Ebook("Ebook4","Autor4",15,0,5);

        do{
            System.out.println("Ebooks \n");
            for(int i=0; i<acervo.length; i++){
                System.out.println(acervo[i].listar());
            }
            System.out.println("\nSelecione o ebook:");
            livro = teclado.nextInt();
            
            System.out.println("\nSelecione a opcao desejada\n1 - Avancar pagina\n2 - Retroceder pagina\n3 - Ir para Pagina\n4 - Exibir Pagina Atual\n5 - Mostrar Capa\n0 - Sair");
            opcao = teclado.nextInt();
            switch(opcao){
                case 0:
                    System.out.println("Desligando");
                    break;
                case 1:
                    if(acervo[livro].exibirPagina()<acervo[livro].getTotalPaginas()){
                        acervo[livro].avancarPagina();
                    }
                    else{
                        System.out.println("Ultima pagina");
                    }
                    break;
                case 2:
                    if(acervo[livro].exibirPagina()>0){
                        acervo[livro].retrocederPagina();
                    }
                    else{
                        System.out.println("Primeira pagina");
                    }
                    break;
                case 3:
                    System.out.println("Pagina:");
                    pagina = teclado.nextInt();
                    if(pagina>acervo[livro].getTotalPaginas() || pagina<0){
                        System.out.println("Pagina inexistente");
                    }
                    else{
                        acervo[livro].irParaPagina(pagina);
                    }
                    break;
                case 4:
                    System.out.println(acervo[livro].exibirPagina());
                    break;
                case 5:
                    acervo[livro].mostrarCapa();
                    break;
            }
        }while(opcao != 0);
    }
}