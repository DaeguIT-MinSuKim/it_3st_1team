package kr.or.dgit.it_3st_1team;

<<<<<<< HEAD
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.it_3st_1team.dto.Category;
import kr.or.dgit.it_3st_1team.service.CategoryService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CategoryServiceTest {
	private static CategoryService service;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		service = new CategoryService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		service = null;
	}

	@Test
	public void test1SelectBigCategoryByAll() {
		List<Category> list = service.selectBigCategoryByAllWithAPI();
		Assert.assertNotNull(list);
	}
/*	
	@Test
	public void test2SelectMidCategoryByAll() {
		List<Category> list = service.selectMidCategoryByAllWithAPI();
		Assert.assertNotNull(list);
	}*/
	
	@Test
	public void test3SelectCategoryByName() {
		Category cate = new Category();
		cate.setCatename("철학");
		Category findCate = service.selectCategoryByNameWithAPI(cate);
		Assert.assertNotNull(findCate);
	}
	
=======
import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.it_3st_1team.dto.Category;
import kr.or.dgit.it_3st_1team.dto.User;
import kr.or.dgit.it_3st_1team.service.CategoryService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CategoryServiceTest {
	private static CategoryService service;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		service = new CategoryService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		service = null;
	}

	@Test
	public void test1selectCategoryBig() {
		List<Category> listcate = service.selectCategoryBig();
		Assert.assertNotNull(listcate);
		for(Category cate: listcate) {
			System.out.println(cate);
		}
	}

	@Test
	public void test2selectCategoryMid() {
		Category category = new Category();
		category.setParentnum(3);
		List<Category> listcate = service.selectCategoryMid(category);
		Assert.assertNotNull(listcate);
		for(Category cate: listcate) {
			System.out.println(cate);
		}
	}
>>>>>>> refs/remotes/origin/master
}
