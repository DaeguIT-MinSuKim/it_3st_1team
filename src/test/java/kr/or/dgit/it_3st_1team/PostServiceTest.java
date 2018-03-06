package kr.or.dgit.it_3st_1team;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.it_3st_1team.dto.Post;
import kr.or.dgit.it_3st_1team.service.PostService;


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
	
/*	@Test
	public void test1SelectPostByAll1() {
		Post post = new Post();
		List<Post> listPost = service.selectPostByAll1(post);
		Assert.assertNotNull(listPost);
	}*/
	@Test
	public void test2SelectPostByAll2() {
		Post post = new Post();
		post.setDoro("중앙대로");
		List<Post> listPost = service.selectPostByAll2(post);
		Assert.assertNotNull(listPost);
		for(Post posts : listPost) {
			System.out.println(posts);
		}
	}
	
	@Test
	public void test3SelectPostBunjiWithAPI() {
		Post post = new Post();
		post.setBubjung_name("대명동");
		List<Post> listPost = service.selectDongWithAPI(post);
		Assert.assertNotNull(listPost);
		for(Post posts : listPost) {
			System.out.println(posts);
		}
	}
}
