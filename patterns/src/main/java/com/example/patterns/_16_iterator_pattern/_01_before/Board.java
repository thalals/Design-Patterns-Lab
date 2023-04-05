package com.example.patterns._16_iterator_pattern._01_before;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class Board {

    private final List<Post> posts = new ArrayList<>();

    public void addPost(String title) {
        posts.add(new Post(title, LocalDateTime.now()));
    }
}
