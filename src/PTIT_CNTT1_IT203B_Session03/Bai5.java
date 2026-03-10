package PTIT_CNTT1_IT203B_Session03;

import java.util.Comparator;
import java.util.List;

public class Bai5 {
    record User(String username, String email){}

    public static void main(String[] args) {
        List<User> users = List.of(
                new User("alice", "alice@gmail.com"),
                new User("bob", "bob@gmail.com"),
                new User("charlie", "charlie@gmail.com"),
                new User("yuri", "yuri@gmail.com"),
                new User("alexandra", "alexandra@gmail.com")
        );
        users.stream()
                .sorted(Comparator.comparingInt((User user) -> user.username().length()).reversed())
                // đảo ngược để lấy dài nhất trên đầu
                //so sánh dựa trên một giá trị kiểu int (ở đây là độ dài của username).
                .limit(3)
                .forEach(System.out::println);
    }
}
