package com.goit.MVCTest.Entity;

import lombok.Data;


@Data
public class Note {
    public Note(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    private Long id;
    private String title;
    private String content;
}
