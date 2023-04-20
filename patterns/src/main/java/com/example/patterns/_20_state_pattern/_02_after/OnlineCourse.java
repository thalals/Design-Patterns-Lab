package com.example.patterns._20_state_pattern._02_after;

import com.example.patterns._20_state_pattern._02_after.concreate_state.Draft;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class OnlineCourse {

    private State state = new Draft(this);
    private List<Student> students = new ArrayList<>();
    private List<String> reviews = new ArrayList<>();

    public void addStudent(Student student) {
        state.addStudent(student);
    }

    public void addReview(String review, Student student) {
        state.addReview(review, student);
    }

    public void changeState(State state) {
        this.state = state;
    }
}
