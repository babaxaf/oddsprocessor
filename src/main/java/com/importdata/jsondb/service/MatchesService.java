package com.importdata.jsondb.service;

import com.importdata.jsondb.domain.Match;
import com.importdata.jsondb.repository.MatchRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchesService {

    private MatchRepository matchRepository;

    public MatchesService(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    public Iterable<Match> list() {
        return matchRepository.findAll();
    }

    public Match save(Match match) {
        return matchRepository.save(match);
    }

    public Iterable<Match> save(List<Match> matches) {
        return matchRepository.saveAll(matches);
    }
}
