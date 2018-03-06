package kr.or.dgit.it_3st_1team.dao;

import kr.or.dgit.it_3st_1team.dto.User;



public interface IDPWsearchDao {
		//아이디 찾기
		User selectIdByName(User user);
		
		User selectPwByNo(User user);
		
		//비밀번호 찾기
		User selectIdEmail(User user);
}
