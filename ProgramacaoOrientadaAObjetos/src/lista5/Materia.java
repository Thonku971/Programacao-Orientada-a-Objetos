package lista5;

public class Materia{
	

	private String cod;
	private String nome;
	private String ementa;
	private String cargaHoraria;
	
	public Materia( String cod, String nome2, String ementa, String cargaHoraria) {
		this.cod = cod;
		this.nome = nome2;
		this.ementa = ementa;
		this.cargaHoraria = cargaHoraria;
	}

	public void Printa()
	{
		System.out.println("Materia [cod=" + cod + ", nome=" + nome + ", ementa=" + ementa + ", cargaHoraria=" + cargaHoraria + "]");
		
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmenta() {
		return ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}

	public String getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	


	
	
	

}
