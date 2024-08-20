package it.unicam.cs.GeoCultura.Services;

import it.unicam.cs.GeoCultura.Model.Comune;

import java.util.List;

public interface IComuneService {
    /**
     * Crea un nuovo comune
     * @param comune il comune da creare
     * @return il nuoco comune aggiunto al repository
     */
    Comune creaComune(Comune comune);

    /**
     * Ritorna tutti i comuni registrati
     * @return tutti i comuni presenti nel repository
     */
    List<Comune> getAll();
}
