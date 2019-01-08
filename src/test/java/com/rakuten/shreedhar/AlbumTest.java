package com.rakuten.shreedhar;
/*package com.rakuten.shreedhar;

import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
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
import com.rakuten.shreedhar.controller.AlbumSongArtistController;
import com.rakuten.shreedhar.model.Album;
import com.rakuten.shreedhar.repository.AlbumSongArtistRepository;
import com.rakuten.shreedhar.service.AlbumSongArtistService;*/

/*1.Mocking the required classes
 *2.check conditions
 *	
 *	*Checking each and every function inside controller is working correct or not. 
 *	*Testing getallDetails function.
 *		
 * 
 */

/*@RunWith(SpringRunner.class)

@WebMvcTest(controllers = AlbumSongArtistController.class)

@MockBean(classes = AlbumSongArtistService.class)
public class AlbumControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Mock
	AlbumSongArtistService albumSongArtistService;

	@Mock
	AlbumSongArtistRepository albumSongArtistRepository;

	@Test
	public void controllerTest() throws Exception {

		List<Album> list = albumSongArtistRepository.findAll();

		RequestBuilder request = MockMvcRequestBuilders.get("/albumSong/album").accept(MediaType.APPLICATION_XML)
				.characterEncoding("UTF-8");

		MvcResult result = this.mockMvc.perform(request).andExpect(status().isOk())
				.andExpect(content().contentType("application/xml;charset=UTF-8")).andReturn();

		if (result == null) {

			assertTrue(false);
		}

		if (result == list) {
			assertTrue(true);
		}
		//assertThat(albumSongArtistServiceImpl.updateAlbum(album),is("updated"));
		//assertThat(albumSongArtistServiceImpl.saveNewAlbum(album),is(true));

		

	}
}*/
