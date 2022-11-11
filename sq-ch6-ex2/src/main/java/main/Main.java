package main;

import config.ProjectConfig;
import model.Comment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Comment comment = new Comment();
        comment.setText("blabla");
        comment.setAuthor("kamal");

        CommentService service = context.getBean(CommentService.class);
        service.publishComment(comment);
    }
}
