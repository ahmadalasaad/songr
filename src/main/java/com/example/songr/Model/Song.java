package com.example.songr.Model;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private int length;
    private int trackNumber;
    @ManyToOne
    public Album songsAlbum;


    public Song(String title, int length, int trackNumber,Album songsAlbum) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
        this.songsAlbum=songsAlbum;
    }
    public Song(){}
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }


}
