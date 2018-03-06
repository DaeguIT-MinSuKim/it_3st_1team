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
	List<Book> selectIsbn(Book book); //상세도서보기를 위한 isbn 찾기
	Book selectByIsbn(String isbn); //isbn으로 도서찾기 -> 결과 상세도서보기에 넣음
	
	int selectExistNum(String isbn); //보유수 찾기
}
