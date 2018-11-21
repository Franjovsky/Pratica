package Beans;

import dao.movimentacaoDAO;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.event.AjaxBehaviorEvent;
import model.Movimentação;
import org.hibernate.criterion.LikeExpression;

@Named(value = "movimentacaoBean")
@SessionScoped

public class movimentacaoBean implements Serializable{
      private List<Movimentação> sazonalidade = new ArrayList<>();

    public List<Movimentação> getSazonalidade() {
        return sazonalidade;
    }

    public void setSazoalidade(List<Movimentação> sazonalidade) {
        this.sazonalidade = sazonalidade;
    }
        public void atualizarAction() {
        this.sazonalidade = movimentacaoDAO.findSaz();
    }
}
