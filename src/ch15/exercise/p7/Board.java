package ch15.exercise.p7;

public class Board {
    private String title;
    private String content;
    private String BoardDao;

    public Board(String title, String content) {
        this.title = title;
        this.content = content;
        this.BoardDao = BoardDao;
    }

    public String getBoardDao() {
        return BoardDao;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
