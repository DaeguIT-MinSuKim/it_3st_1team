package kr.or.dgit.it_3st_1team.service;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.it_3st_1team.dao.EmployeeDao;
import kr.or.dgit.it_3st_1team.dto.Employee;
import kr.or.dgit.it_3st_1team.util.MyBatisSqlSessionFactory;

public class EmployeeService {
	private static final Log log = LogFactory.getLog(EmployeeDao.class);
	private String namespace = "kr.or.dgit.it_3st_1team.dao.EmployeeDao.";
	
	public List<Employee> selectEmployeeByAll(){
		log.debug("selectEmployeeByAll()");
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();){
			return sqlSession.selectList(namespace + "selectEmployeeByAll");
		}
	}
	
	public int insertEmployeeWithAPI(Employee emp){
		log.debug("insertEmployeeWithAPI()");
		int res = -1;
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();){
			res = sqlSession.insert(namespace + "insertEmployeeWithAPI", emp);
			sqlSession.commit();			
		}
		return res;
	}
	// 사원 정보 수정
	public int updateEmployeeWithAPI(Employee emp){
		log.debug("updateEmployeeWithAPI()");
		int res = -1;
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();){
			res = sqlSession.insert(namespace + "updateEmployeeWithAPI", emp);
			sqlSession.commit();		
		}
		return res;
	}
}
