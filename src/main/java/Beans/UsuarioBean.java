package Beans;

import dao.UsuarioDAO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import model.Usuario;

@Named(value = "usuarioBean")
@SessionScoped
public class UsuarioBean implements Serializable {

    private int id;
    private String senha;

    public UsuarioBean() {
    }

    public void insertAction() {
        usuarioDAO.insert(usuario);
        this.usuario = new Usuario();
        this.usuarios = usuarioDAO.findAll();
    }

    public void atualizarAction() {
        this.usuarios = usuarioDAO.findAll();
    }

    public void removeAction(Usuario us) {
        usuarioDAO.delete(us);
        this.usuarios = usuarioDAO.findAll();
    }

    public String verificaLogin() {
         this.usuario = new Usuario();
         
        usuario.setId_usuario(id);
        usuario.setSenha_usuario(senha);
        int verifica = usuarioDAO.verificaLogin(this.usuario);

        if (verifica == 1) {
            return "Cad_Produto";
        } 
        else {
            mensagens("Verifique os dados informados",0);
            return "";
        }
        
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

    private UsuarioDAO usuarioDAO = new UsuarioDAO();
    private Usuario usuario = new Usuario();
    private List<Usuario> usuarios = new ArrayList<>();

    public List<Usuario> getUsuarios() {
        if (this.usuarios == null) {
            this.usuarios = usuarioDAO.findAll();
        }
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public UsuarioDAO getUsuarioDAO() {
        return usuarioDAO;
    }

    public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

}
