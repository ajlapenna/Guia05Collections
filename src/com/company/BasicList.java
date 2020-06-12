package com.company;

import java.util.Stack;

public class BasicList implements SongPlayer {
    private String listName;
    private Stack<Song> myList;

    @Override
    public void playSong() {

    }

    @Override
    public void addSong(Song s) {

    }

    @Override
    public void deleteSong() {
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
    }

    @Override
    public void changeSong() {
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
    }

    @Override
    public void showPlaylist() {

    }

    @Override
    public String toString() {
        return "BasicList{" +
                "listName='" + listName + '\'' +
                ", myList=" + myList +
                '}';
    }
}
