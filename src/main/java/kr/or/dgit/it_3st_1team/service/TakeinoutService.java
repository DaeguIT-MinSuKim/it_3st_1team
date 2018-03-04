package kr.or.dgit.it_3st_1team.service;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.it_3st_1team.dao.BookDao;
import kr.or.dgit.it_3st_1team.dao.TakeinoutDao;
import kr.or.dgit.it_3st_1team.dto.Book;
import kr.or.dgit.it_3st_1team.dto.Takeinout;
import kr.or.dgit.it_3st_1team.util.MyBatisSqlSessionFactory;

public class TakeinoutService {
	private static final Log log = LogFactory.getLog(TakeinoutDao.class);
	private String namespace = "kr.or.dgit.it_3st_1team.dao.TakeinoutDao.";
	
	public List<Book> selectBookByAllForResultMapExtendsWithAPI(){
		log.debug("selectBookByAllForResultMapExtendsWithAPI()");
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();){
			return sqlSession.selectList(namespace + "selectBookByAllForResultMapExtendsWithAPI");
		}
	}

	public List<Book> selectBookByBigCategoryWithAPI(Book book) {
		log.debug("selectBookByBigCategoryWithAPI()");
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();){
			BookDao bookDao = sqlSession.getMapper(BookDao.class);
			return bookDao.selectBookByBigCategoryWithAPI(book);
		}
	}

	public List<Book> selectBookStartAll(){
		log.debug("selectBookStartAll()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectList(namespace + "selectBookStartAll");
		}
	}
	
	public List<Book> selectBookAll(Book book){
		log.debug("selectBookAll()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectList(namespace + "selectBookAll", book);
		}
	}
	
	public Takeinout selectTakeinoutByBkCode(Takeinout inout) {
		log.debug("selectTakeinoutByBkCode()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectOne(namespace + "selectTakeinoutByBkCode", inout);
		}
	}
}
