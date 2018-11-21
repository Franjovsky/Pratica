package Beans;

import dao.ProdutoDAO;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.event.AjaxBehaviorEvent;
import model.Produto;
import org.hibernate.criterion.LikeExpression;

@Named(value = "produtoBean")
@SessionScoped
public class ProdutoBean implements Serializable {

    private String nome_produto;

    public ProdutoBean() {
    }

    public void insertAction() {
        produtoDAO.insert(produto);
        this.produto = new Produto();
        this.produtos = produtoDAO.findAll();
    }

    public void buscarAction() {

    }

    public void atualizarAction() {
        this.produtos = produtoDAO.findAll();
    }

    public void removeAction(Produto prd) {
        produtoDAO.delete(prd);
        this.produtos = produtoDAO.findAll();
    }

    public void pesquisarAction(AjaxBehaviorEvent event) {
        this.produtos = produtoDAO.findPesquisa(nome_produto);
    }

    private ProdutoDAO produtoDAO = new ProdutoDAO();

    private Produto produto = new Produto();
    private List<Produto> produtos = new ArrayList<>();

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public List<Produto> getProdutos() {
        if (this.produtos == null) {
            this.produtos = produtoDAO.findAll();
        }
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

  
}
