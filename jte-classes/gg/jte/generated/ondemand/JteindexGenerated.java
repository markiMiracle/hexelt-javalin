package gg.jte.generated.ondemand;
import gg.jte.Content;
public final class JteindexGenerated {
	public static final String JTE_NAME = "index.jte";
	public static final int[] JTE_LINE_INFO = {1,1,2,2,2,31,31,31,31,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Content content) {
		jteOutput.writeContent("\n<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>my site</title>\n</head>\n<body>\n<div class=\"navbar\">\n    <div class=\"logo\">\n        <div>Miracle</div>\n    </div>\n    <div class=\"menu\">\n        <a href=\"/\">Главная</a>\n    </div>\n    <div class=\"menu\">\n        <a href=\"/users\">Users</a>\n    </div>\n    <div class=\"menu\">\n        <a href=\"/users/build\">Регистрация</a>\n    </div>\n</div>\n<div class=\"content\">\n    <h1>добро пожаловать на мой сайт)</h1>\n</div>\n\n</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Content content = (Content)params.get("content");
		render(jteOutput, jteHtmlInterceptor, content);
	}
}
