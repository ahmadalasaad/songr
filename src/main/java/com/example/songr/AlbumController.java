package com.example.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlbumController {

    @GetMapping("/albums")
    public String albums(Model model){
        List<Album> albumList=new ArrayList<>();
        Album a=new Album("Anti","Rihanna",13,2616,"https://upload.wikimedia.org/wikipedia/en/3/32/Rihanna_-_Anti.png");
        Album b=new Album("25","Adele",8,2904,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTlO2LX-DDHFuivOpWjGUzPpPwZyfxkuLmhFy6tkPE&usqp=CAE&s");
        Album c=new Album("19","Adele",8,2716,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRB_rITr1JDVuvBCcHcD0V2p0nKDotGBYSqZwPQ3CM&usqp=CAE&s");

        albumList.add(a);
        albumList.add(b);
        albumList.add(c);
            model.addAttribute("albumList",albumList);


        return "albums";
    }

}
