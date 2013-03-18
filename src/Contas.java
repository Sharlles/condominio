

import java.util.Calendar;
import java.util.Date;


public class Contas {
    
  private  String descricaoConta;
  private  String DatadeVencimento;
  private  String MesRef;
  private float valorConta;
    
   
    public Contas(String Descricao, String DatadeVencimento,float valor, String MesRef) {
        this.descricaoConta = Descricao;
        this.DatadeVencimento = DatadeVencimento;
        this.valorConta = valor;
        this.MesRef = MesRef;
    }


    public String getDatadeVencimento() {
        return DatadeVencimento;
    }

    public String getDescricaoConta() {
        return descricaoConta;
    }
    
    public float getValorConta(){
    	return valorConta;
    }

    public String getMesRef() {
        return MesRef;
    }

   
    public void setDatadeVencimento(String DatadeVencimento) {
        this.DatadeVencimento = DatadeVencimento;
    }

    public void setDescricaoConta(String Descricao) {
        this.descricaoConta = Descricao;
    }

    public void setMesRef(String MesRef) {
        this.MesRef = MesRef;
    }
    
    public void setValorConta(float valorConta){
    	this.valorConta = valorConta;
    }
}
