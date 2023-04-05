package com.example.patterns._16_iterator_pattern._02_after;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.Stack;
import lombok.Getter;

@Getter
public class StackBoard {

    private final Stack<Post> posts = new Stack<>();

    public void addPost(String title) {
        posts.add(new Post(title, LocalDateTime.now()));
    }

    public Iterator<Post> getRecentPostIterator() {
        return new RecentPostIterator(posts);
    }
}
