import java.io.ObjectInputStream.GetField;

import javax.swing.*;
public class Main {
	public static void main(String args[]){
		GerenteDoCondominio g = new GerenteDoCondominio();
		while(true){
			try{
				String escolha = JOptionPane.showInputDialog(null,"        ESCOLHA    \n\n1-Cadastrar Pessoa\n2-Remover Pessoa-\n3-Listar Pessoas-\n4-Pesquisar Pessoa-\n5-PesquisarHistorico-\n6-Incluir Proprietario-\n7-Pesquisar Unidade-\n8-Cadastrar Unidade-\n9-Somar Contas-\n10-Consultar Taxa-\n11-Buscar Conta-\n12-Inserir Conta-\n13- Sair\n");
				if(escolha == null){
					int confirmacao =	JOptionPane.showConfirmDialog(null, "Deseja sair?", "ENCERRRAR PROGRAMA", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
					if(confirmacao == 0){
						System.exit(0);
					}
					else{
						continue;
					}
				}
				else  {
				int i = Integer.parseInt(escolha);
					 switch(i){
					 case 1:
						 try{
						 g.cadastrarPessoa(new Pessoa(JOptionPane.showInputDialog("Digite o nome"), JOptionPane.showInputDialog("Digite o Cpf"), JOptionPane.showInputDialog("Digite o Telefone")));
						 JOptionPane.showMessageDialog(null, "Pessoa Cadastrada com sucesso");
						 }catch(PessoaJaExisteException e){
							 JOptionPane.showMessageDialog(null,e.getMessage());
						 }
						 break;
					 case 2:
						 try{
							 g.removerPessoa(JOptionPane.showInputDialog("Digite o cpf"));
							 JOptionPane.showMessageDialog(null,"Removido com sucesso");
						 }catch(PessoaInexistenteException e){
							 JOptionPane.showMessageDialog(null,e.getMessage());
						 }
						 break;
					 case 3:
						
							 g.listarPessoas();
							 JOptionPane.showMessageDialog(null, g.listarPessoas());
							 break;
					 case 4:
						 try{
							
							 JOptionPane.showMessageDialog(null, g.pesquisarPessoa(JOptionPane.showInputDialog("Digite o cpf")));
						 }catch(PessoaInexistenteException e){
							 JOptionPane.showMessageDialog(null, e.getMessage());
						 }
						 break;
					 case 5:
						 try{
							 JOptionPane.showMessageDialog(null, g.pesquisarHistorico(JOptionPane.showInputDialog("Digite o nome")));
						 }catch(HistoricoInexistenteException e){
							 JOptionPane.showMessageDialog(null, e.getMessage());
						 }
						 break;
					 case 6:
						 Pessoa p = new Pessoa(JOptionPane.showInputDialog("Digite o nome"), JOptionPane.showInputDialog("Digite o cpf"),JOptionPane.showInputDialog("Digite o telefon"));
						 try{
							 g.incluirProprietario(p);
							 JOptionPane.showMessageDialog(null, "Proprietario adicionado");
						 }catch(ProprietarioJaExisteException e){
							 JOptionPane.showMessageDialog(null, e.getMessage());
						 }
						 break;
					 case 7:
						 try{
							 String nome = JOptionPane.showInputDialog("Digite o nome");
							 JOptionPane.showMessageDialog(null,g.pesquisarUnidade(nome));
						 }catch(UnidadeInexistenteException e){
							 JOptionPane.showMessageDialog(null, e.getMessage());
						 }
						 break;
					 case 8:
						 try{
							Pessoa pessoa = new Pessoa(JOptionPane.showInputDialog("Digite o nome"), JOptionPane.showInputDialog("Digite o Cpf"), JOptionPane.showInputDialog("Digite o Telefone"));
							String numero =  JOptionPane.showInputDialog("Digite o numero");
							 int num= Integer.parseInt(numero);
							 Unidade u = new Unidade(num, pessoa, pessoa);
							 g.cadastrarUnidade(u.getNumero());
							 JOptionPane.showMessageDialog(null, "Unidade Cadastrada com sucesso");
						 }catch(UnidadeExistenteException u){
							 JOptionPane.showMessageDialog(null, u.getMessage());
						 }
						 break;
					 case 9:
						 String valor = JOptionPane.showInputDialog("Digite o valor");
						 float result = Float.parseFloat(valor);
						 //g.somarContas(result);
						 JOptionPane.showMessageDialog(null, g.somarContas(result));
						 break;
			
					 case 10:
						 String s = JOptionPane.showInputDialog("Digite o valor da taxa");
						 float con = Float.parseFloat(s);
						 TaxaCondominio t = new TaxaCondominio("Abril", con, "dataGeracao", "dataVencimento");
						 try{
							 g.ConsultarTaxa(con);
							 JOptionPane.showMessageDialog(null, "Valor " +t.getValorTaxa());
						 
						 }catch(TaxaInexistenteException e){
							 JOptionPane.showMessageDialog(null, e.getMessage());
						 }
					 case 11:
						try{
							String mes = JOptionPane.showInputDialog("Digite o mes da conta");

						g.buscarContas(mes);
						JOptionPane.showMessageDialog(null, "Mes"+ mes);
					 	}catch(ContaInexistenteException e){
					 		JOptionPane.showMessageDialog(null, e.getMessage());
					 	break;}
					 
					 case 12:
						  
						 try{
						String des = JOptionPane.showInputDialog("Descricao da Conta");
						String Valor =JOptionPane.showInputDialog("Valor da Conta");
						float v = Float.parseFloat(Valor);
						String mesRefe = JOptionPane.showInputDialog("Digite o mes referente");
						String Data = JOptionPane.showInputDialog("Data de Vencimento");
							g.inserirConta(des,v,mesRefe,Data);
							JOptionPane.showMessageDialog(null, "Conta inserida");
						 }catch(ContaExistenteException e ){
							 JOptionPane.showMessageDialog(null, e.getMessage());
							 
						 	}
					 case 13:
						 System.exit(0);
					 	}
				
					 }
				}
			

			catch(NumberFormatException erro){
				JOptionPane.showMessageDialog(null, "DIGITE UM VALOR NUMERICO VÁLIDO","ERRO",JOptionPane.ERROR_MESSAGE);
				continue;
			}
		}
	
	}
	
}
