package proxies;

import Model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
