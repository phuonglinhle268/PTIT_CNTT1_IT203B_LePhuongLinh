package PTIT_CNTT1_IT203B_Session03;

import java.util.List;

public class Bai2 {
    record User(String username, String email){}

     public static void main(String[] args) {
        List<User> users = List.of(
                new User("alice", "alice@gmail.com"),
                new User("bob", "bob@gmail.com"),
                new User("charlie", "charlie@gmail.com")
        );
        users.stream()
                .filter(user -> user.email().endsWith("gmail.com")) //lọc email có @gmail.com
                .map(User::username ) // chỉ lấy username
                .forEach(System.out::println);
    }
}
