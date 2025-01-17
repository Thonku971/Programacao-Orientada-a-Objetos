package aula06;

public class Pessoa {

	
		private String nome;
		private String dataNascimento;
		private String sexo;
		private String email;
		private EstadoCivil estadoCivil;
		private Enderešo enderešo;
		
		
		public Pessoa(String nome, String dataNascimento, String sexo, String email, EstadoCivil estadoCivil,
				Enderešo enderešo) {
			this.nome = nome;
			this.dataNascimento = dataNascimento;
			this.sexo = sexo;
			this.email = email;
			this.estadoCivil = estadoCivil;
			this.enderešo = enderešo;
		}	
		
		
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getDataNascimento() {
			return dataNascimento;
		}
		
		public void setDataNascimento(String dataNascimento) {
			this.dataNascimento = dataNascimento;
		}
		
		public String getSexo() {
			return sexo;
		}
		
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		
		public String getEmail() {
			return email;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}
		
		public EstadoCivil getEstadoCivil() {
			return estadoCivil;
		}
		
		public void setEstadocivil(EstadoCivil estadoCivil) {
			this.estadoCivil = estadoCivil;
		}
		
		public Enderešo getEnderešo() {
			return enderešo;
		}
		
		public void setEnderešo(Enderešo enderešo) {
			this.enderešo = enderešo;
		}



		@Override
		public String toString() {
			return "Pessoa [nome=" + nome + ", dataNascimento=" + dataNascimento + ", sexo=" + sexo + ", email=" + email
					+ ", estadoCivil=" + estadoCivil + ", enderešo=" + enderešo + "]";
		}




	
		
	
		
		
}
