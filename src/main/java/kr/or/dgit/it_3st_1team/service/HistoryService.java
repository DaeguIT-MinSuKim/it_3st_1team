package kr.or.dgit.it_3st_1team.service;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.it_3st_1team.dto.History;
import kr.or.dgit.it_3st_1team.util.MyBatisSqlSessionFactory;

public class HistoryService {
	private static final Log log = LogFactory.getLog(HistoryService.class);
	private String namespace ="kr.or.dgit.it_3st_1team.dao.HistoryDao.";
	private static final HistoryService instance = new HistoryService();
	
	public static HistoryService getInstance() {
		return instance;
	}

	private HistoryService() {
		// TODO Auto-generated constructor stub
	}

	public List<History> selectAllhistory(History his) {
		log.debug("selectAllhistory()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectList(namespace + "selectAllhistory", his);
		}
	}
	
	public List<History> selectOuthistory(History his) {
		log.debug("selectOuthistory()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectList(namespace + "selectOuthistory", his);
		}
	}
	
	public List<History> selectInhistory(History his) {
		log.debug("selectInhistory()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectList(namespace + "selectInhistory", his);
		}
	}
}
