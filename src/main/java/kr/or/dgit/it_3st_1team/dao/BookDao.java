package kr.or.dgit.it_3st_1team.dao;

import java.util.List;

import kr.or.dgit.it_3st_1team.dto.Book;

public interface BookDao {
	//select
	List<Book> selectBookByAllForResultMapExtendsWithAPI();
	
	List<Book> selectBookByBigCategoryWithAPI(Book book);
}
