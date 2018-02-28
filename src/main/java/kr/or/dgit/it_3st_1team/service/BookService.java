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
	
	private static String namespace = "kr.or.dgit.it_3st_1team.dao.BookDao.";
	
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
	
	
}
