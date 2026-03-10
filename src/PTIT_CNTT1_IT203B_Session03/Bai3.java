package PTIT_CNTT1_IT203B_Session03;

import java.util.List;
import java.util.Optional;

record User(String username, String email){}

class UserRepository{
    static List<User> users = List.of(
            new User("alice", "alice@gmail.com"),
            new User("bob", "bob@gmail.com"),
            new User("charlie", "charlie@gmail.com")
    );

    Optional<User> findUserbyUsername(String username){
        return users.stream()
                .filter(user -> user.username().equals(username))
                //lấy user trong danh sách, ktra xem username của user đó có bằng username cần tìm hay không
                .findFirst();  //lấy phần tử đầu tiên trong Stream
    }
}
public class Bai3 {
    public static void main(String[] args) {
        UserRepository repository = new UserRepository();

        Optional<User> userOptional = repository.findUserbyUsername("alice");
        userOptional.ifPresent(user -> System.out.println("Welcome " + user.username()));

        System.out.println(userOptional.map(u -> "").orElse("Guest login"));
    }
}
//map : Nhận vào một phần tử → trả về một phần tử mới