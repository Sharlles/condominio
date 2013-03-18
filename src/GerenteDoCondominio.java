
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;





public class GerenteDoCondominio implements ISistemaDeCondominio {

    private List<TaxaCondominio> TaxaCondominio;
	private List<Pessoa> Pessoas;
    private List<Pessoa> Proprietarios;
    private List<Unidade> Unidades;
    private List<Contas> Contas;
    private List<Contas> Taxas;
    private List<Historico> Historicos;
    private List<Contas> ContasRecebidas;
    private List<Usuarios> Usuarios;
    
    
     
    public GerenteDoCondominio(){
		this.Pessoas = new ArrayList<Pessoa>();
		this.Proprietarios = new ArrayList<Pessoa>();
		this.Unidades = new ArrayList<Unidade>();
		this.Contas = new ArrayList<Contas>();
		this.Taxas = new ArrayList<Contas>();
		this.ContasRecebidas = new ArrayList<Contas>();
		this.Historicos = new ArrayList<Historico>();
		this.TaxaCondominio = new ArrayList<TaxaCondominio>();
		this.Usuarios = new ArrayList<Usuarios>();
	}
    
    public boolean efetuarLogin(String nome, String senha) {
        for (Usuarios usuario : this.Usuarios) {
            if (usuario.getNome().equalsIgnoreCase(nome) && (usuario.getSenha().equalsIgnoreCase(senha))) {
                return true;
            }
        }

        return false;
    }

    
    @Override
    public void cadastrarPessoa(Pessoa pessoa) throws PessoaJaExisteException { 
    	if(existePessoa(pessoa)){
    		throw new PessoaJaExisteException("");
    	}
    	Pessoas.add(pessoa);
    
    }

	public boolean existePessoa(Pessoa pessoa) {
		for(Pessoa p: this.Pessoas){
    		if (p.equals(pessoa)){
    			return true;
    		} 
    	}
		return false;
	}
    @Override
    public void removerPessoa (String cpf)throws PessoaInexistenteException{
    	for (Pessoa f : Pessoas) {
        	if (f.getCpf().equals(cpf)) {
        		Pessoas.remove(pesquisarPessoa(cpf));
        		return;
        	}	        	
    	}
    throw new PessoaInexistenteException("Não existe pessoa com esse cpf"+ cpf);
    }

    @Override
    public List<String> listarPessoas() {
    	List<String> pessoa = new ArrayList<String>();
    	for(Pessoa p : this.Pessoas){
    		pessoa.add(p.getNome());
    	
    	}return pessoa;
    	
    	
    }
    
   
    @Override
    public Pessoa pesquisarPessoa(String cpf) throws PessoaInexistenteException{
       for (Pessoa f : Pessoas) {
            if (f.getCpf().equals(cpf)) {
                return f;    
            }
        }
        throw new PessoaInexistenteException("Não existe pessoa com esse cpf"); 
    }

   
    @Override
    public String pesquisarHistorico(String NomeDoMorador) throws HistoricoInexistenteException{
       for (Historico his : this.Historicos){
           if (his.getMorador().equals(NomeDoMorador)){
               return NomeDoMorador; 
           }
       }return null;
       
    }

    @Override
    public void incluirProprietario(Pessoa Proprietario) throws ProprietarioJaExisteException{
    	for(Pessoa p : this.Proprietarios){
    		if(p.getNome().equals(Proprietario.getNome())){
    			throw new ProprietarioJaExisteException("Já existe um proprietario com esse nome");
    			}
    		} 
    	
    	this.Proprietarios.add(Proprietario);
    		
    		}
    
    
    @Override
    public String pesquisarUnidade(String numero) throws UnidadeInexistenteException{
        for (Unidade f : this.Unidades) {
            if (f.getMorador().equals(numero)) {
                return numero;
            }
        }
        throw new UnidadeInexistenteException("Não existe unidade com um morador chamado " + numero);
    }

    @Override
    public float somarContas(float valor) { 
    	 float valorTotal = 0;
    	  for(Contas c : this.Contas){
    		  float result = c.getValorConta();
    	     valor += c.getValorConta();
    	     return c.getValorConta();
    	     }

    	       return valorTotal;
    	 }
    @Override
  public void GerarTaxa(float valorTaxa) { 
    	float valorDaTaxa = 10; 
    	for(Contas c : this.Contas){
	          valorDaTaxa= valorTaxa + c.getValorConta();
	          c.setValorConta(valorDaTaxa);
    	}
    
    }
    @Override
    public Float ConsultarTaxa(float ValorDaTaxa) throws TaxaInexistenteException {
    	for (TaxaCondominio t : this.TaxaCondominio) {
            if ( t.getValorTaxa() == ValorDaTaxa) {
                return t.getValorTaxa();
            }
        }
    	throw new  TaxaInexistenteException("Taxa inexistente");
    }

    @Override
    public String buscarContas(String conta) throws ContaInexistenteException {
         for(Contas c: this.Contas)  { 
        	 if (c.getMesRef().equals(conta)){
        		 return c.getMesRef();
        	 }
        }
        throw new ContaInexistenteException("Não existe conta com essa caracteristica");
    }

    @Override
    public void inserirConta(String desConta, float valor, String mesRef, String data)throws ContaExistenteException {
    	for(Contas c : this.Contas){
    		if(c.getDescricaoConta().equals(desConta) && c.getValorConta() == valor && c.getMesRef().equals(mesRef) && c.getDatadeVencimento().equals(data)){
    			throw new ContaExistenteException("Já existe uma conta com essas caracteristicas");
    	
    		}
    		else{
    		 Contas.add(c);
    		}
    	}
    }
    public void cadastrarUnidade(int numero) throws UnidadeExistenteException{
    	for(Unidade u: this.Unidades){
    		if (u.getNumero()== numero){
    			throw new UnidadeExistenteException("Unidade existente");
    		}
        this.Unidades.add(u);
        break;
    		
    	}
    }
}   