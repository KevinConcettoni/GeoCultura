package it.unicam.cs.GeoCultura.Model;

import java.util.Date;

public class Evento extends Content{
    private int ID;
    private String nome;
    private String descrizione;
    private Date dataCreazione;
    private Utente creatore;
    private Date dataInizio;
    private Date datafine;
    private Posizione posizione;
    private Comune comune;

    public Evento(String nome, String descrizione, Date dataCreazione, int IdCreatore,
                  Date dataInizio, Date datafine, Posizione posizione, Comune comune) {
        super(nome, descrizione, dataCreazione, IdCreatore);
        this.dataInizio = dataInizio;
        this.datafine = datafine;
        this.posizione = posizione;
        this.comune = comune;
    }
}
