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
	
	public List<Employee> findEmployeeByAll(){
		log.debug("selectEmployeeByAll()");
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();){
			EmployeeDao empDao = sqlSession.getMapper(EmployeeDao.class);
			return empDao.selectEmployeeByAll();
		}
	}
	
}
