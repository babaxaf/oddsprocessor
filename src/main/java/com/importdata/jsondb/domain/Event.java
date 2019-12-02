package com.importdata.jsondb.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
public class Event {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;

    private String home;
    private String away;
    private String start_time;

    public Event() {
    }
}
