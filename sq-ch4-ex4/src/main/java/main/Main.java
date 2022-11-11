package main;

import model.Comment;
import proxies.CommentNotificationProxy;
import proxies.EmailCommentNotificationProxy;
import repositories.CommentRepository;
import repositories.DBCommentRepository;
import services.CommentService;

public class Main {
    public static void main(String[] args) {

        CommentRepository commentRepository = new DBCommentRepository();
        CommentNotificationProxy commentNotificationProxy = new EmailCommentNotificationProxy();

        CommentService commentService = new CommentService(commentNotificationProxy, commentRepository);

        Comment comment = new Comment();
        comment.setAuthor("Kamal");
        comment.setText("Testing Massage");

        commentService.publishComment(comment);
    }
}
