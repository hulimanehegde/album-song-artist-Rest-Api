package com.rakuten.shreedhar.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakuten.shreedhar.model.Album;
import com.rakuten.shreedhar.repository.AlbumSongArtistRepository;
import com.rakuten.shreedhar.service.AlbumSongArtistService;

@Service(value="AlbumSongArtistServiceImpl")
public class AlbumSongArtistServiceImpl implements AlbumSongArtistService {

	@Autowired
	AlbumSongArtistRepository albumSongArtistRepository;

	@Override
	public List<Album> getAlbumDetail() {
		
		//return all details of album
		return albumSongArtistRepository.findAll();

		
	}
	@Override
	public String saveNewAlbum(Album album) {
		
	 albumSongArtistRepository.save(album);
		return "saved";
	}
	@Override
	public String updateAlbum(Album album) {
		
		albumSongArtistRepository.save(album);
		return "Saved";
		
	}
	
	@Override
	public String deleteAlbum(Long albumId) {
		
		albumSongArtistRepository.deleteById(albumId);
		return "deleted";
	}

}
