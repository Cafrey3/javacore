package hw2.task4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user = new User(1,
                "Vasya",
                "Pupkin",
                "pupkin@gmail.com",
                20, Gender.MALE,
                new ArrayList<>(),
                "BMW", 2010, 500);
        user.getSkills().add(new Skills("java",10));
        user.getSkills().add(new Skills("c++",10));
        user.getSkills().add(new Skills("js",10));
        System.out.println(user);
    }
}