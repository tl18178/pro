package net.wly.pro.quartz.task;

import org.springframework.stereotype.Component;

/**
 * 测试任务
 *
 */
@Component("testTask")
public class TestTask {

	/**
	 * 测试方法
	 */
	public void test() {
		System.out.println("current timestapmp is : " + System.currentTimeMillis());
	}
	
}
