package gg.jte.generated.ondemand.layout;
import org.example.hexlet.dto.UsersPage;
public final class JteusersGenerated {
	public static final String JTE_NAME = "layout/users.jte";
	public static final int[] JTE_LINE_INFO = {1,1,2,2,2,27,27,27,29,29,30,30,32,32,32,32,32,32,32,32,32,34,34,35,35,37,37,37,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UsersPage page) {
		jteOutput.writeContent("\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <title>my site</title>\n</head>\n<body>\n<div class=\"navbar\">\n    <div class=\"logo\">\n        <div>Miracle</div>\n    </div>\n    <div class=\"menu\">\n        <a href=\"/\">Главная</a>\n    </div>\n    <div class=\"menu\">\n        <a href=\"/users\">Users</a>\n    </div>\n    <div class=\"menu\">\n        <a href=\"/users/build\">Регистрация</a>\n    </div>\n</div>\n<div class=\"content\">\n    <h1>Пользователи:</h1>\n</div>\n");
		if (page.getUsers().isEmpty()) {
			jteOutput.writeContent("\n    <p>Пока не добавлено ни одного пользователя</p>\n");
		} else {
			jteOutput.writeContent("\n    ");
			for (var user : page.getUsers()) {
				jteOutput.writeContent("\n        <ul>\n            <li>");
				jteOutput.setContext("li", null);
				jteOutput.writeUserContent(user.getId());
				jteOutput.writeContent(" ");
				jteOutput.setContext("li", null);
				jteOutput.writeUserContent(user.getFirstName());
				jteOutput.writeContent(" ");
				jteOutput.setContext("li", null);
				jteOutput.writeUserContent(user.getLastName());
				jteOutput.writeContent("</li>\n        </ul>\n    ");
			}
			jteOutput.writeContent("\n");
		}
		jteOutput.writeContent("\n</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		UsersPage page = (UsersPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
