package com.example.patterns._20_state_pattern._02_after.concreate_state;

import com.example.patterns._20_state_pattern._02_after.OnlineCourse;
import com.example.patterns._20_state_pattern._02_after.State;
import com.example.patterns._20_state_pattern._02_after.Student;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Draft implements State {

    private OnlineCourse onlineCourse;

    @Override
    public void addReview(String review, Student student) {
        throw new UnsupportedOperationException("드래프트 상태에서는 리뷰를 남길 수 없습니다.");
    }

    @Override
    public void addStudent(Student student) {
        this.onlineCourse.getStudents().add(student);

        if (this.onlineCourse.getStudents().size() > 1) {
            this.onlineCourse.changeState(new Private(this.onlineCourse));
        }
    }
}
