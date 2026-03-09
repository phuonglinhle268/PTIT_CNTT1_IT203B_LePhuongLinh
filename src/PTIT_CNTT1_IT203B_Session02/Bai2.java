package PTIT_CNTT1_IT203B_Session02;

public class Bai2 {
    @FunctionalInterface
    interface PasswordValidator {
        boolean isValid(String password);
    }

//    PasswordValidator validator = new PasswordValidator() {
//        @Override
//        public boolean isValid(String password) {
//            return password.length() >= 8;
//        }
//    }

    public static void main(String[] args) {
        PasswordValidator validator = password -> password.length() >= 8;

        System.out.println(validator.isValid("12345678"));
        System.out.println(validator.isValid("1234"));
    }
}
