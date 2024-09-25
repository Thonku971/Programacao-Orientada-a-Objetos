package lista5_1;

public class Locacao {

	private Integer dia;
	private Integer diaDevolucao;
	private Integer devolvido;
	private Locatario cliente;
	private Double valorLocacao;
	private Double valorMulta;
	private Filme filme;
    private Double valorFim;
	
    public Locacao(Integer dia, Integer diaDevolucao, Integer devolvido, Locatario cliente, Double valorLocacao, Double valorMulta, Filme filme) {
		this.dia = dia;
		this.diaDevolucao = diaDevolucao;
		this.devolvido = devolvido;
		this.cliente = cliente;
		this.valorLocacao = valorLocacao;
		this.valorMulta = valorMulta;
		this.filme = filme;
	}



	public Integer getDia() {
		return dia;
	}



	public void setDia(Integer dia) {
		this.dia = dia;
	}



	public Integer getDiaDevolucao() {
		return diaDevolucao;
	}



	public void setDiaDevolucao(Integer diaDevolucao) {
		this.diaDevolucao = diaDevolucao;
	}



	public Integer getDevolvido() {
		return devolvido;
	}



	public void setDevolvido(Integer devolvido) {
		this.devolvido = devolvido;
	}



	public Locatario getCliente() {
		return cliente;
	}



	public void setCliente(Locatario cliente) {
		this.cliente = cliente;
	}



	public Double getValorLocacao() {
		return valorLocacao;
	}



	public void setValorLocacao(Double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}



	public Double getValorMulta() {
		return valorMulta;
	}



	public void setValorMulta(Double valorMulta) {
		this.valorMulta = valorMulta;
	}

	
	
	public void Locar(Locatario cliente, String titulo, Integer dia)
	{
		if(filme.getSituacao() == false)
		{
			filme.setSituacao(true);
		}
		else
		{
			System.out.println("Impossível");
		}
	}
	
	
	public void Devolver(String filme, Integer devolvido)
	{
		this.devolvido = devolvido;
		valorFim = valorLocacao +((devolvido - diaDevolucao)*valorMulta);
		if(valorFim <= valorLocacao || devolvido <= diaDevolucao)
		{
			valorFim = valorLocacao;
		}
	}



	@Override
	public String toString() {
		return "Filme = " + filme.getTitulo() + "Cliente = " + cliente.getNome() + " dia da locação = " + dia + " dia da devolução = "  + diaDevolucao + " dia em que foi devolvido "  + devolvido +  " Valor final " + valorFim ; 
			
	}
	
	
	
	
	
}
