package dao;

import config.HibernateUtil;
import java.util.List;
import model.Marca;
import org.hibernate.Session;

public class MarcaDAO {

    private Session session;

    public MarcaDAO() {

        session = HibernateUtil.getSessionFactory().openSession();
    }

    public void insert(Marca marca) {
        session.getTransaction().begin();
        session.save(marca);
        session.getTransaction().commit();
    }

    public void delete(Marca marca) {
        session.getTransaction().begin();
        session.remove(marca);
        session.getTransaction().commit();
    }

    public List<Marca> findAll() {
        return session.createQuery("select m from Marca m").list();
    }
}
