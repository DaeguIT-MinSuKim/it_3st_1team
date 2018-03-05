package kr.or.dgit.it_3st_1team.service;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.it_3st_1team.dto.Title;
import kr.or.dgit.it_3st_1team.util.MyBatisSqlSessionFactory;

public class TitleService {
	private static final Log log = LogFactory.getLog(TitleService.class);
	
	private String namespace = "kr.or.dgit.it_3st_1team.dao.TitleDao.";

	public List<Title> selectAllTitle() {
		log.debug("selectAllTitle()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectList(namespace + "selectAllTitle");
		}
	}
}
