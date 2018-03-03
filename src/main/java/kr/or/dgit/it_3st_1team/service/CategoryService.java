package kr.or.dgit.it_3st_1team.service;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.it_3st_1team.dao.BookDao;
import kr.or.dgit.it_3st_1team.dao.CategoryDao;
import kr.or.dgit.it_3st_1team.dto.Category;
import kr.or.dgit.it_3st_1team.util.MyBatisSqlSessionFactory;

public class CategoryService {
	private static final Log log = LogFactory.getLog(CategoryDao.class);
	private String namespace= "kr.or.dgit.it_3st_1team.dao.CategoryDao.";
	
	public List<Category> selectBigCategoryByAllWithAPI(){
		log.debug("selectBigCategoryByAllWithAPI()");
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();){
			return sqlSession.selectList(namespace + "selectBigCategoryByAllWithAPI");
		}
	}
	
	public List<Category> selectMidCategoryByAllWithAPI(){
		log.debug("selectMidCategoryByAllWithAPI()");
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();){
			return sqlSession.selectList(namespace + "selectMidCategoryByAllWithAPI");
		}
	}
	
	public List<Category> selectMidCategoryBySelectedWithAPI(Category cate){
		log.debug("selectMidCategoryByAllWithAPI()");
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();){
			CategoryDao cateDao = sqlSession.getMapper(CategoryDao.class);
			return cateDao.selectMidCategoryByAllWithAPI(cate);
		}
	}

	public Category selectCategoryByNameWithAPI(Category cate) {
		log.debug("selectCategoryByNameWithAPI()");
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();){
			CategoryDao cateDao = sqlSession.getMapper(CategoryDao.class);
			return cateDao.selectCategoryByNameWithAPI(cate);
		}
	}

}
