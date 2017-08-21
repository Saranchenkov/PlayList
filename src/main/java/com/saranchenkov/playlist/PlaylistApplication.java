package com.saranchenkov.playlist;

import com.saranchenkov.playlist.model.Album;
import com.saranchenkov.playlist.repository.AlbumRepository;
import com.saranchenkov.playlist.repository.ArtistRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class PlaylistApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlaylistApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext context, ArtistRepository artistRepository, AlbumRepository albumRepository){
		return args -> {
			System.out.println("\n________FIND ALBUMS_______\n");
			List<Album> albums = albumRepository.findAlbumsWithSongs("Sum 41");
			System.out.println("\n________ALBUMS_______\n");

			albums.forEach(System.out::println);
		};
	}
}
