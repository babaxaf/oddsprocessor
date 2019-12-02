package com.importdata.jsondb;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.importdata.jsondb.domain.Match;
import com.importdata.jsondb.service.MatchesService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class JsondbApplication {

    public static void main(String[] args) {
        SpringApplication.run(JsondbApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(MatchesService oddsService) {
        return args -> {
            ObjectMapper mapper = new ObjectMapper();
            TypeReference<List<Match>> typeReference = new TypeReference<List<Match>>() {};
            InputStream inputStream = TypeReference.class.getResourceAsStream("/json/matches.json");
            try {
                List<Match> matches = mapper.readValue(inputStream, typeReference);
                oddsService.save(matches);
                System.out.println("Matches Saved!");
            } catch (IOException e) {
                System.out.println("Unable to save matches: " + e.getMessage());
            }
        };
    }
}
