package com.example.patterns._20_state_pattern._02_after;

public interface State {

    void addReview(String review, Student student);

    void addStudent(Student student);
}
