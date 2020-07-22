package com.galvanize.endpoint_checkpoint;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public class Movie {
    private String title;
    private int minutes;
    private String genre;
    private double rating;
    @JsonProperty("Rating")
    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    private int metascore;
    private String description;
    private int votes;
    private double gross;
    private String year;
    private List<Credit> credit;
    @JsonProperty("Title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @JsonProperty("Minutes")
    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    @JsonProperty("Genre")
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    @JsonProperty("Metascore")
    public int getMetascore() {
        return metascore;
    }

    public void setMetascore(int metascore) {
        this.metascore = metascore;
    }
    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @JsonProperty("Votes")
    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }
    @JsonProperty("Gross")
    public double getGross() {
        return gross;
    }

    public void setGross(double gross) {
        this.gross = gross;
    }
    @JsonProperty("Year")
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    @JsonProperty("Credits")
    public List<Credit> getCredit() {
        return credit;
    }

    public void setCredit(List<Credit> credit) {
        this.credit = credit;
    }

}
