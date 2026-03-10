package PTIT_CNTT1_IT203B_Session03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bai4 {
    record User(String username, String email){}

    public static void main(String[] args) {
        List<User> users = List.of(
                new User("alice", "alice@gmail.com"),
                new User("bob", "bob@gmail.com"),
                new User("charlie", "charlie@gmail.com")
        );

        List<User> checkUser = new ArrayList<>(
                users.stream()
                        .collect(Collectors.toMap(User::username, //key
                                user -> user,                // value
                                (user1, user2) -> user1))// trùng thì username trước
                        .values() //lấy tất cả các giá trị của Map
        );
        checkUser.forEach(System.out::println);
    }
}

//Collectors.toMap(): chuyển một Stream (List) thành Map.
//Thu thập các phần tử của Stream và lưu vào một Map<K, V>.
//Cú pháp
//        Collectors.toMap(
//          keyMapper,   - cách lấy key
//          valueMapper  - cách lấy value
//          mergeFunction  - key trùng thì bắt lỗi
//        )
