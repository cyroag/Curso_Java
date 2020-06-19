public class MaquinaRefri{
    private double credito;
    private Refrigerante lista[];

/*
    double saldo;

    lista = new Refrigerante[5];

    lista[0] = new Refrigerante("Coca Cola", 4.00, 20);
    lista[1] = new Refrigerante("Guarana", 3.50, 15);
    lista[2] = new Refrigerante("Fanta", 3.50, 10);
    lista[3] = new Refrigerante("Sprite", 3.50, 10);
    lista[4] = new Refrigerante("Tonica", 5.00, 8);


    public MaquinaRefri(double credito, Refrigerante lista){
        this.credito = credito;
        this.lista = lista;
    }
*/

    public MaquinaRefri(){
        this.credito = 0.0;
        this.lista = new Refrigerante[5];
        this.lista[0] = new Refrigerante("Coca Cola", 4.00, 20);
        this.lista[1] = new Refrigerante("Guarana", 3.50, 15);
        this.lista[2] = new Refrigerante("Fanta", 3.50, 10);
        this.lista[3] = new Refrigerante("Sprite", 3.50, 10);
        this.lista[4] = new Refrigerante("Tonica", 5.00, 8);
    }

    public double inserirCredito (double valor){
        this.credito = credito + valor;
        return credito;
    }

    public double pegarTroco(){
        double troco = this.credito;
        this.credito = 0.0;
        return troco;
    }

    public String obter display(){
        return "CREDITO R$ "+this.credito+"\n"+
                "[0] - "+lista[0].getNome()+" R$ "+lista[0].getPreco()+"\n"+
                "[1] - "+lista[1].getNome()+" R$ "+lista[1].getPreco()+"\n"+
                "[2] - "+lista[2].getNome()+" R$ "+lista[2].getPreco()+"\n"+
                "[3] - "+lista[3].getNome()+" R$ "+lista[3].getPreco()+"\n"+
                "[4] - "+lista[4].getNome()+" R$ "+lista[4].getPreco()+"\n";
    }

    public int comprar(int num){
        if (this.credito >= lista[num].getPreco()){
            if(lista[num].getQuantidade() > 0){
                this.credito -= lista[num].getPreco();
                lista[num].tirarEstoque();
                return 0
            }
            else{
                return 1;
            }
        }
        else{
            return 2;
        }
    }
}