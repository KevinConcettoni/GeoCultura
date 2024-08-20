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
}
