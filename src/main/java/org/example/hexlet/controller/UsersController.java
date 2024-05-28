package org.example.hexlet.controller;

import io.javalin.http.Context;
import io.javalin.validation.ValidationException;
import org.example.hexlet.Data;
import org.example.hexlet.NamedRoutes;
import org.example.hexlet.dto.BuildUserPage;
import org.example.hexlet.dto.UsersPage;
import org.example.hexlet.model.User;
import org.example.hexlet.repository.UserRepository;

import static io.javalin.rendering.template.TemplateUtil.model;

public class UsersController {

    public static void root(Context ctx) {
        ctx.render("layout/page.jte");
    }

    public static void index(Context ctx) {
        var visited = Boolean.valueOf(ctx.cookie("visited"));
        var users = UserRepository.getEntities();
        var page = new UsersPage(visited, users);
        ctx.render("index.jte", model("page", page));
        ctx.cookie("visited", String.valueOf(true));
    }

    public static void build(Context ctx) {
        var page = new BuildUserPage();
        ctx.render("users/build.jte", model("page", page));
    }

    public static void create(Context ctx) {
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
            ctx.redirect(NamedRoutes.usersPath());
        } catch (ValidationException e) {
            var page = new BuildUserPage(id, firstName, lastName, email, e.getErrors());
            ctx.render("users/build.jte", model("page", page));
            ctx.status(422);
        }
    }

}
