package dao;

import config.HibernateUtil;
import java.util.List;
import model.Usuario;
import org.hibernate.Session;

public class UsuarioDAO {

    private Session session;

    public UsuarioDAO() {

        session = HibernateUtil.getSessionFactory().openSession();
    }

    public void insert(Usuario usuario) {
        session.getTransaction().begin();
        session.save(usuario);
        session.getTransaction().commit();
    }

    public void delete(Usuario usuario) {
        session.getTransaction().begin();
        session.remove(usuario);
        session.getTransaction().commit();
    }

    public List<Usuario> findAll() {
        return session.createQuery("select u from Usuario u").list();
    }
    public Usuario find (int id ){
        return session.get(Usuario.class,id);
    }
}
