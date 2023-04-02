public class Produto {
    private String nome;
    private int estoque; 
    private double preco;
    
    public Produto( String nome, int estoque, double preco){
        assert estoque>=0.0 && preco>=0.0;
        this.nome=nome;
        this.estoque=estoque;
        this.preco=preco;       
    }
    public void diminuirEstoque(int quantidade){
        assert this.estoque>=quantidade;
        this.estoque-=quantidade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getEstoque() {
        return estoque;
    }
    public void setEstoque(int estoque) {
        assert estoque>=0;
        this.estoque = estoque;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        assert preco>=0.0;
        this.preco = preco;
    }
    public String toString(){
        return "Produto: "+this.nome + "\n Estoque:"+ this.estoque +"\n Preco: "+ this.preco;
    }
}
