package com.saranchenkov.playlist.repository;

import com.saranchenkov.playlist.model.Album;
import com.saranchenkov.playlist.model.Artist;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Ivan on 20.08.2017.
 */
public interface AlbumRepository extends JpaRepository<Album, Integer> {

    @EntityGraph(attributePaths = {Album.ARTIST, Album.SONGS})
    @Query("select distinct albums from Album albums where albums.artist.name = :name")
    List<Album> findAlbumsWithSongs(@Param("name") String name);

    @EntityGraph(attributePaths = {Album.ARTIST, Album.SONGS})
    @Query("select distinct albums from Album albums where albums.artist = :artist")
    List<Album> findAlbumsWithSongs(@Param("artist")Artist artist);
}
