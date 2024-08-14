package it.unicam.cs.GeoCultura.Model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Posizione {
    private float latitudine;
    private float longitudine;
}
