package kr.or.dgit.it_3st_1team.dao;

import java.util.List;

import kr.or.dgit.it_3st_1team.dto.User;

public interface UserDao {
	//insert
	int insertUser(User user);
	//update
	int updateUser(User user);
	//delete
	int deleteUser(int code);
	
	//select
	//모든 회원 출력
	List<User> selectAllUser();
	//아이디로 회원정보출력
	User selectUserById(User user);	
	//아이디찾기 - 이름, 이메일
	User selectNameEmail(User user);
	//비밀번호찾기 - 아이디, 이메일
	User selectIdEmail(User user);
	//로그인 - 아이디, 비밀번호
	User selectIdPw(User user);
	//회원코드로 회원정보출력
	User selectUserByCode(User user);	
	//회원코드 중복확인
	User selectCode(User user);
}
