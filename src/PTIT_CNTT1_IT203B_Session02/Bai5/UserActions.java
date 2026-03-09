package PTIT_CNTT1_IT203B_Session02.Bai5;

public interface UserActions {
    default void logActivity(String activity){
        System.out.println("Activity: " + activity);
    }
}

// xung đột Diamond Problem - phương thức mặc định
// để mã nguồn có thể biên dịch
// bắt buộc override trong class và chọn interface sẽ dùng