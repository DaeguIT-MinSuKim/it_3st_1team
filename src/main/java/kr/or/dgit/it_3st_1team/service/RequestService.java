package kr.or.dgit.it_3st_1team.service;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.it_3st_1team.dto.Request;
import kr.or.dgit.it_3st_1team.util.MyBatisSqlSessionFactory;

public class RequestService {
	private static final Log log = LogFactory.getLog(RequestService.class);
	
	private String namespace = "kr.or.dgit.it_3st_1team.dao.RequestDao.";
	
	public int insertRequest(Request request) {
		log.debug("insertRequest()");
		int res = -1;
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			res = sqlSession.insert(namespace + "insertRequest", request);
			sqlSession.commit();
		}
		return res;
	}
	
	public int deleteRequest(Request request) {
		log.debug("deleteRequest()");
		int res = -1;
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			res = sqlSession.insert(namespace + "deleteRequest", request);
			sqlSession.commit();
		}
		return res;
	}
	
	public List<Request> selectRequestByCode(Request req){
		log.debug("selectRequestByCode()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectList(namespace + "selectRequestByCode", req);
		}
	}
	
	public List<Request> selectRequestByCodeIsbn(Request req){
		log.debug("selectRequestByCodeIsbn()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectList(namespace + "selectRequestByCodeIsbn", req);
		}
	}
	
	public List<Request> selectAllRequest(){
		log.debug("selectAllRequest()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectList(namespace + "selectAllRequest");
		}
	}
	
}
