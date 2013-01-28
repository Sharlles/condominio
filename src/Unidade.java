
public class Unidade {
    
    int Numero;
    Pessoa Proprietario;
    Pessoa Morador;

    public Unidade(int Numero, Pessoa Proprietario, Pessoa Morador) {
        this.Numero = Numero;
        this.Proprietario = Proprietario;
        this.Morador = Morador;
    }

    public Pessoa getMorador() {
        return Morador;
    }

    public int getNumero() {
        return Numero;
    }

    public Pessoa getProprietario() {
        return Proprietario;
    }

    public void setMorador(Pessoa Morador) {
        this.Morador = Morador;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public void setProprietario(Pessoa Proprietario) {
        this.Proprietario = Proprietario;
    }
    
    public String toString() {
		return "Unidade [Numero=" + Numero + ", Proprietario=" + Proprietario
				+ ", Morador=" + Morador + "]";
	}
    

    
}
