package gg.jte.generated.ondemand.layout;
import gg.jte.Content;
public final class JtepageGenerated {
	public static final String JTE_NAME = "layout/page.jte";
	public static final int[] JTE_LINE_INFO = {1,1,2,2,2,31,31,31,31,36,36,36,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Content content) {
		jteOutput.writeContent("\n<html lang=\"en\">\n<head>\n    <meta charset=\"utf-8\" />\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css\"\n          rel=\"stylesheet\"\n          integrity=\"sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We\"\n          crossorigin=\"anonymous\">\n    <title>Hello Hexlet!</title>\n</head>\n<body>\n<nav class=\"navbar\">\n    <div class=\"logo\">\n        <p>Miracle</p>\n    </div>\n    <div class=\"menu\">\n        <a href=\"/\">Главная</a>\n    </div>\n    <div class=\"menu\">\n        <a href=\"/users\">Пользователи</a>\n    </div>\n    <div class=\"menu\">\n        <a href=\"/users/build\">Регистрация</a>\n    </div>\n</nav>\n<div class=\"mx-auto p-4 py-md-5\">\n    <main>\n        ");
		jteOutput.setContext("main", null);
		jteOutput.writeUserContent(content);
		jteOutput.writeContent("\n    </main>\n</div>\n</body>\n</html>\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Content content = (Content)params.get("content");
		render(jteOutput, jteHtmlInterceptor, content);
	}
}
