package it.unicam.cs.GeoCultura.Services;

import it.unicam.cs.GeoCultura.Model.Contest;

public interface IContestService {
    /**
     * Crea un nuovo contest
     * @param contest il nuovo contest da creare
     * @return il nuovo contest salvato nel repository
     */
    Contest creaContest(Contest contest);
}
