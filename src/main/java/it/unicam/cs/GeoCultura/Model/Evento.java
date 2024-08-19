package it.unicam.cs.GeoCultura.Model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;

import java.util.Date;
@Entity
public class Evento extends Contenuto {
    private Date dataInizio;
    private Date datafine;
    @Embedded
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

    public TipoContenuto getTipoContenuto(){
        return TipoContenuto.EVENTO;
    }
}
