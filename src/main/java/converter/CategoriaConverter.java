/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import dao.CategoriaDAO;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import model.Categoria;

/**
 *
 * @author jacso
 */
@FacesConverter (value="categoriaConverter")
public class CategoriaConverter implements Converter {
    private CategoriaDAO categoriaDAO = new CategoriaDAO();

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        int cCodigo=Integer.parseInt(string);
        Categoria c = categoriaDAO.find(cCodigo);
        return c;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object t) {
        return ""+((Categoria)t).getId_categoria();
    }
}
