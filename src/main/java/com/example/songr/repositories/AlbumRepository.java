package com.example.songr.repositories;

import com.example.songr.Model.Album;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlbumRepository extends CrudRepository<Album,Integer> {
    public List<Album> findByTitle(String album);

}
