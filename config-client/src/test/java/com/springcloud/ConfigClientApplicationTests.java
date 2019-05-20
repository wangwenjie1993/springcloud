package com.springcloud;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigClientApplicationTests {

	@Value("${user.dir}")
	private String userDir;

	@Test
	public void contextLoads() throws IOException {
		String filePath = userDir + "/src/main/resources/static/test.xlsx";
		File file = new File(filePath);
		file.createNewFile();
		System.out.print("////////////////////////////////"+filePath);
	}

}
