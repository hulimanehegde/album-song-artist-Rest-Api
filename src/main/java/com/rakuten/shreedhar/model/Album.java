package com.rakuten.shreedhar.model;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

@Table
public class Album {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@Column(name = "albumname")
	String albumName;

	@Column(name = "releasedate")
	String releaseDate;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "album_id")
	List<Song> songs = new ArrayList<Song>();

	public Long getAlbumId() {
		return id;
	}

	public void setAlbumId(long i) {
		this.id = i;
	}

	
	public List<Song> getSongs() {
		return songs;
	}

	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}


	@OneToMany(cascade = CascadeType.ALL)	
	@JoinColumn(name = "album_id")
	List<Artist> artists;

	public List<Artist> getArtists() {
		return artists;
	}

	public void setArtists(List<Artist> artists) {
		this.artists = artists;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Override
	public String toString() {
		return "Album [id=" + id + ", albumName=" + albumName + ", releaseDate=" + releaseDate + ", songs=" + songs
				+ ", artists=" + artists + "]";
	}

}
