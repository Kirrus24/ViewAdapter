package com.example.laboratornaya_3;

public class Note {
    public int id;
    public String title;

    public Note(
            int id,
            String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
