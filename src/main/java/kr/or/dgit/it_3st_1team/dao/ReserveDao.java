package kr.or.dgit.it_3st_1team.dao;

import java.util.List;

import kr.or.dgit.it_3st_1team.dto.Reserve;


public interface ReserveDao {
	//select
	List<Reserve> selectReserveByCode(Reserve res);	//회원당 예약도서리스트
	List<Reserve> selectAllReserve();	//모든 회원의 예약도서리스트
	
	int selectReserveNum(Reserve res); //예약자수 가져오기
	
	//insert
	int insertReserve(Reserve res);
}
