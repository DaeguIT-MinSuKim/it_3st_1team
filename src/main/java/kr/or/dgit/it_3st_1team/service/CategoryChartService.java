package kr.or.dgit.it_3st_1team.service;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.it_3st_1team.dto.CategoryChart;
import kr.or.dgit.it_3st_1team.util.MyBatisSqlSessionFactory;

public class CategoryChartService {
	private static final Log log = LogFactory.getLog(CategoryChartService.class);
	private String namespace ="kr.or.dgit.it_3st_1team.dao.CategoryChartDao.";

	public CategoryChartService() {
		// TODO Auto-generated constructor stub
	}

	public List<CategoryChart> selectCategoryByAllWithAPI() {
		log.debug("selectCategoryByAllWithAPI()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectList(namespace + "selectCategoryByAllWithAPI");
		}
	}
	
}
