package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Marca_cat implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String Nome_Marca;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome_Marca() {
        return Nome_Marca;
    }

    public void setNome_Marca(String Nome_Marca) {
        this.Nome_Marca = Nome_Marca;
    }

}
