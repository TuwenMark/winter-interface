package com.winter.winterinterface;


import com.winter.winterapiclientsdk.client.NameClient;
import com.winter.winterapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class WinterInterfaceApplicationTests {
	@Resource
	private NameClient nameClient;

	@Test
	void contextLoads() {
	}

	@Test
	void testNameClient() {
		String test1 = nameClient.getNameByGet("winter1");
		System.out.println(test1);
		String test2 = nameClient.getNameByPost("winter2");
		System.out.println(test2);
		User user = new User();
		user.setUsername("winter3");
		String test3 = nameClient.getNameByPost(user);
		System.out.println(test3);
	}

}
