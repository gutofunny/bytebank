package bytebank;

public class Desinger extends Funcionario {

	@Override
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Designer");
		return 200;
	}
	
}
