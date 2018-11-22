package dao;

import config.HibernateUtil;
import java.util.List;
import model.Movimentacao;
import org.hibernate.Session;

public class MovimentacaoDAO {

    private Session session;

    public MovimentacaoDAO() {
        session = HibernateUtil.getSessionFactory().openSession();

    }

    public List<Movimentacao> findSaz() {
        return session.createSQLQuery("select extract(month from mov_data) Mes, produto.descricao_produto, sum(mov_qtde) qtde "
                + "from movimentacao m "
                + "inner join produto on produto.id_produto=m.id_produto "
                + "group by extract (month from mov_data), produto.descricao_produto "
                + "order by qtde desc limit(10)").list();
    }
}
