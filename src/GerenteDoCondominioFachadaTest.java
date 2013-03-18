import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GerenteDoCondominioFachadaTest {
	GerenteDoCondominio ge;
	
	@Before
	public void inicializar() throws Exception {
			ge = new GerenteDoCondominio();
	}    
	@After
	public void terminou() {
		ge = null;
	}
	
	@Test
	public void testCadastraPessoa()throws PessoaJaExisteException, PessoaInexistenteException{
		Pessoa p = new Pessoa("joao","3333","2222");	
	    	ge.cadastrarPessoa( p );
	    	Pessoa result = ge.pesquisarPessoa("3333");
		    assertEquals(result, p);
	}
	
	@Test
	public void testPesquisarPessoa()throws PessoaInexistenteException,PessoaJaExisteException{
		Pessoa p = new Pessoa("Jose","333","222");
		ge.cadastrarPessoa( p );
		Pessoa result = ge.pesquisarPessoa("333");
		assertEquals(result.getCpf() ,p.getCpf());
		
	}
	@Test
	public void testEfetuarLogin()throws PessoaJaExisteException,PessoaInexistenteException{
		Pessoa p = new Pessoa("Maria", "111", "999");
		ge.cadastrarPessoa(p);
		Pessoa result = ge.pesquisarPessoa("111");
		assertEquals(result.getNome(),p.getNome());
	}
	@Test
	public void testRemoverPessoa()throws PessoaInexistenteException,PessoaJaExisteException{
		Pessoa p = new Pessoa("Maria","444","999");
		ge.cadastrarPessoa(p);
		ge.removerPessoa("444");
	    assertFalse(ge.existePessoa(p));
	}
	public void testListarPessoas()throws PessoaJaExisteException{
		Pessoa p = new Pessoa("Joao", "333", "444");
		ge.cadastrarPessoa(p);
		ge.listarPessoas();
		List<String> result = ge.listarPessoas();
		assertEquals(result,p);
	}
	public void testPesquisarHistorico()throws HistoricoInexistenteException,PessoaJaExisteException{
		Pessoa p = new Pessoa("Joao", "777", "222");
		Unidade u = new Unidade(1, p, p);
		Historico h = new Historico(u, p, '2', p, '1');
		String result = ge.pesquisarHistorico("Joao");
		assertEquals(result,h);
	}
	public void testincluirProprietario()throws ProprietarioJaExisteException,PessoaInexistenteException,PessoaJaExisteException{
		Pessoa p = new Pessoa("fulano", "1234", "4321");
		ge.incluirProprietario(p);
		Pessoa result = ge.pesquisarPessoa("1234");
		assertEquals(result, p.getCpf());
 	}
	public void testPesquisarUnidade()throws UnidadeInexistenteException{
		Pessoa p = new Pessoa("Joao", "777", "222");
		Unidade u = new Unidade(1, p, p);
		Historico h = new Historico(u, p, '2', p, '1');
		String result = ge.pesquisarUnidade("joao");
		assertEquals(result,u.getMorador());
	
	}
	public void testSomarContas(){
		Contas con = new Contas("tipo: tal", "15/03/13", 60, "fevereiro");
		ge.somarContas(con.getValorConta());
		String result = con.getDescricaoConta();
		assertEquals(result,con.getDescricaoConta());
	}
	public void testGerarTaxa(){
		Contas con = new Contas("tipo: tal", "15/03/13", 60, "fevereiro");
		ge.GerarTaxa(con.getValorConta());
		String result = con.getDescricaoConta();
		assertEquals(result,con.getValorConta());
	}
	public void testConsultarTaxa()throws TaxaInexistenteException{
		TaxaCondominio taxa = new TaxaCondominio("janeiro", 10, "12/01/13", "22/03/13");
		ge.ConsultarTaxa(taxa.getValorTaxa());
		String result = taxa.getDataVencimento();
		assertEquals(result,taxa.getValorTaxa());
	}
	public void testBuscarContas()throws ContaInexistenteException{
		Contas conta = new Contas("tipo", "15/05/13", 100, "Maio");
		ge.buscarContas(conta.getDescricaoConta());
		String result = conta.getDatadeVencimento();
		assertEquals(result,conta.getDatadeVencimento());
	}
	public void testInserirConta()throws ContaExistenteException {
		Contas conta = new Contas("tipo", "15/05/13", 100, "Maio");
		ge.inserirConta(conta.getDescricaoConta(), conta.getValorConta(), conta.getMesRef(), conta.getDatadeVencimento());
		String result = conta.getDescricaoConta();
		assertEquals(result,conta.getDescricaoConta());
	}
	public void testCadastrarUnidade()throws UnidadeExistenteException{
		Pessoa p = new Pessoa("joao", "777", "555");
		Unidade u = new Unidade(2,p,p);
		ge.cadastrarUnidade(u.getNumero());
		Pessoa result = u.getMorador();
		assertEquals(result,u.getMorador());
	}
}
