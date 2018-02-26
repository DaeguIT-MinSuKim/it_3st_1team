package it_3st_1team.ui.service;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import it_3st_1team.main.util.MyBatisSqlSessionFactory;
import kr.or.dgit.it_3st_1team.dao.IDPWsearchDao;
import kr.or.dgit.it_3st_1team.dto.User;

public class IDPWsearchService {
	private static final Log log = LogFactory.getLog(IDPWsearchDao.class);

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
}
