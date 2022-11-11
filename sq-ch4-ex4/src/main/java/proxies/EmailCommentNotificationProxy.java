package proxies;

import model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    public void sendComment(Comment comment) {
        System.out.println("Sending: " + comment.getText());
    }
}
