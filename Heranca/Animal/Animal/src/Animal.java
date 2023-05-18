public abstract class Animal {

    String nome;
    float altura;
    private float peso;

    public Animal(String nome, float peso) {

        this.nome = nome;
        this.peso = peso;
    }

    public abstract String emitirSom();

    public String toString() {

        return "Nome: " + this.nome + "\nPeso " + peso + "\nSom: " + this.emitirSom();
    }


    public float getPeso(){
        return this.peso;
    }

}
