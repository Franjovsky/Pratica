package dao;

import config.HibernateUtil;
import java.util.List;
import model.Marca_cat;
import org.hibernate.Session;

public class Marca_cat_DAO {

    private Session session;

    public Marca_cat_DAO() {

        session = HibernateUtil.getSessionFactory().openSession();
    }

    public void insert(Marca_cat marca_cat) {
        session.getTransaction().begin();
        session.save(marca_cat);
        session.getTransaction().commit();
    }

    public void delete(Marca_cat marca_cat) {
        session.getTransaction().begin();
        session.remove(marca_cat);
        session.getTransaction().commit();
    }

    public List<Marca_cat> findAll() {
        return session.createQuery("select mc from Marca_cat mc").list();
    }
}
