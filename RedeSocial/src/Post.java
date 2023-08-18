enum Status {
    DRAFT,
    PUBLISHED,
    DELETED;
}

public class Post {
    private int id;
    private String text;
    private Status status;

    Post(int id, String text, Status status) {
        this.id = id;
        this.text = text;
        this.status = status;
    }

    int getId() {
        return id;
    }

    String getText() {
        return text;
    }

    Status getStatus() {
        return status;
    }

    void setStatus(Status status) {
        this.status = status;
    }

    void publish() {
        if (getStatus() != Status.DRAFT) {
            throw new RuntimeException("Only drafts can be posted.");
        }
        
        if (getText().trim().equals("")) {
            throw new RuntimeException("A post can't be empty.");
        }
        
        status = Status.PUBLISHED;
    }
}
