package com.example.songr.controlleres;

import com.example.songr.Model.Album;
import com.example.songr.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;
    @PostMapping("/albums")public RedirectView addAlbum(String title, String artist, int songCount, int length, String imageUrl) {
        Album a = new Album(title, artist, songCount, length, imageUrl);
        albumRepository.save(a);
        return new RedirectView("/albums");
    }

        @GetMapping("/albums")
    public String albums(Model model){
            List<Album> albumList= (List<Album>) albumRepository.findAll();
            model.addAttribute("albumList",albumList);
        return "albums";
    }

}
