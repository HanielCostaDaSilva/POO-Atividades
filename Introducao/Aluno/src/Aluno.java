public class Aluno {
	private String nome;
	private int[] notas;
	
	public Aluno(String nome, int...notas) {
		this.nome = nome;
		this.notas= notas;
	}
	
	public int calcularMedia() {
		double soma = 0;
		for(double i : this.notas) {
			soma+= i;
		};
		double media = (notas.length==0) ? 0 : soma/notas.length;
		return (int)Math.round(media);
	}

	public String calcularSituacao() {
		int media = calcularMedia();	//variavel local
		
		if(media >= 70)
			return "aprovado";
		else
			if(media >= 40)
				return "final";
			else
				return "reprovado";
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + "\n Notas: \n" + this.getNota()+ ""
				+ "Media=" + calcularMedia()
				+ "\nSituacao=" + calcularSituacao() + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNota(int index){
		assert index<= this.notas.length;
		return this.notas[index-1];
	}
	
	public String getNota(){
		String s="";
		int v=0;
		for(int i : this.notas) {
			v+=1;
			s+=("nota "+v + "= "+ i +"\n");
		}
		return s;
	}
}
