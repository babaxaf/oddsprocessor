package com.importdata.jsondb.repository;

import com.importdata.jsondb.domain.Match;
import org.springframework.data.repository.CrudRepository;

public interface MatchRepository extends CrudRepository<Match, Long> {
}
