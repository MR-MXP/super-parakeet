package test;

import java.util.Scanner;

import biz.UserBiz;
import entity.User;

public class UserTest {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        UserBiz userBiz = new UserBiz();
        System.out.println("添加用户：");
        for (int i = 0; i < 3; i++) {
            System.out.println("====请输入第"+(i+1)+"个用户信息====");
            userBiz.addUser(inputUserInfo());
        }
        showAllUser(userBiz.getUsers());
        
        System.out.println("修改用户：");
        userBiz.modifyUser(new User("zhangsan", "男", 25, "13912345678", "123456789012345678", "abc@163.com"));
        showAllUser(userBiz.getUsers());
        
        System.out.println("查找用户：");
        System.out.println("请输入要查找用户的用户名：");
        showUser(userBiz.findUser(input.next()));
        
        System.out.println("删除用户：");
        System.out.print("请输入要删除用户的身份证号：");
        userBiz.delUser(input.next());
        showAllUser(userBiz.getUsers());
    }

    private static User inputUserInfo() {
        User user = new User();
        Scanner input = new Scanner(System.in);
        System.out.print("请输入用户名：");
        user.setName(input.next());
        System.out.print("请输入性别：");
        user.setGender(input.next());
        System.out.print("请输入年龄：");
        user.setAge(input.nextInt());
        System.out.print("请输入电话：");
        user.setPhone(input.next());
        System.out.print("请输入身份证号：");
        user.setIdCard(input.next());
        System.out.print("请输入邮件：");
        user.setEmail(input.next());
        return user;
    }

    public static void showAllUser(User[] users) {
        System.out.println("=========现有用户信息=========");
        for (int i = 0; i < users.length - 1; i++) {
            if (null != users[i]) {
                System.out.print("第" + (i + 1) + "个用户为：");
                System.out.print("用户名：" + users[i].getName());
                System.out.print("；性别：" + users[i].getGender());
                System.out.print("；年龄：" + users[i].getAge());
                System.out.print("；电话：" + users[i].getPhone());
                System.out.print("；身份证号：" + users[i].getIdCard());
                System.out.println("；邮件：" + users[i].getEmail());
            }
        }
    }

    public static void showUser(User user) {
        if (null != user) {
            System.out.print("用户信息为：");
            System.out.print("用户名：" + user.getName());
            System.out.print("；性别：" + user.getGender());
            System.out.print("；年龄：" + user.getAge());
            System.out.print("；电话：" + user.getPhone());
            System.out.print("；身份证号：" + user.getIdCard());
            System.out.println("；邮件：" + user.getEmail());
        } else {
            System.out.println("没有需要显示的用户信息！！！");
        }
    }
}
