package it.unicam.cs.GeoCultura.Model.DTO;

import it.unicam.cs.GeoCultura.Model.Utente;

import java.util.Date;

public class UtenteDTO {
    private String username;
    private String nomeCompleto;
    private String email;
    private Date dataRegistrazione;
    private Integer comune;
    private int ruolo;

    public Utente toUtente()
    {
        return new Utente(this.username, this.nomeCompleto, this.email, this.dataRegistrazione);
    }
    public Integer getComune() {
        return comune;
    }

    public int getRuolo() {
        return ruolo;
    }
}
