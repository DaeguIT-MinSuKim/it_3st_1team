package kr.or.dgit.it_3st_1team.service;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.it_3st_1team.dao.PostDao;
import kr.or.dgit.it_3st_1team.dto.Post;
import kr.or.dgit.it_3st_1team.util.MyBatisSqlSessionFactory;



public class PostService {
	private static final Log log = LogFactory.getLog(PostDao.class);
	private String namespace = "kr.or.dgit.it_3st_1team.dao.PostDao.";

	public List<Post> selectPostByAll1(Post post) {
		log.debug("selectPostByAll1()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			PostDao postDao = sqlSession.getMapper(PostDao.class);
			return postDao.selectPostByAll1(post);
		}
	}
	
	public List<Post> selectPostByAll2(Post post) {
		log.debug("selectPostByAll2()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			PostDao postDao = sqlSession.getMapper(PostDao.class);
			return postDao.selectPostByAll2(post);
		}
	}
	
	public List<Post> selectDongWithAPI(Post post){
		log.debug("selectDongWithAPI()");
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();){
			return sqlSession.selectList(namespace + "selectDongWithAPI", post);
		}
	}
}
