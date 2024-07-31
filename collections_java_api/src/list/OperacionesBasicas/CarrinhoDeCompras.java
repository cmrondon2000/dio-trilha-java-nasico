package list.OperacionesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras(){

        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        
        if(!itemList.isEmpty()){
        List<Item>itemParaRemover = new ArrayList<>();
        for(Item i : itemList){

            if(i.getnome().equalsIgnoreCase(nome)){

                itemParaRemover.add(i);
            }

        }
        itemList.removeAll(itemParaRemover);

        } else{

            System.out.println("a lista esta vazia");
        }
    }
        
        public double calcularValorTotal(){
            double valor = 0;

            if(!itemList.isEmpty()){

            for(Item i : itemList){

               double valorItem = i.getpreco() * i.getquantidade();

               valor = valor + valorItem;

                }           

            return valor;
        } else{

            throw new RuntimeException("A lista está vazia!"); 
        }
        
        }



        public void exibirItens(){
            System.out.println(itemList);
        }
        

public static void main(String[] args) {
    
    CarrinhoDeCompras carrinhoCompras = new CarrinhoDeCompras();

    
            carrinhoCompras.adicionarItem( "Leite", 20.45, 5);
            carrinhoCompras.adicionarItem( "Leite", 20.45, 3);
            carrinhoCompras.adicionarItem( "Ovos", 10.25, 2);
            carrinhoCompras.adicionarItem( "Queijo", 9.45, 1);
            carrinhoCompras.adicionarItem( "Arroz", 5.45, 3);

            System.out.println("O valor total é" + carrinhoCompras.calcularValorTotal());

            carrinhoCompras.removerItem("Leite");
            System.out.println("O valor total é" + carrinhoCompras.calcularValorTotal());

            carrinhoCompras.exibirItens();;
        


}



}
