package dao;

import config.HibernateUtil;
import java.util.List;
import model.Movimentacao;
import model.Produto;
import org.hibernate.Session;

public class MovimentacaoDAO {

    private Session session;

    public MovimentacaoDAO() {
        session = HibernateUtil.getSessionFactory().openSession();

    }
    public void insert_Venda(Movimentacao movimentacao) {
        session.getTransaction().begin();
        session.save(movimentacao);
        Produto p = session.get(Produto.class, movimentacao.getId_produto().getId_produto());
        int saldo = p.getQtde() - movimentacao.getMov_qtde();
        p.setQtde(saldo);
        session.update(p);
        session.getTransaction().commit();
    }

        public void insert_Compra(Movimentacao movimentacao) {
        session.getTransaction().begin();
        session.save(movimentacao);
        Produto p = session.get(Produto.class, movimentacao.getId_produto().getId_produto());
        int saldo = p.getQtde() + movimentacao.getMov_qtde();
        p.setQtde(saldo);
        session.update(p);
        session.getTransaction().commit();
    }
    
    public List<Movimentacao> findSaz() {
        return session.createSQLQuery("select extract(month from mov_data) Mes, produto.descricao_produto, sum(mov_qtde) qtde "
                + "from movimentacao m "
                + "inner join produto on produto.id_produto=m.id_produto "
                + "group by extract (month from mov_data), produto.descricao_produto "
                + "order by qtde desc limit(10)").list();
    }
}
