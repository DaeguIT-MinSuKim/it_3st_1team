package kr.or.dgit.it_3st_1team.service;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.it_3st_1team.dto.Request;
import kr.or.dgit.it_3st_1team.util.MyBatisSqlSessionFactory;

public class RequestService {
	private static final Log log = LogFactory.getLog(RequestService.class);
	
	private static String namespace = "kr.or.dgit.it_3st_1team.dao.RequestDao.";
	
	public int insertRequest(Request request) {
		log.debug("insertRequest()");
		int res = -1;
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			res = sqlSession.insert(namespace + "insertRequest", request);
			sqlSession.commit();
		}
		return res;
	}
}
