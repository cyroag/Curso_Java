public class Biblioteca{
    String titulo;
    String autor;
    int ano;
    String categoria;
    double posicao;
    boolean emprestimo;

    public Biblioteca(String titulo, String autor, int ano, String categoria, double posicao, boolean emprestimo){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.categoria = categoria;
        this.posicao = posicao;
        this.emprestimo = emprestimo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return this.autor;
    }

    public void setAno(int ano){
        this.ano = ano;
    }
    public int getAno(){
        return this.ano;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public String getCategoria(){
        return this.categoria;
    }

    public void setPosicao(double posicao){
        this.posicao = posicao;
    }
    public double getPosicao(){
        return this.posicao;
    }

    public void setEmprestimo(boolean emprestimo){
        this.emprestimo = emprestimo;
    }
    public boolean getEmprestimo(){
        return this.emprestimo;
    }

    public String imprimir(){
        return this.titulo+", "+this.autor+". Ano: "+this.ano+". Categoria: "+this.categoria+". Local: "+this.posicao+" - "+this.emprestimo;
    }

    public void emprestar(){
        this.emprestimo = true;
    }

    public void devolver(){
        this.emprestimo = false;
    }



}