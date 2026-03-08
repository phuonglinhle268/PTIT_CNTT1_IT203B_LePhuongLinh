package PTIT_CNTT1_IT203B_Session1;

public class User {
    int age;

    public void setAge(int age){
        if (age < 0){
            throw new IllegalArgumentException("Tuổi không thể âm");
        }
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}


