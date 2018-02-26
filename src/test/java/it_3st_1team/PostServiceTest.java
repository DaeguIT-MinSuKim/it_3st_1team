package it_3st_1team;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import it_3st_1team.ui.service.PostService;
import kr.or.dgit.it_3st_1team.dto.Post;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PostServiceTest {
	private static PostService service;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		service = new PostService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		service = null;
	}
	
	@Test
	public void test1selectPostByAll() {
		List<Post> listPost = service.selectPostByAll();
		Assert.assertNotNull(listPost);
		for(Post post : listPost) {
			System.out.println(post);
		}
	}
}
