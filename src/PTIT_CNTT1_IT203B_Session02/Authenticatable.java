package PTIT_CNTT1_IT203B_Session02;

//bài 3

@FunctionalInterface
public interface Authenticatable {

    // tạo phương thức trừu tượng
    String getPassword();

    //ktra pass ko rỗng
    // class con ko cần viết lại logic này
    default boolean isAuthenticated(){
        return getPassword() != null && !getPassword().isEmpty();
    }

    // mô phỏng mã hóa pass
    static String encrypt(String rawPassword){
        return rawPassword;
    }
}
