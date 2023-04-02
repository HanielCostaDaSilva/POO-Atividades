
public class TesteAluno {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("joao", 100, 70,20,86) ;
		System.out.println(a1);

		Aluno a2 = new Aluno("maria", 20,69, 90) ;
		a2.getNota(2);
		System.out.println(a2);
		
		Aluno a3 = new Aluno("Guilherme") ;
		System.out.println(a3);
		
	}

}
