package repositories;

import model.Comment;

public class DBCommentRepository implements CommentRepository {
    public void storage(Comment comment) {
        System.out.println("Storing: " + comment.getText());
    }
}
