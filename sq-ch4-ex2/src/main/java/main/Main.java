package main;

import Model.Comment;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(ProjectConfig.class);

        Comment comment = new Comment();
        comment.setMessage("anyMassage");
        comment.setAuthor("kamal");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
