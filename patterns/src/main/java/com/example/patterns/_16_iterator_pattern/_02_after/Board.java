package com.example.patterns._16_iterator_pattern._02_after;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lombok.Getter;

@Getter
public class Board {

    private final List<Post> posts = new ArrayList<>();

    public void addPost(String title) {
        posts.add(new Post(title, LocalDateTime.now()));
    }

    public Iterator<Post> getDefaultIterator() {
        return posts.iterator();
    }

    public Iterator<Post> getRecentPostIterator() {
        return new RecentPostIterator(posts);
    }
}
