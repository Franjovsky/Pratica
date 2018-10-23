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
    private int ID;
    private int C_Barras;
    private int Prd_Qtde;
    private int Prd_Lote;
    private String Prd_Nome;
    private String Prd_Desc;
    private String Prd_Marca;
    private String Prd_Categoria;
    private String Prd_Fornecedor;
    private String Tipo_Vol;
    private double Prd_Peso;
    private double Preco_Compra;
    private double Preco_venda;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getC_Barras() {
        return C_Barras;
    }

    public void setC_Barras(int C_Barras) {
        this.C_Barras = C_Barras;
    }

    public int getPrd_Qtde() {
        return Prd_Qtde;
    }

    public void setPrd_Qtde(int Prd_Qtde) {
        this.Prd_Qtde = Prd_Qtde;
    }

    public int getPrd_Lote() {
        return Prd_Lote;
    }

    public void setPrd_Lote(int Prd_Lote) {
        this.Prd_Lote = Prd_Lote;
    }

    public String getPrd_Nome() {
        return Prd_Nome;
    }

    public void setPrd_Nome(String Prd_Nome) {
        this.Prd_Nome = Prd_Nome;
    }

    public String getPrd_Desc() {
        return Prd_Desc;
    }

    public void setPrd_Desc(String Prd_Desc) {
        this.Prd_Desc = Prd_Desc;
    }

    public String getPrd_Marca() {
        return Prd_Marca;
    }

    public void setPrd_Marca(String Prd_Marca) {
        this.Prd_Marca = Prd_Marca;
    }

    public String getPrd_Categoria() {
        return Prd_Categoria;
    }

    public void setPrd_Categoria(String Prd_Categoria) {
        this.Prd_Categoria = Prd_Categoria;
    }

    public String getTipo_Vol() {
        return Tipo_Vol;
    }

    public void setTipo_Vol(String Tipo_Vol) {
        this.Tipo_Vol = Tipo_Vol;
    }

    public double getPrd_Peso() {
        return Prd_Peso;
    }

    public void setPrd_Peso(double Prd_Peso) {
        this.Prd_Peso = Prd_Peso;
    }

    public double getPreco_Compra() {
        return Preco_Compra;
    }

    public void setPreco_Compra(double Preco_Compra) {
        this.Preco_Compra = Preco_Compra;
    }

    public double getPreco_venda() {
        return Preco_venda;
    }

    public void setPreco_venda(double Preco_venda) {
        this.Preco_venda = Preco_venda;
    }

    public String getPrd_Fornecedor() {
        return Prd_Fornecedor;
    }

    public void setPrd_Fornecedor(String Prd_Fornecedor) {
        this.Prd_Fornecedor = Prd_Fornecedor;
    }

}
