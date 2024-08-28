package it.unicam.cs.GeoCultura.Model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

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
    @OneToMany
    private List<Notifica> notifiche;

    public Utente(String username, String nomeCompleto, String email, Date dataRegistrazione) {
        this.username = username;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.dataRegistrazione = dataRegistrazione;
        this.nomeCompleto = null;
    }

    public Utente(){

    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public Integer getID() {
        return ID;
    }
    public String getUsername(){
        return this.username;
    }
    public String getEmail() {
        return email;
    }
}
