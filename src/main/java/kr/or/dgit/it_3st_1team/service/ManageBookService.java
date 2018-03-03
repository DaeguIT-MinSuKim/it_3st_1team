package kr.or.dgit.it_3st_1team.service;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.it_3st_1team.dao.ManageBookDao;
import kr.or.dgit.it_3st_1team.dto.Book;
import kr.or.dgit.it_3st_1team.util.MyBatisSqlSessionFactory;

public class ManageBookService {
	private static final Log log = LogFactory.getLog(ManageBookDao.class);
	private String namespace = "kr.or.dgit.it_3st_1team.dao.ManageBookDao.";
	
	public List<Book> selectBookByAllForResultMapExtendsWithAPI(Book book){
		log.debug("selectBookByAllForResultMapExtendsWithAPI()");
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();){
			return sqlSession.selectList(namespace + "selectBookByAllForResultMapExtendsWithAPI", book);
		}
	}

	public List<Book> selectBookByNameForResultMapExtendsWithAPI(Book book){
		log.debug("selectBookByNameForResultMapExtendsWithAPI()");
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();){
			return sqlSession.selectList(namespace + "selectBookByNameForResultMapExtendsWithAPI", book);
		}
	}

	public List<Book> selectBookByBigCategoryWithAPI(Book book) {
		log.debug("selectBookByBigCategoryWithAPI()");
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();){
			ManageBookDao bookDao = sqlSession.getMapper(ManageBookDao.class);
			return bookDao.selectBookByBigCategoryWithAPI(book);
		}
	}

}
