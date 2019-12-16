package Data;

public class Story {

    private String content;

    public Story(String content) {

        this.content = content;
    }

    @Override
    public String toString() {
        return "Story{" +
                "content='" + content + '\'' +
                '}';
    }
}
