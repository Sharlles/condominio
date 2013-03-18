import java.util.List;


public class GerenteDoCondominioFachada {
 
 private GerenteDoCondominio gerenteDoCondominio;
 
 public GerenteDoCondominioFachada(){
	 gerenteDoCondominio = new GerenteDoCondominio();
 }
 public void cadastrarPessoa(Pessoa p) throws PessoaJaExisteException {
	 gerenteDoCondominio.cadastrarPessoa(p);
 }
 
 public void removerPessoa (String cpf) throws PessoaInexistenteException{
	 gerenteDoCondominio.removerPessoa(cpf);
 }
 
 public List<String> listarPessoas(){
	return gerenteDoCondominio.listarPessoas();
 }
 
 public Pessoa pesquisarPessoa(String cpf) throws PessoaInexistenteException{
	 return gerenteDoCondominio.pesquisarPessoa(cpf);
 }
 public String pesquisarHistorico(String nomeDoMorador)throws HistoricoInexistenteException{
	 return gerenteDoCondominio.pesquisarHistorico(nomeDoMorador);
 }
 public void incluirProprietario(Pessoa Proprietario)throws ProprietarioJaExisteException{
	 gerenteDoCondominio.incluirProprietario(Proprietario);
}
 public String pesquisarUnidade(String numero) throws UnidadeInexistenteException{
	 return gerenteDoCondominio.pesquisarUnidade(numero);
 }
 public float somarContas(float valor) { 
	 return gerenteDoCondominio.somarContas(valor);
 }
 public void GerarTaxa(float valorTaxa) { 
	 gerenteDoCondominio.GerarTaxa(valorTaxa);
 }
 public Float ConsultarTaxa(float ValorDaTaxa) throws TaxaInexistenteException {
	 return gerenteDoCondominio.ConsultarTaxa(ValorDaTaxa);
 }
 public String buscarContas(String conta) throws ContaInexistenteException {
	 return gerenteDoCondominio.buscarContas(conta);
 }
 public void inserirConta(String desConta, float valor, String mesRef, String data)throws ContaExistenteException {
	 gerenteDoCondominio.inserirConta(desConta, valor, mesRef, data);
 }
 public boolean efetuarLogin(String nome, String senha){
	return gerenteDoCondominio.efetuarLogin(nome, senha);
 	}
 public void cadastrarUnidade(int nome) throws UnidadeExistenteException{
	 gerenteDoCondominio.cadastrarUnidade(nome);
 }
}
