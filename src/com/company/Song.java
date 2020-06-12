package com.company;

public class Song {
    private String title;
    private int duration;
    private Genres genre;
    private Album album;
    private Artist featuredArtist;

    public Song(String title, int duration, Genres genre, Album album, Artist featuredArtist) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.album = album;
        this.featuredArtist = featuredArtist;
    }
}
