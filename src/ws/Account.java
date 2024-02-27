package ws;

import java.io.Serializable;



public class Account implements Serializable {

    int id;
    float solde;
    public Account() { super();
    }
    public Account(int id, float solde) {
        this.id = id;
        this.solde = solde; }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }
}
