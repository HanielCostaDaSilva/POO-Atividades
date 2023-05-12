public class Convidado extends Participante {

    String empresa;

    public Convidado(String nome, String email, int idade,String empresa) {
        super(nome, email, idade);
        this.empresa=empresa;

    }

    @Override
    public int getPercentual() {
        return super.getPercentual() +50;
    }
    
}