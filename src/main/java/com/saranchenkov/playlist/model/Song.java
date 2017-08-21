package com.saranchenkov.playlist.model;


import javax.persistence.*;
import java.time.Duration;

/**
 * Created by Ivan on 20.08.2017.
 */

@Entity
@Table(name = "songs")
public class Song {

    public static final String ALBUM = "album";

    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String name;

    private Duration duration;
    @ManyToOne
    @JoinColumn(name = "album_id")
    private Album album;

    public Song(){}

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

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                ", album=" + album.getName() +
                '}';
    }
}
