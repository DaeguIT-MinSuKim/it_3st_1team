package kr.or.dgit.it_3st_1team.dao;

import java.util.List;

import kr.or.dgit.it_3st_1team.dto.Request;

public interface RequestDao {
	//insert
	int insertRequest(Request request);
	//delete
	int deleteRequest(Request request);
	//select
	List<Request> selectRequestByCode(Request req);	//회원당 신청도서리스트
	List<Request> selectAllRequest();	//모든 회원의 신청도서리스트
}
