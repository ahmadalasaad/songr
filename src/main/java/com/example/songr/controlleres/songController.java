package com.example.songr.controlleres;

import com.example.songr.Model.Album;
import com.example.songr.Model.Song;
import com.example.songr.repositories.AlbumRepository;
import com.example.songr.repositories.SongRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class songController {
    @Autowired
    AlbumRepository albumRepository;
    @Autowired
    SongRepository songRepository;
    @PostMapping("/song")
    public RedirectView addSong( String title, int length, int trackNumber,String album) {
        List <Album> songsAlbum = albumRepository.findByTitle(album);
        System.out.println(songsAlbum.get(0).getTitle());
        Song newSong = new Song(title, length, trackNumber,songsAlbum.get(0));
        songRepository.save(newSong);
        List<Song> songs = songRepository.findByTitleAndSongsAlbum(
                newSong.getTitle(),
                newSong.songsAlbum
        );
        return new RedirectView("/album/"+songsAlbum.get(0).getId());
    }
    @GetMapping("/song")
    public String getSongs(Model model){
        model.addAttribute("songsList",songRepository.findAll());
        return "songs";
    }
}
