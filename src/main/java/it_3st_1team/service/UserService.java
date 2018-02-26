package it_3st_1team.service;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.it_3st_1team.dto.User;
import it_3st_1team.util.MyBatisSqlSessionFactory;

public class UserService {
	private static final Log log = LogFactory.getLog(UserService.class);
	
	private static String namespace = "it_3st_1team.dao.UserDao.";
	
	public int insertUser(User user) {
		log.debug("insertUser()");
		int res = -1;
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			res = sqlSession.insert(namespace + "insertUser", user);
			sqlSession.commit();
		}
		return res;
	}
}
