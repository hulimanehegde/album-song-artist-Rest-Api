package com.rakuten.shreedhar.model;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "artist")
public class Artist {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long artistId;
	
//	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name = "album_id")
//	private Album album;


//	public void setAlbum(Album album) {
//		this.album = album;
//	}

	public String getArtistType() {
		return artistType;
	}

	public void setArtistType(String artistType) {
		this.artistType = artistType;
	}

	@Column(name = "artistname")
	public String artistName;

	@Column(name = "artisttype")
	public String artistType;

	public Long getArtistId() {
		return artistId;
	}

	public void setArtistId(Long artistId) {
		this.artistId = artistId;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getType() {
		return artistType;
	}

	public void setType(String type) {
		this.artistType = type;
	}
}
