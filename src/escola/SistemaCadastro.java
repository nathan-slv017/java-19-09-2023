package escola;

public class SistemaCadastro {
	public static void main(String[] args) {
		
		Pessoa marcos = new Pessoa("Marcos", "12123456");
		
		marcos.setEndereco("Rua Das Marias");
		
		System.out.println(marcos.getEndereco());
		System.out.println(marcos.getNome() + " " + marcos.getCpf());
	}
}
