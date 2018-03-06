package kr.or.dgit.it_3st_1team.service;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.it_3st_1team.dao.IDPWsearchDao;
import kr.or.dgit.it_3st_1team.dto.User;
import kr.or.dgit.it_3st_1team.util.MyBatisSqlSessionFactory;

public class IDPWsearchService {
	private static final Log log = LogFactory.getLog(IDPWsearchDao.class);
	private String namespace = "kr.or.dgit.it_3st_1team.dao.IDPWsearchDao.";

	public User selectIdByName(User user) {
		log.debug("selectIdByName()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			IDPWsearchDao idsearchDao = sqlSession.getMapper(IDPWsearchDao.class);
			return idsearchDao.selectIdByName(user);
		}
	}
	
	public User selectPwByNo(User user) {
		log.debug("selectPwByNo()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			IDPWsearchDao pwsearchDao = sqlSession.getMapper(IDPWsearchDao.class);
			return pwsearchDao.selectPwByNo(user);
		}
	}
	
	// 아이디 찾기
	public User selectNameEmail(User user) {
		log.debug("selectNameEmail()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectOne(namespace + "selectNameEmail", user);
		}
	}

	// 비밀번호 찾기
	public User selectIdEmail(User user) {
		log.debug("selectIdEmail()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectOne(namespace + "selectIdEmail", user);
		}
	}
}
