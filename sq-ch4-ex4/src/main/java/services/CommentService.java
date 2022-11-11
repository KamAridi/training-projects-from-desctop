package services;

import model.Comment;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;

public class CommentService {
    private CommentNotificationProxy commentNotificationProxy;
    private CommentRepository commentRepository;

    public CommentService(CommentNotificationProxy commentNotificationProxy,
                          CommentRepository commentRepository){
        this.commentNotificationProxy = commentNotificationProxy;
        this.commentRepository = commentRepository;
    }
    public void publishComment(Comment comment){
        commentNotificationProxy.sendComment(comment);
        commentRepository.storage(comment);
    }
}
