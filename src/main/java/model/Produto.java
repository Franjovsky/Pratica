package model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity

public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_produto;
    private int cod_barras;
    private int qtde;
    private String descricao_produto;
    @ManyToOne
    @JoinColumn(name = "id_marca")
    private Marca marca;
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;//ok
    @ManyToOne
    @JoinColumn(name = "id_fornecedor")
    private Fornecedor fornecedor;//ok
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

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.id_produto;
        hash = 43 * hash + this.cod_barras;
        hash = 43 * hash + this.qtde;
        hash = 43 * hash + Objects.hashCode(this.descricao_produto);
        hash = 43 * hash + Objects.hashCode(this.marca);
        hash = 43 * hash + Objects.hashCode(this.categoria);
        hash = 43 * hash + Objects.hashCode(this.fornecedor);
        hash = 43 * hash + Objects.hashCode(this.tipo_volume);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.peso_produto) ^ (Double.doubleToLongBits(this.peso_produto) >>> 32));
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.custo) ^ (Double.doubleToLongBits(this.custo) >>> 32));
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.pr_venda) ^ (Double.doubleToLongBits(this.pr_venda) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        if (this.id_produto != other.id_produto) {
            return false;
        }
        if (this.cod_barras != other.cod_barras) {
            return false;
        }
        if (this.qtde != other.qtde) {
            return false;
        }
        if (Double.doubleToLongBits(this.peso_produto) != Double.doubleToLongBits(other.peso_produto)) {
            return false;
        }
        if (Double.doubleToLongBits(this.custo) != Double.doubleToLongBits(other.custo)) {
            return false;
        }
        if (Double.doubleToLongBits(this.pr_venda) != Double.doubleToLongBits(other.pr_venda)) {
            return false;
        }
        if (!Objects.equals(this.descricao_produto, other.descricao_produto)) {
            return false;
        }
        if (!Objects.equals(this.tipo_volume, other.tipo_volume)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        if (!Objects.equals(this.fornecedor, other.fornecedor)) {
            return false;
        }
        return true;
    }
 
}
