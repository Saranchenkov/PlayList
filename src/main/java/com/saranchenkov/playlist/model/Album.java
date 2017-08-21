package com.saranchenkov.playlist.model;


import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

/**
 * Created by Ivan on 20.08.2017.
 */
@Entity
@Table(name = "albums")
public class Album {
    public static final String SONGS = "songs";
    public static final String ARTIST = "artist";

    @Id
    @GeneratedValue
    @Column(name = "album_id")
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Temporal(value = TemporalType.DATE)
    private Date date;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;
    @OneToMany(mappedBy = "album")
    private Collection<Song> songs;

    public Album(){}

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Collection<Song> getSongs() {
        return songs;
    }

    public void setSongs(Collection<Song> songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", artist=" + artist.getName() +
                '}';
    }
}
