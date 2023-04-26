import java.util.ArrayList;

public class Automovel {

    private String placa;
    private String tipo;
    private String proprietario;
    private ArrayList<String> passageiros = new ArrayList<>();

    public Automovel(String Placa, String Tipo, String Proprietario, String... passageiros) {
        this.placa = Placa;
        this.tipo = Tipo;
        this.proprietario = Proprietario.toUpperCase();

        this.passageiros.add(Proprietario.toUpperCase());

        for (String passageiro : passageiros) {
            this.passageiros.add(passageiro.toUpperCase());
        }
        ;
    };

    public String getPlaca() {
        return this.placa;
    };

    public String getTipo() {
        return this.tipo;
    };

    public String getProprietario() {
        return this.proprietario;
    };

    public boolean conferirProprietario(String donoChecar) {
        return this.proprietario.equals(donoChecar.toUpperCase());
    }

    public boolean conferirPassageiro(String nomeChecar) {
        return this.passageiros.contains(nomeChecar.toUpperCase());
    }

    public void removerPassageiro(String nomePassageiro) throws Exception {
        int posicao = this.passageiros.indexOf(nomePassageiro.toUpperCase());

        if (posicao < 0)
            throw new Exception("Passageiro Inexistente");

        this.passageiros.remove(posicao);

    };

    public String toString() {

        String s = "";
        s += " Proprietario: " + this.proprietario + "\n Tipo: " + this.tipo + "\n Placa: " + this.placa
                + "\nPassageiros: \n";

        for (int i = 0; i < this.passageiros.size(); i++) {
            s += this.passageiros.get(i) + '\n';
        }
        ;

        return s;
    }
}