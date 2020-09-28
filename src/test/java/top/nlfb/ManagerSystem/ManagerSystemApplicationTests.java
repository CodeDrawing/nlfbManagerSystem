package top.nlfb.ManagerSystem;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.nlfb.ManagerSystem.pojo.User;
import top.nlfb.ManagerSystem.service.IUserService;

import java.util.List;

@SpringBootTest
class ManagerSystemApplicationTests {
	@Autowired
	IUserService iUserService;

	@Test
	void contextLoads() {

	}
	@Test
	void test1(){
		User user = new User();
		user.setUserName("zsan");
		user.setPassword("123");
		List<User> users = iUserService.loginIn(user);
		System.out.println(users);
	}

}
