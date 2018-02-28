package kr.or.dgit.it_3st_1team.dao;

import java.util.List;

import kr.or.dgit.it_3st_1team.dto.Post;

public interface PostDao {
	//select
	List<Post> selectPostByAll1(Post post);	
	List<Post> selectPostByAll2(Post post);
	
}
