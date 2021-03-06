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

	public List<Reserve> selectReserveByCode(Reserve res) {
		log.debug("selectReserveByCode()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectList(namespace + "selectReserveByCode", res);
		}
	}

	public List<Reserve> selectAllReserve() {
		log.debug("selectAllReserve()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectList(namespace + "selectAllReserve");
		}
	}

	public List<Reserve> selectalreadyReserve(Reserve res) {
		log.debug("selectalreadyReserve()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectList(namespace + "selectalreadyReserve", res);
		}
	}

	public int selectReserveNum(Reserve res) {
		log.debug("selectReserveNum()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectOne(namespace + "selectReserveNum", res);
		}
	}

	public int insertReserve(Reserve res) {
		log.debug("insertReserve()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			int num = sqlSession.insert(namespace + "insertReserve", res);
			sqlSession.commit();
			return num;
		}
	}

	// 예약 도서 검색
	public List<Reserve> selectReserveBookByBkCode(Reserve res) {
		log.debug("selectReserveBookByBkCode()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectList(namespace + "selectReserveBookByBkCode", res);
		}
	}

	// 예약 도서 대여 후 삭제
	public int deleteReserveBookWithAPI(Reserve res) {
		log.debug("deleteReserveBookWithAPI()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			int num = sqlSession.delete(namespace + "deleteReserveBookWithAPI", res);
			sqlSession.commit();
			return num;
		}
	}

	// 예약 도서 분류별 검색
	public List<Reserve> selectCategoryByReserve(Reserve res) {
		log.debug("selectCategoryByReserve()");
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();) {
			return sqlSession.selectList(namespace + "selectCategoryByReserve", res);
		}
	}

}
