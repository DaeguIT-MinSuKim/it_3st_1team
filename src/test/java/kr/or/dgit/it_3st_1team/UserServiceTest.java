package kr.or.dgit.it_3st_1team;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.it_3st_1team.dto.Phone;
import kr.or.dgit.it_3st_1team.dto.User;
import kr.or.dgit.it_3st_1team.service.UserService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserServiceTest {
	private static UserService service;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		service = new UserService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		service = null;
	}

	/*@Test
	public void test1InsertUser() {
		Calendar newDate = GregorianCalendar.getInstance();
		Phone phone = new Phone();
		phone.setPhone1("010");
		phone.setPhone2("1111");
		phone.setPhone3("2222");
		Post post = new Post();
		post.setSido("대구광역시");
		post.setSigungu("달서구");
		User user = new User(10, "김은정", "eunjeung", "eunjeung", phone, "eunjeung@dgit.or.kr", post , newDate.getTime());
		int res = service.insertUser(user);
		Assert.assertEquals(1, res);
	}*/
	
	/*@Test
	public void test2DeleteUser() {
		int deleteUser = UserService.deleteUser(10);
		Assert.assertSame(1, deleteUser);
	}*/
	
	@Test
	public void test3UpdateUser() {
		User user = new User();
		user.setId("juhyun");
		user.setPw("1234");
		Phone phone = new Phone();
		phone.setPhone1("011");
		phone.setPhone2("1111");
		phone.setPhone3("2222");
		user.setTel(phone);
		
		int result = service.updateUser(user);
		Assert.assertSame(1, result);
	}
	@Test
	public void test4selectAllUser() {
		List<User> listuser = service.selectAllUser();
		Assert.assertNotNull(listuser);
		for(User user: listuser) {
			System.out.println(user);
		}
	}
	
	@Test
	public void test5selectUserById() {
		User user = new User();
		user.setId("sehun");
		
		User selectUser = service.selectUserById(user);
		Assert.assertEquals(user.getId(), selectUser.getId());
		System.out.println(selectUser);
	}
	
	@Test
	public void test7selectIdPw() {
		User user = new User();
		user.setId("sehun");
		user.setPw("sehun");
		
		User selectUser = service.selectIdPw(user);
		Assert.assertEquals(user.getId(), selectUser.getId());
		Assert.assertEquals(user.getPw(), selectUser.getPw());
		System.out.println(selectUser);
	}
	
	@Test
	public void test8selectCode() {
		User user = new User();
		user.setCode("8");
		
		User selecUser = service.selectCode(user);
		Assert.assertNotNull(selecUser);
		System.out.println(selecUser);
	}
}
