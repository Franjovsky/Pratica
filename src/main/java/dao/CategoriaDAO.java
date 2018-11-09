package dao;

import config.HibernateUtil;
import java.util.List;
import model.Categoria;
import org.hibernate.Session;

public class CategoriaDAO {

    private Session session;

    public CategoriaDAO() {

        session = HibernateUtil.getSessionFactory().openSession();
    }

    public void insert(Categoria categoria) {
        session.getTransaction().begin();
        session.save(categoria);
        session.getTransaction().commit();
    }

    public void delete(Categoria categoria) {
        session.getTransaction().begin();
        session.remove(categoria);
        session.getTransaction().commit();
    }

    public List<Categoria> findAll() {
        return session.createQuery("select c from Categoria c").list();
    }
}
