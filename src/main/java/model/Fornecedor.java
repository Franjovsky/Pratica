package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Fornecedor implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_fornecedor;
    private String telefone_fornecedor;
    private String cnpj_fornecedor;
    private String razao_fornecedor;
    private String email_fornecedor;

    public int getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public String getTelefone_fornecedor() {
        return telefone_fornecedor;
    }

    public void setTelefone_fornecedor(String telefone_fornecedor) {
        this.telefone_fornecedor = telefone_fornecedor;
    }

    public String getCnpj_fornecedor() {
        return cnpj_fornecedor;
    }

    public void setCnpj_fornecedor(String cnpj_ornecedor) {
        this.cnpj_fornecedor = cnpj_ornecedor;
    }

    public String getRazao_fornecedor() {
        return razao_fornecedor;
    }

    public void setRazao_fornecedor(String razao_fornecedor) {
        this.razao_fornecedor = razao_fornecedor;
    }

    public String getEmail_fornecedor() {
        return email_fornecedor;
    }

    public void setEmail_fornecedor(String email_fornecedor) {
        this.email_fornecedor = email_fornecedor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id_fornecedor;
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
        final Fornecedor other = (Fornecedor) obj;
        if (this.id_fornecedor != other.id_fornecedor) {
            return false;
        }
        return true;
    }

}
