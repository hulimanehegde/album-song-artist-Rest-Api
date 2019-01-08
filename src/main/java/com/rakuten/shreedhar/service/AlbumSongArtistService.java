package com.rakuten.shreedhar.service;

import java.util.List;


import com.rakuten.shreedhar.model.Album;


public interface AlbumSongArtistService {

	//getting all details from the database
	public List<Album> getAlbumDetail();
	public String saveNewAlbum(Album album);
	public String updateAlbum(Album album);
	public String deleteAlbum(Long albumId);
}
