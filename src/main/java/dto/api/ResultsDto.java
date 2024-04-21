package dto.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.time.LocalDate;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultsDto implements Serializable {
    private String title;
    private int episode_id;
    private String opening_crawl;
    private String director;
    private String producer;
    private LocalDate release_date;
    private String[] characters;
    private String[] planets;
    private String[] starships;
    private String[] vehicles;
    private String[] species;
    private String created;
    private String edited;
    private String url;

    public String getTitle() { return title; }
    public void setTitle(String value) { this.title = value; }

    public long getEpisodeID() { return episode_id; }
    public void setEpisodeID(int value) { this.episode_id = value; }

    public String getOpeningCrawl() { return opening_crawl; }
    public void setOpeningCrawl(String value) { this.opening_crawl = value; }

    public String getDirector() { return director; }
    public void setDirector(String value) { this.director = value; }

    public String getProducer() { return producer; }
    public void setProducer(String value) { this.producer = value; }

    public LocalDate getReleaseDate() { return release_date; }
    public void setReleaseDate(LocalDate value) { this.release_date = value; }

    public String[] getCharacters() { return characters; }
    public void setCharacters(String[] value) { this.characters = value; }

    public String[] getPlanets() { return planets; }
    public void setPlanets(String[] value) { this.planets = value; }

    public String[] getStarships() { return starships; }
    public void setStarships(String[] value) { this.starships = value; }

    public String[] getVehicles() { return vehicles; }
    public void setVehicles(String[] value) { this.vehicles = value; }

    public String[] getSpecies() { return species; }
    public void setSpecies(String[] value) { this.species = value; }

    public String getCreated() { return created; }
    public void setCreated(String value) { this.created = value; }

    public String getEdited() { return edited; }
    public void setEdited(String value) { this.edited = value; }

    public String getURL() { return url; }
    public void setURL(String value) { this.url = value; }
}
