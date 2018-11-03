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
    private int ID;
    private int Tel_Fornecedor;
    private int CNPJ_Fornecedor;
    private String Nome_Fornecedor;
    private String Email_Fornecedor;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTel_Fornecedor() {
        return Tel_Fornecedor;
    }

    public void setTel_Fornecedor(int Tel_Fornecedor) {
        this.Tel_Fornecedor = Tel_Fornecedor;
    }

    public String getNome_Fornecedor() {
        return Nome_Fornecedor;
    }

    public void setNome_Fornecedor(String Nome_Fornecedor) {
        this.Nome_Fornecedor = Nome_Fornecedor;
    }

    public String getEmail_Fornecedor() {
        return Email_Fornecedor;
    }

    public void setEmail_Fornecedor(String Email_Fornecedor) {
        this.Email_Fornecedor = Email_Fornecedor;
    }

    public int getCNPJ_Fornecedor() {
        return CNPJ_Fornecedor;
    }

    public void setCNPJ_Fornecedor(int CNPJ_Fornecedor) {
        this.CNPJ_Fornecedor = CNPJ_Fornecedor;
    }
    

}
