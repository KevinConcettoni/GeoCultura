package it.unicam.cs.GeoCultura;

public class Utente {
    private int ID;
    private String username;
    private String nomeCompleto;
    private String email;

    public Utente(String username, String nomeCompleto, String email) {
        this.username = username;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
    }

    public Utente(){

    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public int getID() {
        return ID;
    }
}
