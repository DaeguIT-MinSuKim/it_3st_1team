package it_3st_1team.ui.service;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import it_3st_1team.main.util.MyBatisSqlSessionFactory;
import kr.or.dgit.it_3st_1team.dao.EmployeeDao;
import kr.or.dgit.it_3st_1team.dto.Employee;





public class EmployeeService {
	private static final Log log = LogFactory.getLog(EmployeeService.class);

	public Employee findSelectEmployeeIdByNo(Employee employee) {
		log.debug("selectEmployeeIdByNo()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			EmployeeDao employeeDao = sqlSession.getMapper(EmployeeDao.class);
			return employeeDao.selectEmployeeIdByNo(employee);
		}
	}
	
	public Employee findSelectEmployeePwByNo(Employee employee) {
		log.debug("selectEmployeePwByNo()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			EmployeeDao employeeDao = sqlSession.getMapper(EmployeeDao.class);
			return employeeDao.selectEmployeePwByNo(employee);
		}
	}
	
}
