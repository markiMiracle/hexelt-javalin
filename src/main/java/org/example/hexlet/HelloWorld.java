package org.example.hexlet;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;
import org.example.hexlet.dto.courses.CoursesPage;
import org.example.hexlet.model.Course;

import java.util.ArrayList;

import static io.javalin.rendering.template.TemplateUtil.model;

public class HelloWorld {
    public static void main(String[] args) {
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
            config.fileRenderer(new JavalinJte());
        });

        app.get("/courses", ctx -> {
            var course1 = new Course("Java", "Is good!");
            var courses = new ArrayList<Course>();
            courses.add(course1);
            var header = "Курсы по программированию";
            var page = new CoursesPage(courses, header);
            ctx.render("index.jte", model("page", page));
        });

        app.start(7070);
    }
}