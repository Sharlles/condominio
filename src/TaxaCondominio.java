import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class TaxaCondominio {

	private String mesRef;
	private float valorTaxa ;
	private String dataGeracao;
	private String dataVencimento;
	private List<Contas> Contas;
	
	public TaxaCondominio(String mes,float valor, String dataGeracao, String dataVencimento){
		this.mesRef = mes;
		this.valorTaxa = valor;
		this.dataGeracao = dataGeracao;
		this.dataVencimento = dataVencimento;
		this.Contas = new ArrayList<Contas>();
    }

	public String getMesRef() {
		return mesRef;
	}

	public void setMesRef(String mesRef) {
		this.mesRef = mesRef;
	}

	public float getValorTaxa() {
		return valorTaxa;
	}

	public void setValorTaxa(float valorTaxa) {
		this.valorTaxa = valorTaxa;
	}

	public String getDataGeracao() {
		return dataGeracao;
	}

	public void setDataGeracao(String dataGeracao) {
		this.dataGeracao = dataGeracao;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
}
