package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Augusto");
		String nome = g1.getNome();
		g1.setSalario(5000.0);
		
		System.out.println(nome);
		System.out.println(g1.getSalario());
		
		Funcionario f = new Gerente();
		f.setSalario(2500.0);
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f);
		
		System.out.println(controle.getSoma());
		

	}

}
