package it.unicam.cs.GeoCultura.Model;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "Contenuto")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Contenunto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    String nome = null;
    String descrizione = null;
    Date dataCreazione = null;
    @ManyToOne
    Utente creatore = null;
    StatoApprovazione statoApprovazione = null;
    @ManyToOne
    Comune comune;

    public Contenunto(String nome, String descrizione, Date dataCreazione, int IdCreatore){
        this.nome = nome;
        this.descrizione = descrizione;
        this.dataCreazione = dataCreazione;
        this.creatore = new Utente();
        this.creatore.setID(IdCreatore);
    }





}
