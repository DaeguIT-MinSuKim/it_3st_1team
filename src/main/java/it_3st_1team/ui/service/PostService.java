package it_3st_1team.ui.service;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import it_3st_1team.main.util.MyBatisSqlSessionFactory;
import kr.or.dgit.it_3st_1team.dao.PostDao;
import kr.or.dgit.it_3st_1team.dto.Post;



public class PostService {
	private static final Log log = LogFactory.getLog(PostDao.class);

	public List<Post> selectPostByAll() {
		log.debug("selectPostByAll()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			PostDao postDao = sqlSession.getMapper(PostDao.class);
			return postDao.selectPostByAll();
		}
	}
}
