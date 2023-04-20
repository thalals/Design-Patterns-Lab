package com.example.patterns._20_state_pattern._02_after.concreate_state;

import com.example.patterns._20_state_pattern._02_after.OnlineCourse;
import com.example.patterns._20_state_pattern._02_after.State;
import com.example.patterns._20_state_pattern._02_after.Student;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Published implements State {

    private OnlineCourse onlineCourse;

    @Override
    public void addReview(String review, Student student) {
        this.onlineCourse.getReviews().add(review);
    }


    @Override
    public void addStudent(Student student) {
        this.onlineCourse.getStudents().add(student);
    }
}
