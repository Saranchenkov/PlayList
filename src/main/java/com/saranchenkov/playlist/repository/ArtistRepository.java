package com.saranchenkov.playlist.repository;

import com.saranchenkov.playlist.model.Artist;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.stream.Stream;

/**
 * Created by Ivan on 20.08.2017.
 */
public interface ArtistRepository extends JpaRepository<Artist, Integer> {

    @EntityGraph(attributePaths = {Artist.ALBUMS})
    @Query("select distinct artist from Artist artist")
    Stream<Artist> findArtistsWithAlbums();

    @EntityGraph(attributePaths = {Artist.ALBUMS})
    @Query("select artist from Artist artist where artist.name = :name")
    Artist findArtistWithAlbums(@Param("name") String name);

    Artist findByName(String name);

}
