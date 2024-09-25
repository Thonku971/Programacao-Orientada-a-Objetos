package lista3;

public class Funcionarios {

	protected String numeroRegistro;
	protected String nome;
	protected int dia;
	protected int mes;
	protected int ano;
	protected boolean sexo;
	protected String setor;
	protected String telefone;
	protected String rua;
	protected String numero;
	protected String cidade;
	protected String estado;
	protected String bairro;
	
	
	public void Nascimento(int dia, int mes, int ano )
	{
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String getRua()
	{
		return rua;
	}
	
	public void setRua(String rua)
	{
		this.rua = rua;
	}
	
	public String getNumero()
	{
		return numero;
	}
	
	public void setNumero(String numero)
	{
		this.numero = numero;
	}
	
	public String getCidade()
	{
		return cidade;
	}
	
	public void setCidade(String cidade)
	{
		this.cidade = cidade;
	}
	
	public String getEstado()
	{
		return estado;
	}
	
	public void setEstado(String estado)
	{
		this.estado = estado;
	}
	public String getBairro()
	{
		return bairro;
	}
	
	public void setBairro(String bairro)
	{
		this.bairro = bairro;
	}

	
	@Override
	public String toString() {
		if(sexo == false)
		{
			return "Funcionarios [numeroRegistro=" + numeroRegistro + ", nome=" + nome + ", dia=" + dia + ", mes=" + mes
					+ ", ano=" + ano + ", sexo = Masculino" + ", setor=" + setor + ", telefone=" + telefone + "Endereço : " + ", rua=" + rua
					+ ", numero=" + numero + ", cidade=" + cidade + ", estado=" + estado + ", bairro=" + bairro + "]";
		}	
		else
		{
			return "Funcionarios [numeroRegistro=" + numeroRegistro + ", nome=" + nome + ", dia=" + dia + ", mes=" + mes
					+ ", ano=" + ano + ", sexo = Feminino" + ", setor=" + setor + ", telefone=" + telefone + "Endereço : " + ", rua=" + rua
					+ ", numero=" + numero + ", cidade=" + cidade + ", estado=" + estado + ", bairro=" + bairro + "]";
		}
		
	}
	
	
	
	
	
}
