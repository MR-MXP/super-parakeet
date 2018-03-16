package biz;

import entity.User;
public class UserBiz {
    User[] users;

    public User[] getUsers() {
        return users;
    }

    public UserBiz() {
        init();
    }

    public void init() {
        users = new User[50];
    }

    public void addUser(User user) {
        for (int i = 0; i < users.length; i++) {
            if (null == users[i]) {
                users[i] = user;
                break;
            }
        }
    }

    public void delUser(String idCard) {
        for (int i = 0; i < users.length; i++) {
            if (null != users[i] && idCard.equals(users[i].getIdCard())) {
                users[i] = null;
                clear();
                break;
            }
        }
    }

    public boolean modifyUser(User user) {
        for (int i = 0; i < users.length; i++) {
            if (null != users[i] && user.getIdCard().equals(users[i].getIdCard())) {
                users[i] = user;
                return true;
            }
        }
        return false;
    }

    public User findUser(String name) {
        for (int i = 0; i < users.length; i++) {
            if (null != users[i] && name.equals(users[i].getName())) {
                return users[i];
            }
        }
        return null;
    }
    
    public void clear() {
        for (int i = 0; i < users.length - 1; i++) {
            if (null == users[i]) {
                users[i] = users[i + 1];
                users[i + 1] = null;
            }
        }
    }

}
