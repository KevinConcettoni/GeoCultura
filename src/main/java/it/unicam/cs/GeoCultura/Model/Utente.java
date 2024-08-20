package it.unicam.cs.GeoCultura.Model;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "Utente")
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private String username;
    private String nomeCompleto;
    private String email;
    private Date dataRegistrazione;

    public Utente(String username, String nomeCompleto, String email, Date dataRegistrazione) {
        this.username = username;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.dataRegistrazione = dataRegistrazione;
    }

    public Utente(){

    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public int getID() {
        return ID;
    }
    public String getUsername(){
        return this.username;
    }
    public String getEmail() {
        return email;
    }
}
