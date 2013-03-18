import java.util.List;



public interface ISistemaDeCondominio {
    
    public void cadastrarPessoa (Pessoa pessoa)throws PessoaJaExisteException;
    public void removerPessoa (String cpf)throws PessoaInexistenteException;
    public List<String> listarPessoas();
    public Pessoa pesquisarPessoa(String cpf)throws PessoaInexistenteException;
    public String pesquisarHistorico(String nomeDoMorador)throws HistoricoInexistenteException;
    public void incluirProprietario(Pessoa Proprietario)throws ProprietarioJaExisteException;
    public String pesquisarUnidade(String numero)throws UnidadeInexistenteException;
    public float somarContas (float valor);
    public void GerarTaxa(float valorTaxa); 
    public Float ConsultarTaxa (float ValorDaTaxa)throws TaxaInexistenteException;
    public String buscarContas (String Conta)throws ContaInexistenteException;
    public void inserirConta(String desConta, float valor, String mesRef, String data)throws ContaExistenteException;
    public boolean efetuarLogin(String nomeAdm, String senhaAdm);
    public boolean existePessoa(Pessoa pessoa);
	public void cadastrarUnidade(int numero)throws UnidadeExistenteException;
}
