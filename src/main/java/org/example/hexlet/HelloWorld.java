package org.example.hexlet;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;
import org.example.hexlet.dto.UsersPage;
import org.example.hexlet.model.User;
import org.example.hexlet.repository.UserRepository;

import java.util.List;

import static io.javalin.rendering.template.TemplateUtil.model;

public class HelloWorld {
    private static final List<User> USERS = UserRepository.getEntities();

    public static void main(String[] args) {


        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
            config.fileRenderer(new JavalinJte());
        });

        app.get("/", ctx -> {
            ctx.render("index.jte");
        });

        app.get("/users", ctx -> {
            var page = new UsersPage(USERS);
            ctx.render("layout/users.jte", model("page", page));
        });

        app.get("/users/build", ctx -> {
            ctx.render("users/build.jte");
        });

        app.post("/users", ctx -> {
            var id = Data.getNextId();
            var firstName = ctx.formParam("first_name");
            var lastName = ctx.formParam("last_name");
            var email = ctx.formParam("email");
            User user = new User(id, firstName, lastName, email);
            UserRepository.save(user);
            ctx.redirect("/users");
        });

        app.start(7070);
    }
}