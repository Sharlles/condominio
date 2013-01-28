

import java.util.Calendar;
import java.util.Date;


public class Contas {
    
    String Descricao;
    Calendar DatadeVencimento;
    String DataDeGeracao;
    String MesRef;
    
   int taxa = 50;

    public String getDataDeGeracao() {
        return DataDeGeracao;
    }

    public Contas(String Descricao, Calendar DatadeVencimento, String DataDeGeracao, String MesRef) {
        this.Descricao = Descricao;
        this.DatadeVencimento = DatadeVencimento;
        this.DataDeGeracao = DataDeGeracao;
        this.MesRef = MesRef;
    }



    public void setTaxa(int taxa) {
        this.taxa = taxa;
    }

    public int getTaxa() {
        return taxa;
    }

    public Calendar getDatadeVencimento() {
        return DatadeVencimento;
    }

    public String getDescricao() {
        return Descricao;
    }

    public String getMesRef() {
        return MesRef;
    }

    public void setDataDeGeracao(String DataDeGeracao) {
        this.DataDeGeracao = DataDeGeracao;
    }

    public void setDatadeVencimento(Calendar DatadeVencimento) {
        this.DatadeVencimento = DatadeVencimento;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public void setMesRef(String MesRef) {
        this.MesRef = MesRef;
    }
    
    
}
