class Participante {

    private String email;
    private String nome;
    private int idade;
    private int percentual;

    public Participante(String nome, String email, int idade) {
        this.email = email;
        this.nome = nome;
        this.idade = idade;
        this.setPercentual(idade);

    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return int return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @return return the percentual
     */
    public int getPercentual() {
        return this.percentual;
    }

    /**
     * @param percentual the percentual to set
     */
    private void setPercentual(int idade) {
        if (idade < 18) {
            this.percentual = 50;
        } else if (idade >= 60) {

            this.percentual = 20;
        } else {
            this.percentual = 0;
        }
    }

    public double getValorPago(double preco) {

        double desconto = preco * (this.getPercentual() / 100.0);
        System.out.println("o desconto foi  " + desconto);
        return preco - desconto;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " Idade: " + idade + " anos Email: " + email + " Desconto: " + getPercentual() + "%";
    }

}