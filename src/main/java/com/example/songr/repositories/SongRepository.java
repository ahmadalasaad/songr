package com.example.songr.repositories;

import com.example.songr.Model.Album;
import com.example.songr.Model.Song;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SongRepository extends CrudRepository<Song,Integer> {
    public List<Song> findByTitleAndSongsAlbum(String title, Album songsAlbum);

}
