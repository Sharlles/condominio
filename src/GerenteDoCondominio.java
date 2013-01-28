
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class GerenteDoCondominio implements ISistemaDeCondominio {

    private List<Pessoa> Pessoas;
    private List<Pessoa> Proprietarios;
    private List<Unidade> Unidades;
    private List<Contas> Contas;
    private List<Contas> Taxas;
    private List<Contas> ContasRecebidas;
    
    public GerenteDoCondominio(){
		this.Pessoas = new ArrayList<Pessoa>();
		this.Proprietarios = new ArrayList<Pessoa>();
		this.Unidades = new ArrayList<Unidade>();
		this.Contas = new ArrayList<Contas>();
		this.Taxas = new ArrayList<Contas>();
		this.ContasRecebidas = new ArrayList<Contas>();
	}
    
    @Override
    public void cadastrarPessoa(Pessoa p) throws PessoaJaExisteException {
    		if (this.Pessoas.contains(p)){
    			throw new PessoaJaExisteException("J‡ existe uma pessoa com esse cpf:"+ p);
    		} else {
    			this.Pessoas.add(p);
    		}
    	
    	//this.Pessoas = new LinkedList<Pessoa>();
        	//Pessoas.add(p);
    }
    
    public void removerPessoa (String cpf){
    	for (Pessoa f : Pessoas) {
        	if (f.getCpf().equals(cpf)) {
        		Pessoas.remove(f);
                return;
            }
        }
    }

    @Override
    public Pessoa listarPessoa() {
        for (int i = 0; i < Pessoas.size(); i++) {
            Pessoas.get(i);
        }
        return listarPessoa();
    }

    @Override
    public Pessoa pesquisarPessoa(String cpf) {
        for (Pessoa f : Pessoas) {
            if (f.getCpf().equals(cpf)) {
                return f;
            }
        }
        return null;
    }

    @Override
    public void incluirMoradia(Unidade unidade) {
    	this.Unidades = new LinkedList<Unidade>();
    	Unidades.add(unidade);
    }


    @Override
    public String pesquisarHistorico(String NomeDoMorador) {
       for (Unidade unid : Unidades){
           if (unid.Morador.equals(NomeDoMorador)){
               return NomeDoMorador;
           }
       }
        return null;
    }

    @Override
    public void incluirProprietario(Pessoa Proprietario) {
    	this.Proprietarios = new LinkedList<Pessoa>();
    	Proprietarios.add(Proprietario);
    }

    @Override
    public Unidade pesquisarUnidade(int numero) {
        for (Unidade f : Unidades) {
            if (f.getNumero() == numero) {
                return f;
            }
        }
        return null;
    }

    @Override
    public Float somarContas(float Valor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void GerarTaxa(Contas ValorDaTaxa) {
    	this.Taxas = new LinkedList<Contas>();
    	Taxas.add(ValorDaTaxa);
    }

    @Override
    public Float ConsultarTaxa(float ValorDaTaxa) {
    	for (Contas t : Taxas) {
            if ( t.getTaxa()== ValorDaTaxa) {
                return ValorDaTaxa;
            }
        }
        return null;    
    }

    @Override
    public Contas buscarContas(int Conta) {
       // for (int i=0; i<Contas.size(); i++){
         for(Contas c: this.Contas)  { 
        }
        return null;
    }

    @Override
    public void inserirConta(Contas conta) {
    	this.Contas = new LinkedList<Contas>();
    	Contas.add(conta);
   
    }

    @Override
    public Contas receberConta(String Desc) {
        for (Contas t : Contas) {
            if ( t.Descricao.equals(Desc) ) {
                ContasRecebidas.add(t);
            }
        }
    return receberConta(Desc);
    }
    

    @Override
    public String verificarPagamento(String ContasaPagar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}