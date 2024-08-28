package it.unicam.cs.GeoCultura.Model.DTO;

import it.unicam.cs.GeoCultura.Model.Comune;
import it.unicam.cs.GeoCultura.Model.StatoApprovazione;
import it.unicam.cs.GeoCultura.Model.Utente;


import java.util.Date;

public class ContenutoDTO {
    private String nome;
    private String descrizione;
    private Date dataCreazione;
    private Integer creatore;
    private Integer comune;

    public ContenutoDTO(String nome, String descrizione, Date dataCreazione, Integer creatore, Integer comune) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.dataCreazione = dataCreazione;
        this.creatore = creatore;
        this.comune = comune;
    }

    public ContenutoDTO(){

    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public Date getDataCreazione() {
        return dataCreazione;
    }

    public Integer getCreatore() {
        return creatore;
    }

    public Integer getComune() {
        return comune;
    }
}
