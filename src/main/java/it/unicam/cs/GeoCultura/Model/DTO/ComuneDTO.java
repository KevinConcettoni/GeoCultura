package it.unicam.cs.GeoCultura.Model.DTO;

import it.unicam.cs.GeoCultura.Model.Comune;
import it.unicam.cs.GeoCultura.Model.Posizione;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public class ComuneDTO {

    @NotNull
    private String nome;
    private String descrizione;
    @Nullable
    private Posizione posizione;
    private double area;
    private Date dataFondazione;

    public Comune toComune(){
        return new Comune(this.nome, this.descrizione, this.posizione, this.area, this.dataFondazione);
    }
    public ComuneDTO(){

    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    @Nullable
    public Posizione getPosizione() {
        return posizione;
    }

    public double getArea() {
        return area;
    }

    public Date getDataFondazione() {
        return dataFondazione;
    }
}
