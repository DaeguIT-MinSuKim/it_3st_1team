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
	
	// 대여중인 도서 목록
	public List<Book> selectBookForTakeinoutWithAPI(Book book){
		log.debug("selectBookForTakeinoutWithAPI()");
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();){
			return sqlSession.selectList(namespace + "selectBookForTakeinoutWithAPI", book);
		}
	}

	// 도서 추가
	public int insertBookWithAPI(Book book) {
		log.debug("insertBookWithAPI()");
		int res = -1;
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			res = sqlSession.insert(namespace + "insertBookWithAPI", book);
			sqlSession.commit();
			return res;
		}
	}
	
	// 도서 삭제
	public int deleteBookWithAPI(Book book) {
		log.debug("deleteBookWithAPI()");
		int res = -1;
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			res = sqlSession.delete(namespace + "deleteBookWithAPI", book);
			sqlSession.commit();
			return res;
		}
	}

}
