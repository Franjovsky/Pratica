package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_produto;
    private int cod_barras;
    private int qtde;
    private String descricao_produto;
    private int id_marca;
    private int id_categoria;//ok
    private int id_fornecedor;//ok
    private String tipo_volume;
    private double peso_produto;
    private double custo;
    private double pr_venda;

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public int getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(int cod_barras) {
        this.cod_barras = cod_barras;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public String getDescricao_produto() {
        return descricao_produto;
    }

    public void setDescricao_produto(String descricao_produto) {
        this.descricao_produto = descricao_produto;
    }

    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public int getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public String getTipo_volume() {
        return tipo_volume;
    }

    public void setTipo_volume(String tipo_volume) {
        this.tipo_volume = tipo_volume;
    }

    public double getPeso_produto() {
        return peso_produto;
    }

    public void setPeso_produto(double peso_produto) {
        this.peso_produto = peso_produto;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getPr_venda() {
        return pr_venda;
    }

    public void setPr_venda(double pr_venda) {
        this.pr_venda = pr_venda;
    }

}