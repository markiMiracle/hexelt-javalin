package gg.jte.generated.ondemand.users;
import org.example.hexlet.NamedRoutes;
import org.example.hexlet.dto.BuildUserPage;
public final class JtebuildGenerated {
	public static final String JTE_NAME = "users/build.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,5,5,8,8,10,10,12,12,13,13,16,16,16,19,19,20,20,22,22,28,28,28,28,28,28,28,28,28,35,35,35,35,35,35,35,35,35,42,42,42,42,42,42,42,42,42,56,56,56,56,56,56,56,56,56,76,76,76,76,76,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, BuildUserPage page) {
		jteOutput.writeContent("\n\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n\n    ");
				if (page.getErrors() != null) {
					jteOutput.writeContent("\n        <ul>\n            ");
					for (var validator: page.getErrors().values()) {
						jteOutput.writeContent("\n                ");
						for (var error: validator) {
							jteOutput.writeContent("\n                    <li>\n                        <div class=\"alert alert-primary\" role=\"alert\">\n                            ");
							jteOutput.setContext("div", null);
							jteOutput.writeUserContent(error.getMessage());
							jteOutput.writeContent("\n                        </div>\n                    </li>\n                ");
						}
						jteOutput.writeContent("\n            ");
					}
					jteOutput.writeContent("\n        </ul>\n    ");
				}
				jteOutput.writeContent("\n\n\n    <form class=\"row g-3 needs-validation\" action=\"/users\" method=\"post\">\n        <div class=\"col-md-4\">\n            <label for=\"validationCustom01\" class=\"form-label\">First name</label>\n            <input type=\"text\" class=\"form-control\" id=\"validationCustom01\"");
				var __jte_html_attribute_0 = page.getFirstName();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_0);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" required name=\"firstName\">\n            <div class=\"valid-feedback\">\n                Looks good!\n            </div>\n        </div>\n        <div class=\"col-md-4\">\n            <label for=\"validationCustom02\" class=\"form-label\">Last name</label>\n            <input type=\"text\" class=\"form-control\" id=\"validationCustom02\"");
				var __jte_html_attribute_1 = page.getLastName();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_1);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" required name=\"lastName\">\n            <div class=\"valid-feedback\">\n                Looks good!\n            </div>\n        </div>\n        <div class=\"col-md-4\">\n            <label for=\"validationCustom02\" class=\"form-label\">Email</label>\n            <input type=\"email\" class=\"form-control\" id=\"validationCustom02\"");
				var __jte_html_attribute_2 = page.getEmail();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_2);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" required name=\"email\">\n            <div class=\"valid-feedback\">\n                Looks good!\n            </div>\n        </div>\n        <div class=\"col-md-4\">\n            <label for=\"validationCustom02\" class=\"form-label\">Password</label>\n            <input type=\"password\" class=\"form-control\" id=\"validationCustom02\" required name=\"password\">\n            <div class=\"valid-feedback\">\n                Looks good!\n            </div>\n        </div>\n        <div class=\"col-md-4\">\n            <label for=\"validationCustom02\" class=\"form-label\">Confirm Password</label>\n            <input type=\"password\" class=\"form-control\" id=\"validationCustom02\"");
				var __jte_html_attribute_3 = page.getEmail();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_3)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_3);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" required name=\"passwordConfirmation\">\n            <div class=\"valid-feedback\">\n                Looks good!\n            </div>\n        </div>\n        <div class=\"col-12\">\n            <div class=\"form-check\">\n                <input class=\"form-check-input\" type=\"checkbox\" value=\"\" id=\"invalidCheck\" required>\n                <label class=\"form-check-label\" for=\"invalidCheck\">\n                    Agree to terms and conditions\n                </label>\n                <div class=\"invalid-feedback\">\n                    You must agree before submitting.\n                </div>\n            </div>\n        </div>\n        <div class=\"col-12\">\n            <button class=\"btn btn-primary\" type=\"submit\">Submit form</button>\n        </div>\n    </form>\n");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		BuildUserPage page = (BuildUserPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
