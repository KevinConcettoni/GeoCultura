package it.unicam.cs.GeoCultura;

import java.util.Date;

public class Contest extends Content{
    private String ID;
    private String nome;
    private String descrizione;
    private Date dataInizio;
    private Date dataFine;
    private String tipo;
    private String regole;

    public Contest(String nome, String descrizione, Date dataCreazione, int IdCreatore) {
        super(nome, descrizione, dataCreazione, IdCreatore);
    }
    public TipoContenuto getTipoContenuto(){
        return TipoContenuto.CONTEST;
    }
}
