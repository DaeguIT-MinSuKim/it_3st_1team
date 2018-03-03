package kr.or.dgit.it_3st_1team.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;
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
	
	public Map<String, Book> selectBookByMapWithAPI(){
		log.debug("selectBookByMapWithAPI()");
		Map<String, Book> map = new HashMap<>();
        ResultHandler<Book> resultHandler = new ResultHandler<Book>() {
            @Override
            public void handleResult(ResultContext<? extends Book> resultContext) {
            	Book book = resultContext.getResultObject();
                map.put(book.getBkCode(), book);
            }
        };

		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			sqlSession.select(namespace + "selectBookByMapWithAPI", resultHandler);
			return map;
		}
	}

}
