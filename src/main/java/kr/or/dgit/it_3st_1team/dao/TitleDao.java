package kr.or.dgit.it_3st_1team.dao;

import java.util.List;

import kr.or.dgit.it_3st_1team.dto.Title;

public interface TitleDao {

	//select
	//모든 직책 출력
	List<Title> selectAllTitle();

}
