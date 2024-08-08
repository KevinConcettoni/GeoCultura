package it.unicam.cs.GeoCultura.Model;

import java.util.Date;

public class Comune {
    private int ID;
    private String nome;
    private String descrizione;
    private Posizione posizione;
    private double area;
    private Date dataFondazione;

    public Comune(String nome, String descrizione, Posizione posizione, double area, Date dataFondazione) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.posizione = posizione;
        this.area = area;
        this.dataFondazione = dataFondazione;
    }
}
