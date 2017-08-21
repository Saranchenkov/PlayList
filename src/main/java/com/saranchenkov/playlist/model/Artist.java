package com.saranchenkov.playlist.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Ivan on 20.08.2017.
 */
@Entity
@Table(name = "artists")
public class Artist {

    public static final String ALBUMS = "albums";

    @Id
    @GeneratedValue
    @Column(name = "artist_id")
    private Integer id;
    @Column(nullable = false)
    private String name;
    private String country;
    @OneToMany(mappedBy = "artist")
    private List<Album> albums = new ArrayList<>();

    public Artist(){}

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Collection<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
