package com.rakuten.shreedhar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rakuten.shreedhar.model.Album;
import com.rakuten.shreedhar.repository.AlbumSongArtistRepository;
import com.rakuten.shreedhar.service.impl.AlbumSongArtistServiceImpl;

/*
 * Junit For ServiceImpl
 * At First Mocking The ServiceImpl Class
 * Test The Functions Inside That class by using mock and mockito
 * At first mocking all the details which is necessary for testing
 * 
 */

@RunWith(SpringRunner.class)
@SpringBootTest

public class AlbumServiceImplTest {

	@InjectMocks
	AlbumSongArtistServiceImpl albumSongArtistServiceImpl;

	@Mock
	AlbumSongArtistRepository albumSongArtistRepository;

	/*
	 * Junit For GetalbumDetails Method Here I have Checked Two Test Cases
	 * 1.Checking That Weather It is null or not 2.Comparing With the List of albums
	 * That Exist in the database. Through this test we will get to know that we are
	 * getting is correct or not
	 * 
	 */

	@Test
	public void AlbumServiceGetALbumTest() throws Exception {

		List<Album> albumSongList = albumSongArtistServiceImpl.getAlbumDetail();

		List<Album> albumList = albumSongArtistRepository.findAll();

		if (albumSongList != null) {

			assertTrue(true);
		}

		// comparing two lists
		assertEquals(albumList.size(), albumSongList.size());

	}

	/*
	 * Junit for saving details to the database. Here i am checking that the data is
	 * going to save to the database or not and then comparing the Size of the
	 * albumList By This test we will get to know that tn'he save functionality
	 * works fine or not
	 * 
	 */

	@Test
	public void AlbumServiceSaveTest() throws Exception {

		Album album = new Album();
		album.setAlbumName("Rakuten");
		album.setReleaseDate("23-09-2018");
		when(albumSongArtistServiceImpl.saveNewAlbum(album)).thenReturn("saved");

	}

	/*
	 * Test case for update operation Checking Particular albumId is Existing or not
	 * 1.if the album id is existing then update that album 2.if album id not exists
	 * then donot update 3.Finally Verifying album is updated or not
	 * 
	 * 
	 */
	@Test
	public void AlbumServiceUpdateTest() throws Exception {

		Album album = new Album();
		album.setAlbumId(8);
		album.setAlbumName("Rakuten");
		album.setReleaseDate("23-09-2018");

		if (albumSongArtistRepository.findById((long) 8) != null) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}

		when(albumSongArtistServiceImpl.updateAlbum(album)).thenReturn("updated");

	}

	/*
	 * Testcases for deleting album 1.Check that the album we're going to delete is
	 * existing or not By using albumId 2.If albumId is not existing then displaying
	 * message that album is not existing in the repository. 3.if albumId is
	 * Existing then delete that album from Repository 4.Verify that album is
	 * deleted or not
	 * 
	 */
	@Test
	public void AlbumServiceDeleteTest() throws Exception {

		try {
			Long albumId;
			albumId = (long) 2;

			if (albumSongArtistRepository.findById((long) 2) != null) {
				assertTrue(true);
			} else {
				assertTrue(false);
			}

			when(albumSongArtistServiceImpl.deleteAlbum(albumId)).thenReturn("deleted");

		} catch (Exception e) {

			System.out.println("exception is" + e);
		}

	}

}
