package it.unicam.cs.GeoCultura;

import java.util.Date;

public class Itinerario extends Content{
    private String ID;
    private String nome;
    private String descrizione;
    private Utente creatore;
    private Date dataCreazione;

    public Itinerario(String nome, String descrizione, Date dataCreazione, int IdCreatore) {
        super(nome, descrizione, dataCreazione, IdCreatore);
    }
    public TipoContenuto getTipoContenuto(){
        return TipoContenuto.ITINERARIO;
    }
}
