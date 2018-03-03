package kr.or.dgit.it_3st_1team.dao;

import java.util.List;

import kr.or.dgit.it_3st_1team.dto.Category;

public interface CategoryDao {
	//select 대분류
	List<Category> selectBigCategoryByAllWithAPI();
	// select 중분류
	List<Category> selectMidCategoryByAllWithAPI(Category cate);
	// selected 중룬류
	
	// 네임별로 부르기
	Category selectCategoryByNameWithAPI(Category cate);
}
