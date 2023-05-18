public class Gato extends Animal{

    float salto;
    public Gato (String nome,  float peso, float salto){
        super(nome, peso);

        this.salto=salto;
        }

    
    public String emitirSom(){
        return "Miau";
    }

    
    public String toString(){

        return "Nome: " +this.nome+"\nPeso "+ this.getPeso()+ "\nSalto"+ "\nSom: "+this.emitirSom();
    }
    
}

