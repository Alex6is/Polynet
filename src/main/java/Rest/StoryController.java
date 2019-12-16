package Rest;

import Business.PublicationService;
import Data.Story;

public class StoryController {

    PublicationService publicationService;

    public StoryController(PublicationService publicationService){
        this.publicationService = publicationService;
    }

    public void share(String content){
        publicationService.share(new Story(content));
    }
}
