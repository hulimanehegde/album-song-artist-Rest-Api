package com.rakuten.shreedhar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rakuten.shreedhar.model.Album;

@Repository
public interface AlbumSongArtistRepository extends JpaRepository<Album, Long>{

	  @Query(value = "SELECT * FROM ALBUM WHERE albumname =:albumName", nativeQuery = true)
	  public List<Album> findByAlbumName(@Param(value = "albumName") String albumName);
	
}
