public class Venda {
    private String data;
    private String nome;
    private int quantidade; 
    private double valor;
    
    public Venda(String data, Produto produto, int quantidade){
        assert quantidade>0 && produto.getEstoque()>=quantidade ;
        
        this.data= data;
        this.nome= produto.getNome();
        this.quantidade=quantidade;
        this.valor= quantidade * produto.getPreco();

        produto.diminuirEstoque(quantidade);//Momento em que o estoque do produto é decrementado
    }

    public String toString(){
        return "VENDA: \n Data:"+ this.data +"\nProduto Vendido: "+ this.nome + "\n Quantidade Vendida: "+ this.quantidade +"\n Valor da Compra: R$ "+this.valor;
    } 
}