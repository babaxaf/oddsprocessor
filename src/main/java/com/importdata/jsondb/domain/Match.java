package com.importdata.jsondb.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
public class Match {

    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO )
    private Long id;

    @OneToOne(cascade = {CascadeType.ALL})
    private Sport sport;

    @OneToOne(cascade = {CascadeType.ALL})
    private League league;

    @OneToOne(cascade = {CascadeType.ALL})
    private Event event;

    public Match() { }


}
