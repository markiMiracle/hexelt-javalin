package gg.jte.generated.ondemand.users;
public final class JtebuildGenerated {
	public static final String JTE_NAME = "users/build.jte";
	public static final int[] JTE_LINE_INFO = {26,26,26,26,26,26,26,26,26,26,26};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("\n\n<!DOCTYPE html>\n<html lang=\"ru\">\n<head>\n    <meta charset=\"UTF-8\" />\n    <title>Регистрация</title>\n</head>\n<body>\n<form action=\"/users\" method=\"post\">\n<div>\n    <label>Имя</label>\n    <input type=\"text\" name=\"first_name\" />\n</div>\n<div>\n    <label>Фамилия</label>\n    <input type=\"text\" name=\"last_name\" />\n</div>\n<div>\n    <label>Почта</label>\n    <input type=\"email\" required name=\"email\" />\n</div>\n<input type=\"submit\" value=\"Зарегистрировать\"/>\n</form>\n</body>\n</html>\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
