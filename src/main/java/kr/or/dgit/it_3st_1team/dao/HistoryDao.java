package kr.or.dgit.it_3st_1team.dao;

import java.util.List;

import kr.or.dgit.it_3st_1team.dto.History;

public interface HistoryDao {
	//select
	List<History> selectAllhistory(History his);	//모두보기
	List<History> selectOuthistory(History his);	//대여중
	List<History> selectInhistory(History his);	//반납
	
	List<History> selectAllInhistory();	// 반납된 모든 도서 목록
}
