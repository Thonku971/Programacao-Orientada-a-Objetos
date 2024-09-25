package lista5;

public class TecADM extends Funcionario{

	private Double adcNoturno;
	private Double salarioFinal = null;
	private Processo processo;
	
	public TecADM(String registro, String nome, String dataAdmicao, Double salarioBase, Double adcNoturno, Processo processo) 
	{
		super(registro, nome, dataAdmicao, salarioBase);
		this.adcNoturno = adcNoturno;
		this.processo = processo;
	}
	
	
	@Override
	public void SalarioTotal() {
		salarioFinal = super.salarioBase + this.adcNoturno;
	}

	public void Printa() {
		super.Printa();
		System.out.println("Salário total = " + salarioFinal);
	}


	public Double getAdcNoturno() {
		return adcNoturno;
	}


	public void setAdcNoturno(Double adcNoturno) {
		this.adcNoturno = adcNoturno;
	}


	public Double getSalarioFinal() {
		return salarioFinal;
	}


	public void setSalarioFinal(Double salarioFinal) {
		this.salarioFinal = salarioFinal;
	}


	public Processo getProcesso() {
		return processo;
	}


	public void setProcesso(Processo processo) {
		this.processo = processo;
	}
	
	
	
}
