package dao;

import model.Login;
import model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        User ul = new User("quynhnhu","quynhnhu2809","phamquynhnhu","quynhnhuctcn@gmal.com",20);
        User ul1 = new User("nguyenga","nga123","nguyenthinga","nga123@gmal.com",21);
        User ul2 = new User("thuylinh","thuylinh1809","phamthuylinh","thuylinh@gmal.com",17);
        users.add(ul);
        users.add(ul1);
        users.add(ul2);
        System.out.println("users la" + users);
    }

    public static User checkLogin(Login login)
    {
        for (User u:users) {
            if (u.getTaikhoan().equals(login.getTaikhoan()) && u.getMatkhau().equals(login.getMatkhau())) {
                System.out.println("taikhoa" + u.getTaikhoan() + "mk " + u.getMatkhau());
                return u;

            }
        }
        return null;
    }
}
