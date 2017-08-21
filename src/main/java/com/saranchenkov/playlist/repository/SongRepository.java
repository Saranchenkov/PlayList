package com.saranchenkov.playlist.repository;

import com.saranchenkov.playlist.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ivan on 20.08.2017.
 */
public interface SongRepository extends JpaRepository<Song, Integer> {
}
