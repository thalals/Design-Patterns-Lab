package com.example.patterns._16_iterator_pattern._02_after;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Post {

    private String title;
    private LocalDateTime createdDateTime;

}
