/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import dao.FornecedorDAO;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import model.Fornecedor;

/**
 *
 * @author jacso
 */
@FacesConverter (value="fornecedorConverter")
public class FornecedorConverter implements Converter {
    private FornecedorDAO fornecedorDAO = new FornecedorDAO(); 
    @Override

    
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        int fCodigo=Integer.parseInt(string);
        Fornecedor f = fornecedorDAO.find(fCodigo);
        return f;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object t) {
        return ""+((Fornecedor)t).getId_fornecedor();
    }
    
}
