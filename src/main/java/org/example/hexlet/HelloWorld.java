package org.example.hexlet;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;
import io.javalin.validation.ValidationException;
import org.example.hexlet.dto.BuildUserPage;
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
            ctx.render("layout/page.jte");
        });

        app.get("/users", ctx -> {
            var page = new UsersPage(USERS);
            ctx.render("index.jte", model("page", page));
        });

        app.get("/users/build", ctx -> {
            var page = new BuildUserPage();
            ctx.render("users/build.jte", model("page", page));
        });

        app.post("/users", ctx -> {
            var id = Data.getNextId();
            var firstName = ctx.formParam("firstName");
            var lastName = ctx.formParam("lastName");
            var email = ctx.formParam("email").trim().toLowerCase();
            try {
                var passwordConfirmation = ctx.formParam("passwordConfirmation");
                var password = ctx.formParamAsClass("password", String.class)
                        .check(value -> value.equals(passwordConfirmation), "Пароли не совпадают")
                        .get();
                User user = new User(id, firstName, lastName, email, password);
                UserRepository.save(user);
                ctx.redirect("/users");
            } catch (ValidationException e) {
                var page = new BuildUserPage(id, firstName, lastName, email, e.getErrors());
                ctx.render("users/build.jte", model("page", page));
            }
        });

        app.start(7070);
    }
}