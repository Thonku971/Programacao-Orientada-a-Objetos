package lista5;

public abstract class Funcionario {

	protected String registro;
	protected String nome;
	protected String dataAdmicao;
	protected Double salarioBase;


	
	public Funcionario(String registro, String nome, String dataAdmicao, Double salarioBase) {
		this.registro = registro;
		this.nome = nome;
		this.dataAdmicao = dataAdmicao;
		this.salarioBase = salarioBase;
	}
	
	
	public abstract void SalarioTotal();
	

	public void Printa() {
		System.out.println("Registro =" + registro + "Nome = " + nome + "DataAdmicao = " + dataAdmicao + "Salário base = " + salarioBase);
	}

}

	

