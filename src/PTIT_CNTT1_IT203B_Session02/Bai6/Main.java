package PTIT_CNTT1_IT203B_Session02.Bai6;

public class Main {
    public static void main(String[] args) {
        UserProcessor processor = UserUtils::convertToUpperCase;
        User user = new User("Nguyen Van A");

        String result = processor.process(user);
        System.out.println(result);
    }
}
