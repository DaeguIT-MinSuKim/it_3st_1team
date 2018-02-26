package kr.or.dgit.it_3st_1team.service;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.it_3st_1team.dto.User;
import kr.or.dgit.it_3st_1team.util.MyBatisSqlSessionFactory;

public class UserService {
	private static final Log log = LogFactory.getLog(UserService.class);
	
	private static String namespace = "kr.or.dgit.it_3st_1team.dao.UserDao.";
	
	public int insertUser(User user) {
		log.debug("insertUser()");
		int res = -1;
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			res = sqlSession.insert(namespace + "insertUser", user);
			sqlSession.commit();
		}
		return res;
	}
	
	public static int deleteUser(int code) {
		log.debug("deleteUser()");
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			int res = sqlSession.delete(namespace + "deleteUser", code);
			sqlSession.commit();
			return res;
		} catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();
			throw new RuntimeException(e.getCause());
		} finally {
			sqlSession.close();
		}
	}
	
	public static int updateUser(User user) {
		log.debug("updateUser()");
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			int res = sqlSession.update(namespace + "updateUser", user);
			sqlSession.commit();
			return res;
		} catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();
			throw new RuntimeException();
		} finally {
			sqlSession.close();
		}
	}
	
	public List<User> selectAllUser() {
		log.debug("selectAllUser()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectList(namespace + "selectAllUser");
		}
	}
	
	public User selectUserById(User user) {
		log.debug("selectUserById()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectOne(namespace + "selectUserById", user);
		}
	}
}
