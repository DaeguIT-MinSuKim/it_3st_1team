package kr.or.dgit.it_3st_1team.dao;

import java.util.List;

import kr.or.dgit.it_3st_1team.dto.Book;
import kr.or.dgit.it_3st_1team.dto.Takeinout;

public interface TakeinoutDao {
	//select all
	List<Book> selectBookWithTakeInoutByAll();
	
	// select by bkcode and code
	Takeinout selectTakeinoutByBkCode(Book book);
	
	List<Takeinout> selectUserForBookByAll(Takeinout inout);
}
