package com.myprivate.myapi;

import com.myprivate.myapi.jdpush.Jdpush;
import com.myprivate.myapi.test.PersonServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyApiApplicationTests {

	@Autowired
	private PersonServiceImpl service;

	/*@Test
	public void contextLoads() {
		service.test1(new Person());

	}*/

	private static final String appKey = "92fcb2f359cb9f26df03d9a8";
	private static final String masterSecret = "095ea2121b4d8b13594fa047";
	@Test
	public void test2(){
		Jdpush.testSendPush(appKey, masterSecret);
		System.out.println("sucess");
	}

}
