/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import dao.MarcaDAO;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import model.Marca;

/**
 *
 * @author jacso
 */
@FacesConverter ("marcaConverter")
public class MarcaConverter implements Converter{
private MarcaDAO marcaDAO = new MarcaDAO(); 
    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
       int mCodigo=Integer.parseInt(string);
        return marcaDAO.find(mCodigo);
       
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object t) {
        return ""+((Marca)t).getId_marca();
    }
    
}
