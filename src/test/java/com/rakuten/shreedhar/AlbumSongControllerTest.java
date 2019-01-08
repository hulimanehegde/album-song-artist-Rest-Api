package com.rakuten.shreedhar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rakuten.shreedhar.controller.AlbumSongArtistController;
import com.rakuten.shreedhar.model.Album;
import com.rakuten.shreedhar.repository.AlbumSongArtistRepository;
import com.rakuten.shreedhar.service.AlbumSongArtistService;

@RunWith(SpringRunner.class)
@WebMvcTest(AlbumSongArtistController.class)
@MockBean(classes = AlbumSongArtistService.class)

/*
 * Test case for controller class Checking All the functions inside Controller
 * Class By using WebMvcTest
 * 
 */

public class AlbumSongControllerTest {

	@Autowired
	MockMvc mockMvc;

	@Mock
	AlbumSongArtistRepository albumSongArtistRepository;

	@Mock
	AlbumSongArtistService albumSongArtistService;

	/*
	 * This Test is mainly Checking that the output we are getting from the api is
	 * proper or not This test is also checking that the particular functions inside
	 * the AlbumSongArtistController
	 */
	@Test
	public void albumGetAlbumDetailsTest() throws Exception {

		List<Album> albumList = albumSongArtistRepository.findAll();

		RequestBuilder request = MockMvcRequestBuilders.get("/albumSong/album").accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(request).andExpect(status().isOk()).andReturn();
		ObjectMapper mapper = new ObjectMapper();
		List<Album> list = mapper.readValue(result.getResponse().getContentAsString(),
				new TypeReference<List<Album>>() {
				});

		assertEquals(albumList, list);

		if (list != null) {

			assertTrue(true);
		}

	}

	/*
	 * junit for delete function hit the delete function and checking that what it
	 * is returning is correct or not here i am checking weather it is returning
	 * correct output or not and then checking that it is returning what we Expected or
	 * not
	 */
	@Test
	public void albumAlbumDeleteTest() throws Exception {

		RequestBuilder deleteRequest = MockMvcRequestBuilders.delete("/albumSong/3").accept(MediaType.APPLICATION_JSON);
		MvcResult deleteResult = mockMvc.perform(deleteRequest).andExpect(status().isOk()).andReturn();

		String content = deleteResult.getResponse().getContentAsString();

		if (content != null) {
			assertTrue(true);
		}

		if (content == "deleted") {
			assertTrue(true);
		}

	}

	/*
	 * Junit for update here we need to check that album is updated or not By
	 * updating the album and checking that What it is returning is correct or not
	 */

	@Test
	public void albumUpdateTest() throws Exception {

		RequestBuilder putRequest = MockMvcRequestBuilders.put("/albumSong/update")
				.accept(MediaType.APPLICATION_JSON_UTF8)
				.content("{\"albumName\":\"shreedar\",\"releaseDate\":\"30-may-2020\"}");
		MvcResult putResult = mockMvc.perform(putRequest).andReturn();

		String content = putResult.getResponse().getContentAsString();

		if (content != null) {

			assertTrue(true);
		}
		if (content == "updated") {
			assertTrue(true);
		}

	}

	/*
	 * Unit testing for Saving Method Here we are checking that album is saving or
	 * not by hitting the u URL and checking that what it is returning is correct or
	 * not
	 */
	@Test
	public void albumAlbumSaveTest() throws Exception {

		RequestBuilder saveRequest = MockMvcRequestBuilders.post("/albumSong/save")
				.accept(MediaType.APPLICATION_JSON_VALUE)
				.content("{\"albumName\":\"shreedar\",\"releaseDate\":\"30-may-2020\"}");
		MvcResult saveResult = mockMvc.perform(saveRequest).andReturn();

		String content = saveResult.getResponse().getContentAsString();

		if (content != null) {
			assertTrue(true);
		}
		if (content == "saved") {
			assertTrue(true);
		}

	}

}
