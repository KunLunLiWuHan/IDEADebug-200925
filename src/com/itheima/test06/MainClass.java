package com.itheima.test06;

/**
 * 计算表达式
 */
public class MainClass {
	public static void main(String[] args) {
		User user = new User("张三", "123456", "超级管理员");
		login(user);
	}

	private static void login(User user) {
		String userType = user.getUserType();
		switch (userType) {
			case "超级管理员":
				System.out.println("超级管理员业务逻辑");
				break;
			case "董事长":
				System.out.println("董事长业务逻辑");
				break;
			case "经理":
				System.out.println("经理业务逻辑");
				break;
			case "员工":
				System.out.println("进入员工业务逻辑");
				break;
			default:
				System.out.println("角色不存在");
				break;

		}
	}
}

