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
	List<User> selectAllUser();
	User selectUserById(User user);
}
