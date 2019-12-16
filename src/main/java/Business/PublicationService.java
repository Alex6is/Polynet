package Business;

import Data.Story;
import Data.StoryRepository;

import java.util.List;

public class PublicationService {
    private StoryRepository storyRepository;

    public PublicationService(StoryRepository storyRepository){
        this.storyRepository = storyRepository;
    }

    public void share(Story story){
        //business logic
        storyRepository.save(story);
    }

    public List<Story> fetchAll(){
        return storyRepository.findAll();
    }
}
