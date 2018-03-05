package kr.or.dgit.it_3st_1team.service;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.it_3st_1team.dao.BookDao;
import kr.or.dgit.it_3st_1team.dto.Book;
import kr.or.dgit.it_3st_1team.util.MyBatisSqlSessionFactory;

public class BookService {
	private static final Log log = LogFactory.getLog(BookDao.class);
	private String namespace = "kr.or.dgit.it_3st_1team.dao.BookDao.";
	private static final BookService instance = new BookService();
	
	private BookService() {
		// TODO Auto-generated constructor stub
	}

	public static BookService getInstance() {
		return instance;
	}

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
	
	public int selectExistNum(String isbn){
		log.debug("selectExistNum()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectOne(namespace + "selectExistNum", isbn);
		}
	}
	
	public List<Book> selectBookDetail(Book book){
		log.debug("selectBookDetail()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectList(namespace + "selectBookDetail", book);
		}
	}
	
	public String selectIsbn(Book book) {
		log.debug("selectIsbn()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectOne(namespace + "selectIsbn", book);
		}
	}
	
	public Book selectByIsbn(String isbn) {
		log.debug("selectByIsbn()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectOne(namespace + "selectByIsbn", isbn);
		}
	}
}
