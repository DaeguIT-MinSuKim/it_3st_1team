package kr.or.dgit.it_3st_1team.dao;

import java.util.List;

import kr.or.dgit.it_3st_1team.dto.Book;

public interface TakeinoutDao {
	//select
	List<Book> selectBookWithTakeInoutByAll();
}