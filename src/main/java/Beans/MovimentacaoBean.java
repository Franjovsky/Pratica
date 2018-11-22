package Beans;

import dao.MovimentacaoDAO;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.event.AjaxBehaviorEvent;
import model.Movimentacao;
import org.hibernate.criterion.LikeExpression;

@Named(value = "movimentacaoBean")
@SessionScoped

public class MovimentacaoBean implements Serializable {

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
}
