package it.unicam.cs.GeoCultura.Services;

import it.unicam.cs.GeoCultura.Model.Utente;

import java.util.List;

public interface IUtenteService {
    Utente creaUtente(Utente utente);
    List<Utente> listaUtenti();
    Utente getUtente(int id);
}
