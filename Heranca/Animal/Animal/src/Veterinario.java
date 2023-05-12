public class Veterinario {

    String nome;
    String CRV;

    public Veterinario(String nome, String CRV){

        this.nome= nome;
        this.CRV= CRV;
    }

    public String aplicarInjecao(Animal animal){

        return "Dr. "+this.nome + " aplicou uma injeção na "+animal.nome + " que fez " + animal.emitirSom();

    }

}
