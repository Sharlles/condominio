import static org.junit.Assert.*;

import org.junit.Test;


public class GerenteDoCondominioTest {
	
	@Test
	public void pesquisarPessoa()throws PessoaJaExisteException{
		GerenteDoCondominio g = new GerenteDoCondominio();
		Pessoa p = new Pessoa("Jose","333","222");
		g.cadastrarPessoa(p);
		Pessoa pes = g.pesquisarPessoa("333");
		assertEquals(p,pes);
	}

}
