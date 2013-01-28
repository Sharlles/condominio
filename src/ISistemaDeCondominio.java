

public interface ISistemaDeCondominio {
    
    public void cadastrarPessoa (Pessoa p)throws PessoaJaExisteException;
    public void removerPessoa (String cpf);
    public Pessoa listarPessoa();
    public Pessoa pesquisarPessoa(String cpf)throws PessoaInexistenteException;
    public void incluirMoradia(Unidade unidade);
    public String pesquisarHistorico(String nomeDoMorador)throws HistoricoInexistenteException;
    public void incluirProprietario(Pessoa Proprietario)throws ProprietarioJaExisteException;
    public Unidade pesquisarUnidade(int numero)throws UnidadeInexistenteException;
    public Float somarContas (float Valor);
    public void GerarTaxa(Contas ValorDaTaxa);
    public Float ConsultarTaxa (float ValorDaTaxa)throws TaxaInexistenteException;
    public Contas buscarContas (int Conta);
    public void inserirConta(Contas conta)throws ContaInexistenteException;
    public Contas receberConta(String Desc);
    public String verificarPagamento(String ContasaPagar)throws PagamentoInexistenteException;
}
