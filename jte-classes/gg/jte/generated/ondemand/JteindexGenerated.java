package gg.jte.generated.ondemand;
import org.example.hexlet.dto.UsersPage;
public final class JteindexGenerated {
	public static final String JTE_NAME = "index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,3,3,6,6,7,7,7,7,7,7,7,7,7,8,8,10,10,11,11,13,13,13,13,14,14,14,14,14,14,14,14,14,17,17,18,18,20,20,20,20,20,1,1,1,1};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UsersPage page) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
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
