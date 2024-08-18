package it.unicam.cs.GeoCultura.Model;

import jakarta.persistence.*;

/**
 * Classe che si occupa di gestire i ruoli degli utenti all'intero di un comune
 */
@Entity
@Table(name="RuoloUtenteComune")
public class RuoloUtenteComune {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    @ManyToOne
    private Comune comune;
    private RuoloUtente ruolo;
    @ManyToOne
    private Utente utente;
    public Comune getComune() {
        return comune;
    }
    public Utente getUtente() {
        return utente;
    }
}
