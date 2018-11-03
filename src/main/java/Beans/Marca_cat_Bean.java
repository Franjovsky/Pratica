package Beans;

import dao.Marca_cat_DAO;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import model.Marca_cat;

@Named(value = "marca_cat_Bean")
@Dependent
public class Marca_cat_Bean {

    public Marca_cat_Bean() {
    }

    public void insertAction() {
        marca_cat_DAO.insert(marca_cat);
        this.marca_cat = new Marca_cat();
        this.marcas_cats = marca_cat_DAO.findAll();
    }

    public void atualizarAction() {
        this.marcas_cats = marca_cat_DAO.findAll();
    }

    public void removeAction(Marca_cat mc) {
        marca_cat_DAO.delete(mc);
        this.marcas_cats = marca_cat_DAO.findAll();
    }

    private Marca_cat_DAO marca_cat_DAO = new Marca_cat_DAO();
    private Marca_cat marca_cat = new Marca_cat();
    private List<Marca_cat> marcas_cats = new ArrayList<>();

    public List<Marca_cat> getMarcas_cats() {
        if (this.marcas_cats == null) {
            this.marcas_cats = marca_cat_DAO.findAll();
        }
        return marcas_cats;
    }

    public void setMarcas_cats(List<Marca_cat> marcas_cats) {
        this.marcas_cats = marcas_cats;
    }

}
