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
	
	// 도서코드에 입력된 값과 대여중인 목록의 값 비교 검색
	public Takeinout selectTakeinoutByBkCode(Takeinout inout) {
		log.debug("selectTakeinoutByBkCode()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectOne(namespace + "selectTakeinoutByBkCode", inout);
		}
	}
	
	// 현재 유저가 대여중인 도서 목록 검색
	public List<Takeinout> selectUserForBookByAll(Takeinout inout){
		log.debug("selectUserForBookByAll()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectList(namespace + "selectUserForBookByAll", inout);
		}
	}
	
	// 현재 도서가 대여중인지 아닌지 검색
	public Takeinout selectMatchingBook(Book inout) {
		log.debug("selectMatchingBook()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectOne(namespace + "selectMatchingBook", inout);
		}
	}
	
	// 대여중이 아닌 도서 insert
	public int insertTakeinoutByBkcode(Takeinout inout) {
		int res = -1;
		log.debug("insertTakeinoutByBkcode()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			res = sqlSession.insert(namespace + "insertTakeinoutByBkcode", inout);
			sqlSession.commit();
		}		
		return res;
	}
	
	public int deleteTakeinoutByBkcode(Takeinout inout) {
		int res = -1;
		log.debug("deleteTakeinoutByBkcode()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			res = sqlSession.delete(namespace + "deleteTakeinoutByBkcode", inout);
			sqlSession.commit();
		}		
		return res;
	}
}
