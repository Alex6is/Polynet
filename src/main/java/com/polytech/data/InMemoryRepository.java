package com.polytech.data;

import java.util.ArrayList;
import java.util.List;

public class InMemoryRepository implements StoryRepository {

    List<Story> database = new ArrayList<>();

    public InMemoryRepository() {
    }

    public void save(Story story) {
        database.add(story);
    }

    public List<Story> findAll(){
        return database;
    }


}
