package kr.or.dgit.it_3st_1team.dao;

import java.util.List;

import kr.or.dgit.it_3st_1team.dto.Book;

public interface BookDao {

	//select
	List<Book> selectBookByAllForResultMapExtendsWithAPI();	// 사원프로그램 자료 관리 전체 검색	
	List<Book> selectBookByBigCategoryWithAPI(Book book);	// 카테고리 API인데..
	//select
	List<Book> selectBookStartAll();	//도서검색 창 떴을 때 바로 보이는 책 목록
	List<Book> selectBookAll(Book book); //도서검색에서 일반검색을 할 때
	List<Book> selectBookDetail(Book book);
}
