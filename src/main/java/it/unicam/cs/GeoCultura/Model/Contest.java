package it.unicam.cs.GeoCultura.Model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
@Entity
@Table(name = "Contest")
public class Contest{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private String nome;
    private String descrizione;
    private Date dataInizio;
    private Date dataFine;
    private String tipo;
    private String regole;
    @ManyToMany
    private List<Contenunto> contenuti;
    @ManyToOne
    private Contenunto contenutoVincitore;
    @ManyToOne
    private Comune comune;
    @ManyToOne
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
