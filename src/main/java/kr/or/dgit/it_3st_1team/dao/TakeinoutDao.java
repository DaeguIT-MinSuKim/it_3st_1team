package kr.or.dgit.it_3st_1team.dao;

import java.util.List;

import kr.or.dgit.it_3st_1team.dto.Book;
import kr.or.dgit.it_3st_1team.dto.Takeinout;

public interface TakeinoutDao {
	//select all
	List<Book> selectBookWithTakeInoutByAll();
	
	// select by bkcode and code
	Takeinout selectTakeinoutByBkCode(Book book);
	
	// 현재 유저가 대여중인 도서 목록 검색
	List<Takeinout> selectUserForBookByAll(Takeinout inout);
	
	// 대여중이 아닌 도서 대여
	int insertTakeinoutByBkcode(Takeinout inout);
	
	// 대여중인 도서 반납
	int deleteTakeinoutByBkcode(Takeinout inout);
	
	// 비치수 찾기
	int selectOutNum(String isbn);
}
