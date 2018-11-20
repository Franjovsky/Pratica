package converter;

import dao.ProdutoDAO;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import model.Produto;

@FacesConverter (value="produtoConverter")
public class ProdutoConverter implements Converter {
    private ProdutoDAO produtoDAO = new ProdutoDAO();

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        int pCodigo=Integer.parseInt(string);
        Produto p = produtoDAO.find(pCodigo);
        return p;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object t) {
        return ""+((Produto)t).getId_produto();
    }
}