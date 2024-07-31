package list.OperacionesBasicas;

public class Item {

    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getnome(){
        return nome;
    }

    public double getpreco(){
        return preco;
    }

    public double getquantidade(){
        return quantidade;
    }

    @Override
    public String toString(){
        return "Nome:" + 
        nome + "Preco" + preco + "Quantidade"+ quantidade;
    }
    
}
