package PTIT_CNTT1_IT203B_Session01;

import java.io.IOException;

public class Bai4 {
    // method C
    public static void saveToFile() throws IOException{
        System.out.println("Đang lưu dữ liệu vào file...");
        //giả lập lỗi lưu
        throw new IOException("Lỗi ghi file");
    }

    // method B
    public static void processUserData() throws  IOException{
        System.out.println("Đang xử lý dữ liệu người dùng");
        saveToFile();
    }

    // method A
    public static void main(String[] args) {
        try {
            processUserData();
        }
        catch (IOException e){
            System.out.println("Xảy ra lỗi khi lưu dữ liệu");
        }
    }
}
