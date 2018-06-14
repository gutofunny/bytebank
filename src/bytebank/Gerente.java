package bytebank;

public class Gerente extends Funcionario { //Gerente é um funcionário
	
	private int senha;
	
	/*Getter and Setters*/
	public void setSenha(int senha) {
		this.senha = senha;
	}
	/*Demais métodos*/
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
//	public double getBonificacao() {
//		return this.salario*2;
//	}
}
