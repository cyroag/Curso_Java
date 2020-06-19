import java.util.Scanner;

public class BibliotecaTeste{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        Biblioteca b1,b2,b3,b4,b5;
        int infinito = 1;

        b1 = new Biblioteca("Livro1", "Autor1", 2001, "Cat1", 100.15, true);
        b2 = new Biblioteca("Livro2", "Autor2", 2002, "Cat2", 100.25, false);
        b3 = new Biblioteca("Livro3", "Autor3", 2003, "Cat3", 100.35, false);
        b4 = new Biblioteca("Livro4", "Autor4", 2004, "Cat4", 100.45, true);
        b5 = new Biblioteca("Livro5", "Autor5", 2005, "Cat5", 100.55, false);

        do{
            System.out.println("Sistema de Biblioteca\n");

            System.out.println(b1.imprimir());
            System.out.println(b2.imprimir());
            System.out.println(b3.imprimir());
            System.out.println(b4.imprimir());
            System.out.println(b5.imprimir());

            System.out.println("Qual livro voce deseja?");
            switch(teclado.nextInt()){
                case 1:
                    if(b1.getEmprestimo() == true){
                        System.out.println("Livro indisponível no momento.");
                    }
                    else{
                        System.out.println("Livro disponível, favor retirar na estante: "+b1.getPosicao());
                    }
                    break;
                case 2:
                    if(b2.getEmprestimo() == true){
                        System.out.println("Livro indisponível no momento.");
                    }
                    else{
                        System.out.println("Livro disponível, favor retirar na estante: "+b2.getPosicao());
                    }
                    break;
                case 3:
                    if(b3.getEmprestimo() == true){
                        System.out.println("Livro indisponível no momento.");
                    }
                    else{
                        System.out.println("Livro disponível, favor retirar na estante: "+b3.getPosicao());
                    }
                    break;
                case 4:
                    if(b4.getEmprestimo() == true){
                        System.out.println("Livro indisponível no momento.");
                    }
                    else{
                        System.out.println("Livro disponível, favor retirar na estante: "+b4.getPosicao());
                    }
                    break;
                case 5:
                    if(b5.getEmprestimo() == true){
                        System.out.println("Livro indisponível no momento.");
                    }
                    else{
                        System.out.println("Livro disponível, favor retirar na estante: "+b5.getPosicao());
                    }
                    break;
            }
        }while(infito != 0);

    }
}