public class Ebook{
    String titulo;
    String autor;
    int totalPaginas;
    int paginaAtual;
    int zoom;

    public Ebook(String titulo, String autor, int totalPaginas, int paginaAtual, int zoom){
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = paginaAtual;
        this.zoom = zoom;
    }

    public void avancarPagina(){
        this.paginaAtual++;
    }

    public void retrocederPagina(){
        this.paginaAtual--;
    }

    public void irParaPagina(int pag){
        this.paginaAtual = pag;
    }

    public int exibirPagina(){
        return this.paginaAtual;
    }

    public void mostrarCapa(){
        this.paginaAtual = 0;
    }

    public int getTotalPaginas(){
        return totalPaginas;
    }

    public String listar(){
        return this.titulo+" "+this.autor+" "+this.totalPaginas+" "+this.paginaAtual+" "+this.zoom;
    }
}