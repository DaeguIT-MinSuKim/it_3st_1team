package kr.or.dgit.it_3st_1team.dao;

import java.util.List;

import kr.or.dgit.it_3st_1team.dto.Category;

public interface CategoryDao {
	//select
	List<Category> selectBigCategoryByAllWithAPI();
}
