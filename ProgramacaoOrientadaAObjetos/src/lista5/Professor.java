package lista5;

public class Professor extends Funcionario{


	private Titulo titulacao;
	private Double gratiTitulo;
	private Double salarioFinal;
    private Materia materia;
	
	
	public Professor(String registro, String nome, String dataAdmicao, Double salarioBase, Titulo titulacao, Materia materia1) 
	{
		super(registro, nome, dataAdmicao, salarioBase);
		this.titulacao = titulacao;
		this.materia = materia1; 
	}
	
	@Override
	public void SalarioTotal() {
		if(this.titulacao == Titulo.Mestre)
		{
			this.gratiTitulo = 1000.00;
			salarioFinal = super.salarioBase + this.gratiTitulo;

		}
		else if(titulacao == Titulo.Doutor)
		{
			this.gratiTitulo = 2000.00;
			salarioFinal = super.salarioBase + this.gratiTitulo;
	
		}
	}
	
	
	
	
	
	
	public void Printa() {
		super.Printa();
		System.out.println("Salário total = " + salarioFinal);
	}

	public Titulo getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(Titulo titulacao) {
		this.titulacao = titulacao;
	}

	public Double getGratiTitulo() {
		return gratiTitulo;
	}

	public void setGratiTitulo(Double gratiTitulo) {
		this.gratiTitulo = gratiTitulo;
	}

	public Double getSalarioFinal() {
		return salarioFinal;
	}

	public void setSalarioFinal(Double salarioFinal) {
		this.salarioFinal = salarioFinal;
	}



	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	
}
