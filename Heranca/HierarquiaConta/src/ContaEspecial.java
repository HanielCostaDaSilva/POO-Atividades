
public class ContaEspecial extends Conta {
    
    private double limite;
    
    public ContaEspecial(int numero, String cpf, double limite) {
        super(numero,cpf);
        this.limite= 0 -limite;
    }
    
    @Override
    public void debitar(double valor) throws Exception{
        if (this.saldo - valor< this.limite) throw new Exception("O valor para debitar ultrapassa o limite do slado");

        this.saldo-=valor;
        
    }
    @Override
    public String toString(){
		return "numero=" + this.numero + ", cpf=" + this.cpf + ", saldo=" + this.saldo + ",limite de saldio negativo:" + this.limite;
    }

}