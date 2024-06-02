package gg.jte.generated.ondemand.users;
import org.example.hexlet.dto.UsersPage;
public final class JteindexGenerated {
	public static final String JTE_NAME = "users/index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,3,3,6,6,8,8,10,10,11,11,11,11,11,11,11,11,11,12,12,14,14,15,15,17,17,17,17,18,18,18,18,18,18,18,18,18,21,21,22,22,24,24,24,24,24,1,1,1,1};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UsersPage page) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n\n    ");
				if (!page.getVisited()) {
					jteOutput.writeContent("\n        Это сообщение показывается только один раз. Если вы хотите увидеть его снова, сотрите куки\n    ");
				}
				jteOutput.writeContent("\n    <h1><a");
				var __jte_html_attribute_0 = org.example.hexlet.NamedRoutes.usersPath();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
					jteOutput.writeContent(" href=\"");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(__jte_html_attribute_0);
					jteOutput.setContext("a", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">Пользователи:</a></h1>\n");
				if (page.getUsers().isEmpty()) {
					jteOutput.writeContent("\n    <p>Пока не добавлено ни одного пользователя</p>\n");
				} else {
					jteOutput.writeContent("\n    ");
					for (var user : page.getUsers()) {
						jteOutput.writeContent("\n        <ul>\n            <a href=\"users/");
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(user.getId());
						jteOutput.setContext("a", null);
						jteOutput.writeContent("\">\n                <li>");
						jteOutput.setContext("li", null);
						jteOutput.writeUserContent(user.getId());
						jteOutput.writeContent(" ");
						jteOutput.setContext("li", null);
						jteOutput.writeUserContent(user.getFirstName());
						jteOutput.writeContent(" ");
						jteOutput.setContext("li", null);
						jteOutput.writeUserContent(user.getLastName());
						jteOutput.writeContent("</li>\n            </a>\n        </ul>\n    ");
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
