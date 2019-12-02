package com.importdata.jsondb.controller;

import com.importdata.jsondb.domain.Match;
import com.importdata.jsondb.service.MatchesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/odds/v1")
public class MatchesController {

    private MatchesService matchesService;

    public MatchesController(MatchesService matchesService) {
        this.matchesService = matchesService;
    }

    @GetMapping("/list")
    public Iterable<Match> list() {
        return matchesService.list();
    }
}
