public class Empregado{
    private String nome;
    private String cargo;
    private double salario;

    public Empregado(String no, String ca, double sa){
        nome = no;
        cargo = ca;
        salario = sa;
    }

    public void setNome(String no){
        nome = no;
    }
    public String getNome(){
        return nome;
    }
    public void setCargo(String ca){
        cargo = ca;
    }
    public String getCargo(){
        return cargo;
    }
    public void setSalario(double sa){
        salario = sa;
    }
    public double getSalario(){
        return salario;
    }

    public String imprimir(){
        return nome+" "+cargo+" R$ "+String.format("%.2f",salario);
    }

    public void aumentarSalario(double percentual){
        salario = salario + salario*percentual/100;
    }
}