package kr.or.dgit.it_3st_1team.service;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.it_3st_1team.dto.Location;
import kr.or.dgit.it_3st_1team.util.MyBatisSqlSessionFactory;

public class LocationService {
	private static final Log log = LogFactory.getLog(LocationService.class);
	private String namespace ="kr.or.dgit.it_3st_1team.dao.LocationDao.";
	private static final LocationService instance = new LocationService();
	
	public static LocationService getInstance() {
		return instance;
	}

	private LocationService() {
		// TODO Auto-generated constructor stub
	}

	public String selectSectionBynum(Location loca) {
		log.debug("selectSectionBynum()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectOne(namespace + "selectSectionBynum", loca);
		}
	}
	
}
