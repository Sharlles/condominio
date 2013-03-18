
public class Pessoa {
    
   private String Nome;
   private String Cpf;
   private String Telefone;

    public Pessoa(String Nome, String Cpf, String Telefone) {
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.Telefone = Telefone;
    }
    
    public String getCpf() {
        return Cpf;
    }
  
    public String getNome() {
        return Nome;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
    
    @Override
	public String toString() {
		return "Pessoa [Nome=" + Nome + ", Cpf=" + Cpf + ", Telefone="
				+ Telefone + "]";
	}
    
}
