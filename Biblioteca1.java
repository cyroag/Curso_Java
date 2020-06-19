public class Biblioteca{
    String titulo;
    String autor;
    int ano;
    String categoria;
    int estante;
    int prateleira;
    boolean emprestado;

    public Biblioteca(String titulo, String autor, int ano, String categoria, int estante, int prateleira, boolean emprestado){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.categoria = categoria;
        this.estante = estante;
        this.prateleira = prateleira;
        this.emprestado = emprestado;
    }

    public boolean isEmprestado(){
        return this.emprestado;
    }

    public int getEstante(){
        return this.estante;
    }

    public int getPrateleira(){
        return this.prateleira;
    }

    public void emprestar(){
        this.emprestado = true;
    }

    public void devolver(){
        this.emprestado = false;
    }

    public String imprimir(){
        return this.titulo+" "+this.autor+". Ano: "+this.ano+", "+this.categoria+". Localizacao: "+this.estante+
                " - "+this.prateleira+" Emprestado: "+this.emprestado;
    }
}