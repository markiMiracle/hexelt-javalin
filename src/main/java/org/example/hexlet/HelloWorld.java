package org.example.hexlet;

import io.javalin.Javalin;

public class HelloWorld {
    public static void main(String[] args) {
        // Создаем приложение
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
        });
        // Описываем, что загрузится по адресу /
        app.get("/users", ctx -> ctx.result("GET /users"));
        app.post("/users", ctx -> ctx.result("Post /users"));
        app.get("/hello", ctx -> {
            var hello = ctx.queryParamAsClass("hello", String.class).getOrDefault("World");
            ctx.result("Hello, " + hello + "!");
        });
        app.get("/users/{id}/posts/{post-id}", ctx -> {
            ctx.result("User-id = " + ctx.pathParam("id") + "\n" + "Post-id = "
            + ctx.pathParam("post-id"));
        });
        app.start(7070); // Стартуем веб-сервер
    }
}