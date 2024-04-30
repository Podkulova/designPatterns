package src.structural.p16_proxy;

import java.time.LocalDateTime;

public class Message {
    private String chanelName;
    private LocalDateTime postDate;
    private String author;
    private String text;

    public Message(String chanelName, String author, String text) {
        this.chanelName = chanelName;
        this.postDate = LocalDateTime.now();
        this.author = author;
        this.text = text;
    }

    public String getChanelName() {
        return chanelName;
    }

    public void setChanelName(String chanelName) {
        this.chanelName = chanelName;
    }

    public LocalDateTime getPostDate() {
        return postDate;
    }

    public void setPostDate(LocalDateTime postDate) {
        this.postDate = postDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "chanelName='" + chanelName + '\'' +
                ", postDate=" + postDate +
                ", author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
