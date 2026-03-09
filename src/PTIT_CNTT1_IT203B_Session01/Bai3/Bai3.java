package PTIT_CNTT1_IT203B_Session01.Bai3;

public class Bai3 {
    public static void main(String[] args) {
        User user = new User();

        user.setAge(10);
        System.out.println("Tuổi hợp lệ: " + user.getAge());

        user.setAge(-3);  //lỗi exception
    }
}
