CREATE TABLE artists (
  artist_id INT AUTO_INCREMENT,
  name VARCHAR(30) NOT NULL,
  country VARCHAR(20) DEFAULT NULL
);

CREATE TABLE albums (
  album_id INT AUTO_INCREMENT,
  name VARCHAR(30) NOT NULL,
  date DATE DEFAULT NULL,
  artist_id INT NOT NULL,
  FOREIGN KEY (artist_id) REFERENCES artists(artist_id) ON DELETE CASCADE
);

CREATE TABLE songs (
  id INT AUTO_INCREMENT,
  name VARCHAR(40) NOT NULL,
  duration BIGINT DEFAULT NULL,
  album_id INT NOT NULL,
  FOREIGN KEY (album_id) REFERENCES albums(album_id) ON DELETE CASCADE,
);