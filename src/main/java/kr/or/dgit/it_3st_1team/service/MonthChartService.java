package kr.or.dgit.it_3st_1team.service;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.it_3st_1team.dto.MonthChart;
import kr.or.dgit.it_3st_1team.util.MyBatisSqlSessionFactory;

public class MonthChartService {
	private static final Log log = LogFactory.getLog(MonthChartService.class);
	private String namespace ="kr.or.dgit.it_3st_1team.dao.MonthChartDao.";

	public MonthChartService() {
		// TODO Auto-generated constructor stub
	}

	public List<MonthChart> selectByAllWithAPI() {
		log.debug("selectByAllWithAPI()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectList(namespace + "selectByAllWithAPI");
		}
	}
	
}
