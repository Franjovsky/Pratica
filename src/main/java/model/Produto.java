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
    private int Prd_Marca;
    private int id_categoria;
    private int id_fornecedor;
    private String tipo_volume;
    private double peso_produto;
    private double custo;
    private double pr_venda;

    public int getid_produto() {
        return id_produto;
    }

    public void setid_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public int getcod_barras() {
        return cod_barras;
    }

    public void setcod_barras(int cod_barras) {
        this.cod_barras = cod_barras;
    }

    public int getqtde() {
        return qtde;
    }

    public void setqtde(int qtde) {
        this.qtde = qtde;
    }

    public String getdescricao_produto() {
        return descricao_produto;
    }

    public void setdescricao_produto(String descricao_produto) {
        this.descricao_produto = descricao_produto;
    }

    public int getPrd_Marca() {
        return Prd_Marca;
    }

    public void setPrd_Marca(int Prd_Marca) {
        this.Prd_Marca = Prd_Marca;
    }

    public int getid_categoria() {
        return id_categoria;
    }

    public void setid_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String gettipo_volume() {
        return tipo_volume;
    }

    public void settipo_volume(String tipo_volume) {
        this.tipo_volume = tipo_volume;
    }

    public double getpeso_produto() {
        return peso_produto;
    }

    public void setpeso_produto(double peso_produto) {
        this.peso_produto = peso_produto;
    }

    public double getcusto() {
        return custo;
    }

    public void setcusto(double custo) {
        this.custo = custo;
    }

    public double getpr_venda() {
        return pr_venda;
    }

    public void setpr_venda(double pr_venda) {
        this.pr_venda = pr_venda;
    }

    public int getid_fornecedor() {
        return id_fornecedor;
    }

    public void setid_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

}
