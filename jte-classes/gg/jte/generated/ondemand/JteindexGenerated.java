package gg.jte.generated.ondemand;
import org.example.hexlet.dto.UsersPage;
public final class JteindexGenerated {
	public static final String JTE_NAME = "index.jte";
	public static final int[] JTE_LINE_INFO = {1,1,2,2,2,4,4,7,7,9,9,11,11,12,12,14,14,14,14,14,14,14,14,14,16,16,17,17,19,19,19,19,19,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UsersPage page) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <h1><a href=\"/users\">Пользователи:</a>></h1>\n");
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
				jteOutput.writeContent("\n\n");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		UsersPage page = (UsersPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
