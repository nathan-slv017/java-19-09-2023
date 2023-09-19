package escola;

public class Escola {
	
	public static void main(String[] args) {
		
		Aluno nathan = new Aluno();
		
		nathan.setNome("Nathan");
		nathan.setIdade(21);
		
		System.out.println("O aluno " + nathan.getNome() + " tem " + nathan.getIdade() + " anos");
		
	}
	
}
