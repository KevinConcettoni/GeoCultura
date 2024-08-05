package it.unicam.cs.GeoCultura;

import java.util.Date;

public class PuntoDiInteresse extends Contest{
    private String ID;
    private String nome;
    private int categoria;
    private Utente creatore;
    private Date creationDate;
    private String description;
    private Coordinate coordinate;

    public PuntoDiInteresse(String nome, String descrizione, Date dataCreazione, int IdCreatore) {
        super(nome, descrizione, dataCreazione, IdCreatore);
    }
    public TipoContenuto getTipoContenuto(){
        return TipoContenuto.PUNTO_DI_INTERESSE;
    }
}
