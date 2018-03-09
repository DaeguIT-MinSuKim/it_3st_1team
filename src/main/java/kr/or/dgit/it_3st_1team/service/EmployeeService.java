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
			res = sqlSession.update(namespace + "updateEmployeeWithAPI", emp);
			sqlSession.commit();
		}
		return res;
	}
	
	// 비밀번호만 사원 변경 
	
	/*public Employee findSelectEmployeeIdByNo(Employee employee) {
		log.debug("selectEmployeeIdByNo()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			EmployeeDao employeeDao = sqlSession.getMapper(EmployeeDao.class);
			return employeeDao.selectEmployeeIdByNo(employee);
		}
	}*/
	
	public Employee selectIdPw(Employee emp) {
		log.debug("selectIdPw()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectOne(namespace + "selectIdPw", emp);
		}
	}
	
	public Employee selectNameEmail(Employee emp) {
		log.debug("selectNameEmail()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectOne(namespace + "selectNameEmail", emp);
		}
	}
	
	// 사원 정보 변경 
	public Employee selectIdEmail(Employee emp) {
		log.debug("selectIdEmail()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectOne(namespace + "selectIdEmail", emp);
		}
	}

	// 비번만 변경용
	public int updatePasswordWithAPI(Employee emp) {
		log.debug("updatePasswordWithAPI()");
		int res = -1;
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();){
			res = sqlSession.update(namespace + "updatePasswordWithAPI", emp);
			sqlSession.commit();
		}
		return res;
	}
	
	// 사원 권한 찾기
		public Employee selectPowerBycode(Employee emp) {
			log.debug("selectPowerBycode()");
			try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
				return sqlSession.selectOne(namespace + "selectPowerBycode", emp);
			}
		}
}
