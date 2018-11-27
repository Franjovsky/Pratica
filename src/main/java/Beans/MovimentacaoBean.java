package Beans;

import dao.MovimentacaoDAO;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import model.Movimentacao;

@Named(value = "movimentacaoBean")
@SessionScoped

public class MovimentacaoBean implements Serializable {
    
    private int mov_qtde;
    private int qtde;
    private int atualiza_qtd;
    
   public void insertAction() {
       movimentacao.setId_lote(1);
        movimentacaoDAO.insert_Venda(movimentacao);
        this.movimentacao = new Movimentacao();
        //this.produtos = produtoDAO.findAll();
    }
   
      public void insertCompra() {
       movimentacao.setId_lote(1);
        movimentacaoDAO.insert_Compra(movimentacao);
        this.movimentacao = new Movimentacao();
        //this.produtos = produtoDAO.findAll();
    }

    private MovimentacaoDAO movimentacaoDAO = new MovimentacaoDAO();
    private Movimentacao movimentacao = new Movimentacao();
    private List<Movimentacao> sazonalidade = new ArrayList<>();

    public List<Movimentacao> getSazonalidade() {
        return sazonalidade;
    }

    public void setSazoalidade(List<Movimentacao> sazonalidade) {
        this.sazonalidade = sazonalidade;
    }

    public void atualizarAction() {
        this.sazonalidade = movimentacaoDAO.findSaz();
    }

    public Movimentacao getMovimentacao() {
        return movimentacao;
    }

    public void setMovimentacao(Movimentacao movimentacao) {
        this.movimentacao = movimentacao;
    }
}
