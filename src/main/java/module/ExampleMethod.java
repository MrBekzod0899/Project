package module;

import module.enums.Gender;
import module.enums.Religion;

public class ExampleMethod {
    public static void main(String[] args) {


        ExampleMethod exampleMethod=new ExampleMethod();
        User user=new User();
        user.setName("Jack");
        user.setAge(21);
        user.setGender(Gender.Male);
        user.religion= Religion.Islam;

        exampleMethod.getInfoOfMe(user);
      String firstAndLastLetter=exampleMethod.getChars(user);
        System.out.println(firstAndLastLetter);

    }
    public void getInfoOfMe(User user){
        System.out.println("User: " + user.getName());
        System.out.println("age: "+ user.getAge());
        System.out.println("Gender: " + user.getGender());
        System.out.println("religion:" + user.religion);
    }

     public String getChars(User user){
        int length=user.getName().length();
            return (user.getName().substring(0,1)+" "+ user.getName().substring(length-1,length));
     }



}
