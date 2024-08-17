package it.unicam.cs.GeoCultura.Services;

import it.unicam.cs.GeoCultura.Model.Contest;
import it.unicam.cs.GeoCultura.Repositories.ContestRepository;
import org.springframework.stereotype.Service;
@Service
public class ContestService implements IContestService{

    private final ContestRepository contestRepository;

    public ContestService(ContestRepository contestRepository) {
        this.contestRepository = contestRepository;
    }

    @Override
    public Contest creaContest(Contest contest) {
        return contestRepository.save(contest);
    }
}
