package com.platzi.javatests.movies;

import com.platzi.javatests.movies.model.Genere;

public class Movie {
    private Integer id;
    private String name;
    private int minutes;
    private Genere genere;

    public Movie(String name, int minutes, Genere genere) {
        this(null, name, minutes, genere);
    }

    public Movie(Integer id, String name, int minutes, Genere genere) {
        this.id = id;
        this.name = name;
        this.minutes = minutes;
        this.genere = genere;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }
}
