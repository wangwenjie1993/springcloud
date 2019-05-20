package com.springcloud;

import com.alibaba.fastjson.JSON;
import com.springcloud.domain.User;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringCloudStreamClientApplicationTests {

	@Test
	public void contextLoads() {
		User user = new User();
		user.setId(1);
		user.setUsername("test");
		String s = JSON.toJSONString(user);

	}

}
