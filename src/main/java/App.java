import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {

  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/hero-form", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/hero-form.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/show-hero", (request, response) -> {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("name", request.queryParams("name"));
        model.put("age", request.queryParams("age"));
        model.put("power", request.queryParams("power"));
        model.put("weak", request.queryParams("weak"));
        model.put("template", "templates/show-hero.vtl");
        return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
