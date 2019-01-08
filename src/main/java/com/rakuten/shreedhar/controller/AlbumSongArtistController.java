package com.rakuten.shreedhar.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.rakuten.shreedhar.model.Album;
import com.rakuten.shreedhar.service.AlbumSongArtistService;

@RestController
@RequestMapping("/albumSong")

public class AlbumSongArtistController {

	@Autowired
	private AlbumSongArtistService albumSongArtistService;

	
	@RequestMapping(method = RequestMethod.GET, value = "/album")
	public List<Album> getAllDetails() {
		// it is returning list of albums
		return albumSongArtistService.getAlbumDetail();
	}

	/*@RequestMapping(method = RequestMethod.PUT, value = "/update")

	@ResponseBody
	public String update(@RequestBody Album album) throws Exception {

		albumSongArtistService.updateAlbum(album);
		
		return "updated";
	}*/

	@RequestMapping(value = "/{albumId}", method = RequestMethod.DELETE)
	public String deleteAlbum(@PathVariable Long albumId) {

		albumSongArtistService.deleteAlbum(albumId);
		
		return "deleted";

	}

	/*@RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	
	public String createAlbum(@RequestBody final Album album) {

	 albumSongArtistService.saveNewAlbum(album);
	 
	 return "Saved";
		
		
	}*/
	
	

}


