package com.example.patterns._20_state_pattern._01_before;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class OnlineCourse {

    private State state = State.DRAFT;

    private List<String> reviews = new ArrayList<>();

    private List<Student> students = new ArrayList<>();


    public void addReview(String review, Student student) {
        if (this.state.isPublished()) {
            reviews.add(review);
        }
        if (this.state.isPrivate() && this.students.contains(student)) {
            reviews.add(review);
        }

        throw new UnsupportedOperationException("드래프트 상태에서는 리뷰를 작성할 수 없습니다.");
    }

    public void addStudent(Student student) {
        if (this.state.isDraft() || this.state.isPublished()) {
            students.add(student);
        }
        else if (this.state.isPrivate() && availableTo(student)) {
            students.add(student);
        }
        else{ throw new UnsupportedOperationException("학생을 해당 수업에 추가할 수 없습니다.");}

        if (students.size() > 1) {
            this.state = State.PRIVATE;
        }
    }

    public void changeState(State newState) {
        this.state = newState;
    }

    private boolean availableTo(Student student) {
        return student.getOnlineCourses().contains(this);
    }
}
