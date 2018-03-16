package test;

import java.util.Scanner;

import biz.UserBiz;
import entity.User;

public class UserTest {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        UserBiz userBiz = new UserBiz();
        System.out.println("����û���");
        for (int i = 0; i < 3; i++) {
            System.out.println("====�������"+(i+1)+"���û���Ϣ====");
            userBiz.addUser(inputUserInfo());
        }
        showAllUser(userBiz.getUsers());
        
        System.out.println("�޸��û���");
        userBiz.modifyUser(new User("zhangsan", "��", 25, "13912345678", "123456789012345678", "abc@163.com"));
        showAllUser(userBiz.getUsers());
        
        System.out.println("�����û���");
        System.out.println("������Ҫ�����û����û�����");
        showUser(userBiz.findUser(input.next()));
        
        System.out.println("ɾ���û���");
        System.out.print("������Ҫɾ���û������֤�ţ�");
        userBiz.delUser(input.next());
        showAllUser(userBiz.getUsers());
    }

    private static User inputUserInfo() {
        User user = new User();
        Scanner input = new Scanner(System.in);
        System.out.print("�������û�����");
        user.setName(input.next());
        System.out.print("�������Ա�");
        user.setGender(input.next());
        System.out.print("���������䣺");
        user.setAge(input.nextInt());
        System.out.print("������绰��");
        user.setPhone(input.next());
        System.out.print("���������֤�ţ�");
        user.setIdCard(input.next());
        System.out.print("�������ʼ���");
        user.setEmail(input.next());
        return user;
    }

    public static void showAllUser(User[] users) {
        System.out.println("=========�����û���Ϣ=========");
        for (int i = 0; i < users.length - 1; i++) {
            if (null != users[i]) {
                System.out.print("��" + (i + 1) + "���û�Ϊ��");
                System.out.print("�û�����" + users[i].getName());
                System.out.print("���Ա�" + users[i].getGender());
                System.out.print("�����䣺" + users[i].getAge());
                System.out.print("���绰��" + users[i].getPhone());
                System.out.print("�����֤�ţ�" + users[i].getIdCard());
                System.out.println("���ʼ���" + users[i].getEmail());
            }
        }
    }

    public static void showUser(User user) {
        if (null != user) {
            System.out.print("�û���ϢΪ��");
            System.out.print("�û�����" + user.getName());
            System.out.print("���Ա�" + user.getGender());
            System.out.print("�����䣺" + user.getAge());
            System.out.print("���绰��" + user.getPhone());
            System.out.print("�����֤�ţ�" + user.getIdCard());
            System.out.println("���ʼ���" + user.getEmail());
        } else {
            System.out.println("û����Ҫ��ʾ���û���Ϣ������");
        }
    }
}
