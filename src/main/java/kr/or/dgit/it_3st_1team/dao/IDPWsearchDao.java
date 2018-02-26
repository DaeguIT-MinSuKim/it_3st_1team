package kr.or.dgit.it_3st_1team.dao;

import kr.or.dgit.it_3st_1team.dto.User;



public interface IDPWsearchDao {
		//select
		User selectIdByName(User user);
		User selectPwByNo(User user);
}
