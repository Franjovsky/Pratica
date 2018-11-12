package Beans;

import dao.CategoriaDAO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import model.Categoria;

@Named(value = "categoriaBean")
@SessionScoped
public class CategoriaBean implements Serializable {

    public CategoriaBean() {
    }

    public void insertAction() {
        categoriaDAO.insert(categoria);
        this.categoria = new Categoria();
        this.categorias = categoriaDAO.findAll();
    }

    public void atualizarAction() {
        this.categorias = categoriaDAO.findAll();
    }

    public void removeAction(Categoria ct) {
        categoriaDAO.delete(ct);
        this.categorias = categoriaDAO.findAll();
    }

    private CategoriaDAO categoriaDAO = new CategoriaDAO();
    private Categoria categoria = new Categoria();
    private List<Categoria> categorias = new ArrayList<>();

    public List<Categoria> getCategorias() {
        if (this.categorias == null) {
            this.categorias = categoriaDAO.findAll();
        }
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}
