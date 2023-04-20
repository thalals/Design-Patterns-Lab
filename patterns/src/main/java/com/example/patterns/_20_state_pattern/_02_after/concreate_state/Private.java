package com.example.patterns._20_state_pattern._02_after.concreate_state;

import com.example.patterns._20_state_pattern._02_after.OnlineCourse;
import com.example.patterns._20_state_pattern._02_after.State;
import com.example.patterns._20_state_pattern._02_after.Student;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Private implements State {

    private OnlineCourse onlineCourse;

    @Override
    public void addReview(String review, Student student) {
        if (this.onlineCourse.getStudents().contains(student)) {
            this.onlineCourse.getReviews().add(review);
        }

        throw new UnsupportedOperationException("프라이빗 코스를 수강하는 학생만 리뷰를 남길 수 있습니다.");
    }

    @Override
    public void addStudent(Student student) {
        if (student.isAvailable(onlineCourse)) {
            onlineCourse.getStudents().add(student);
        }
        throw new UnsupportedOperationException("프라이빗 코스를 수강할 수 없습니다.");
    }
}
