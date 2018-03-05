package kr.or.dgit.it_3st_1team.dao;

import kr.or.dgit.it_3st_1team.dto.Request;

public interface RequestDao {
	//insert
	int insertRequest(Request request);
	//delete
	int deleteRequest(Request request);
}
