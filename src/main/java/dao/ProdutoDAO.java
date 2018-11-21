package dao;

import config.HibernateUtil;
import java.util.List;
import model.Produto;
import org.hibernate.Session;

public class ProdutoDAO {

    private Session session;

    public ProdutoDAO() {

        session = HibernateUtil.getSessionFactory().openSession();
    }

    public void insert(Produto produto) {
        session.getTransaction().begin();
        session.save(produto);
        session.getTransaction().commit();
    }

    public void delete(Produto produto) {
        session.getTransaction().begin();
        session.remove(produto);
        session.getTransaction().commit();
    }

    public List<Produto> findAll() {
        return session.createQuery("select p from Produto p").list();
        
    
    }

    public List<Produto> findPesquisa(String nome_produto) {
        return session.createQuery("select p from Produto p where p.descricao_produto like :a")
                .setParameter("a", "%"+nome_produto+"%")
                .list();
    }

   public Produto find (int id ){
        return session.get(Produto.class,id);
    }
    

}

