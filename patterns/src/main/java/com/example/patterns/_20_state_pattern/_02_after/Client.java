package com.example.patterns._20_state_pattern._02_after;

public class Client {

    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse();
        Student student = new Student("whiteShip");

        onlineCourse.addStudent(student);
        onlineCourse.addReview("hello", student);


        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getReviews());
        System.out.println(onlineCourse.getStudents());


    }
}
