package it.unicam.cs.GeoCultura.Model.DTO;

import it.unicam.cs.GeoCultura.Model.Contenuto;
import it.unicam.cs.GeoCultura.Model.Contest;
import jakarta.persistence.ManyToMany;

import java.util.Date;
import java.util.List;

public class ContestDTO {
    private String nome;
    private String descrizione;
    private Date dataInizio;
    private Date dataFine;
    private String tipo;
    private String regole;
    private List<Integer> contenuti;
    private Integer idCreatore;
    private Integer idComune;

    public ContestDTO(String nome, String descrizione, Date dataInizio, Date dataFine, String tipo,
                      String regole, List<Integer> contenuti, Integer idCreatore, Integer idComune) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.tipo = tipo;
        this.regole = regole;
        this.contenuti = contenuti;
        this.idCreatore = idCreatore;
        this.idComune = idComune;
    }

    public Contest toContest(){
        return new Contest(this.nome, this.descrizione, this.dataInizio, this.dataFine, this.contenuti, this.tipo,
                this.regole, this.idComune, this.idCreatore);
    }

    public List<Integer> getContenuti() {
        return contenuti;
    }
}
