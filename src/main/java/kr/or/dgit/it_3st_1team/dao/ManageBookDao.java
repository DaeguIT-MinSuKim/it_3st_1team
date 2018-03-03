package kr.or.dgit.it_3st_1team.dao;

import java.util.List;

import kr.or.dgit.it_3st_1team.dto.Book;

public interface ManageBookDao {

	//select
	List<Book> selectBookByAllForResultMapExtendsWithAPI();	// 사원프로그램 자료 관리 전체 검색	
	List<Book> selectBookByBigCategoryWithAPI(Book book);	// 카테고리 API인데..

}
