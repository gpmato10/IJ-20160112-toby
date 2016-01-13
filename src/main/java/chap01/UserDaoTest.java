package chap01;

import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao dao = new UserDao();

        User user = new User();

        user.setId("zidan");
        user.setName("지단");
        user.setPassword("11");

        dao.add(user);

        System.out.println(user.getId() + " 아이디 추가 성공");


        System.out.println("--- 밑줄부터 등록한 아이디 조회한다.");
        User user2 = dao.get(user.getId()); // 등록한 아이디 조회하기.
        System.out.println(user2.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());


    }
}
