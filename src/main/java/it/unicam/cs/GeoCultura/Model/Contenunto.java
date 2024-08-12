package it.unicam.cs.GeoCultura.Model;

import java.util.Date;

public abstract class Contenunto {
    private int ID;
    String nome;
    String descrizione;
    Date dataCreazione;
    Utente creatore;
    StatoApprovazione statoApprovazione;

    public Contenunto(String nome, String descrizione, Date dataCreazione, int IdCreatore){
        this.nome = nome;
        this.descrizione = descrizione;
        this.dataCreazione = dataCreazione;
        this.creatore = new Utente();
        this.creatore.setID(IdCreatore);
    }





}
