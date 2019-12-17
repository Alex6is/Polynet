package com.polytech.Rest;

import com.polytech.Business.PublicationService;
import com.polytech.data.InMemoryRepository;
import com.polytech.data.Story;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class StoryController {

    private PublicationService publicationService;

    public StoryController(){

        InMemoryRepository storyRepository = new InMemoryRepository();
        this.publicationService = new PublicationService(storyRepository);
    }

    @PostMapping("/stories")
    @ResponseStatus(HttpStatus.CREATED)
    public void share(String content){
        publicationService.share(new Story(content));
    }

    @GetMapping("/stories")
    @ResponseStatus(HttpStatus.OK)
    public List<Story> fetchAll() {
        return publicationService.fetchAll();
    }

    @GetMapping("/hello/{name}")
    public String toto(@PathVariable("name") String name){
        return "hello " + name;
    }
}
