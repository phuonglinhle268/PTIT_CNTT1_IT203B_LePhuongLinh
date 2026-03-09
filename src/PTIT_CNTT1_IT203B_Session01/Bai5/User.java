package PTIT_CNTT1_IT203B_Session01.Bai5;

public class User {
    int age;

    public void setAge(int age) throws InvalidAgeException{
        if (age < 0){
            throw new InvalidAgeException("Tuổi không thể âm");
        }
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
