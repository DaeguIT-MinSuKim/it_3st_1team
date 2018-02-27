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
	
	public List<Book> findBookWithTakeInoutByAll(){
		log.debug("selectBookWithTakeInoutByAll()");
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();){
			BookDao bookDao = sqlSession.getMapper(BookDao.class);
			return bookDao.selectBookWithTakeInoutByAll();
		}
	}
	
	public List<Book> selectStudentByNoAssociation(){
		log.debug("selectStudentByNoAssociation()");
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();){
			BookDao bookDao = sqlSession.getMapper(BookDao.class);
			return bookDao.selectStudentByNoAssociation();
		}
	}
	
}
