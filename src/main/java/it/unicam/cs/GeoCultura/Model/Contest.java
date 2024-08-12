package it.unicam.cs.GeoCultura.Model;

import java.util.Date;
import java.util.List;

public class Contest{
    int ID;
    private String nome;
    private String descrizione;
    private Date dataInizio;
    private Date dataFine;
    private String tipo;
    private String regole;
    private List<Contenunto> contenuti;
    private Contenunto contenutoVincitore;
    private Comune comune;
    private Utente creatore;

    public Contest(String nome, String descrizione, Date dataInizio, Date dataFine,
                   String tipo, String regole, Comune comune, Utente creatore) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.tipo = tipo;
        this.regole = regole;
        this.comune = comune;
        this.creatore = creatore;
    }

    public TipoContenuto getTipoContenuto(){
        return TipoContenuto.CONTEST;
    }
}
