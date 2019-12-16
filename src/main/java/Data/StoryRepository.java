package Data;

import java.util.List;

public interface StoryRepository {

    public void save(Story story);

    List<Story> findAll();
}
