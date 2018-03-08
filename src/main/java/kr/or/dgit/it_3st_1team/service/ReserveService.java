package kr.or.dgit.it_3st_1team.service;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.it_3st_1team.dto.Reserve;
import kr.or.dgit.it_3st_1team.util.MyBatisSqlSessionFactory;

public class ReserveService {
	private static final Log log = LogFactory.getLog(ReserveService.class);
	private String namespace = "kr.or.dgit.it_3st_1team.dao.ReserveDao.";
	private static final ReserveService instance = new ReserveService();
	
	public static ReserveService getInstance() {
		return instance;
	}
	private ReserveService() {
		// TODO Auto-generated constructor stub
	}


	public List<Reserve> selectReserveByCode(Reserve res){
		log.debug("selectReserveByCode()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectList(namespace + "selectReserveByCode", res);
		}
	}
	
	public List<Reserve> selectAllReserve(){
		log.debug("selectAllReserve()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectList(namespace + "selectAllReserve");
		}
	}
	
}
