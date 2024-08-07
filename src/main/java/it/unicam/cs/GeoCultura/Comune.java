package it.unicam.cs.GeoCultura;

import java.util.Date;

public class Comune {

    private int ID;
    private String nome;
    private String descrizione;
    private Coordinate cordinate;
    private double area;
    private Date dataFondazione;

    public Comune(String nome, String descrizione, Coordinate cordinate, double area, Date dataFondazione) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.cordinate = cordinate;
        this.area = area;
        this.dataFondazione = dataFondazione;
    }
}
