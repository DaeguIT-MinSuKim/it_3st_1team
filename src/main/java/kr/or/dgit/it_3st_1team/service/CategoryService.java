package kr.or.dgit.it_3st_1team.service;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.it_3st_1team.dto.Category;
import kr.or.dgit.it_3st_1team.util.MyBatisSqlSessionFactory;

public class CategoryService {
	private static final Log log = LogFactory.getLog(CategoryService.class);
	private static String namespace ="kr.or.dgit.it_3st_1team.dao.CategoryDao.";
	
	public List<Category> selectCategoryBig() {
		log.debug("selectCategoryBig()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectList(namespace + "selectCategoryBig");
		}
	}
	
	public List<Category> selectCategoryMid(Category category) {
		log.debug("selectCategoryMid()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectList(namespace + "selectCategoryMid", category);
		}
	}
	
}
