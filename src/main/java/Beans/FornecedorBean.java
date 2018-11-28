package Beans;

import dao.FornecedorDAO;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import model.Fornecedor;

@Named(value = "fornecedorBean")
@SessionScoped
public class FornecedorBean implements Serializable {

    public FornecedorBean() {
    }
        public void mensagens(String mensagem, int tipo) {
        if (tipo == 0) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Aviso", mensagem);
            FacesContext contexto = FacesContext.getCurrentInstance();
            contexto.addMessage(null, msg);
        } else {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", mensagem);
            FacesContext contexto = FacesContext.getCurrentInstance();
            contexto.addMessage(null, msg);
        }
    }
          public void selectItem(Fornecedor f) {
        this.fornecedor = f;
    }

    public void insertAction() {
        fornecedorDAO.insert(fornecedor);
        mensagens("Cadastrado com sucesso", 1);
        this.fornecedor = new Fornecedor();
        this.fornecedores = fornecedorDAO.findAll();
    }

    public void atualizarAction() {
        this.fornecedores = fornecedorDAO.findAll();
    }

    public void removeAction(Fornecedor fornec) {
        fornecedorDAO.delete(fornec);
        this.fornecedores = fornecedorDAO.findAll();
    }

    private FornecedorDAO fornecedorDAO = new FornecedorDAO();

    private Fornecedor fornecedor = new Fornecedor();
    private List<Fornecedor> fornecedores = new ArrayList<>();

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public List<Fornecedor> getFornecedores() {
        if (this.fornecedores == null) {
            this.fornecedores = fornecedorDAO.findAll();
        }
        return fornecedores;
    }

    public void setFornecedores(List<Fornecedor> fornecedores) {
        this.fornecedores = fornecedores;
    }
}
