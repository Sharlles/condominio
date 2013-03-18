
public class Historico {
	private Unidade unidade;
	private Pessoa proprietario;
	private char pro_DtVenda;
	private Pessoa morador;
	private char morador_DtEntrada;
	
	public Historico(Unidade unidade, Pessoa proprietario, char dataVenda, Pessoa morador, char dataEntradaMorador){
		this.unidade = unidade;
		this.proprietario = proprietario;
		this.pro_DtVenda = dataVenda;
		this.morador = morador;
		this.morador_DtEntrada = dataEntradaMorador;
		
	}
	
	public Unidade getUnidade() {
		return unidade;
	}
	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}
	public Pessoa getProprietario() {
		return proprietario;
	}
	public void setProprietario(Pessoa proprietario) {
		this.proprietario = proprietario;
	}
	
	public char getPro_DtVenda() {
		return pro_DtVenda;
	}
	public void setPro_DtVenda(char pro_DtVenda) {
		this.pro_DtVenda = pro_DtVenda;
	}
	public Pessoa getMorador() {
		return morador;
	}
	public void setMorador(Pessoa morador) {
		this.morador = morador;
	}
	public char getMorador_DtEntrada() {
		return morador_DtEntrada;
	}
	public void setMorador_DtEntrada(char morador_DtEntrada) {
		this.morador_DtEntrada = morador_DtEntrada;
	}
	
}
