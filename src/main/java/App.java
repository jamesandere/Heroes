import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {

  public static void main(String[] args) {
    staticFileLocation("/public");

      ProcessBuilder process = new ProcessBuilder();
      Integer port;
      if (process.environment().get("PORT") != null) {
          port = Integer.parseInt(process.environment().get("PORT"));
      } else {
          port = 4567;
      }

      setPort(port);

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
          String heroname= request.queryParams("name");
          String heroage= request.queryParams("age");
          String heropower= request.queryParams("power");
          String heroweak= request.queryParams("weak");
          model.put("heroname", heroname);
          model.put("heroage", heroage);
          model.put("heropower", heropower);
          model.put("heroweak", heroweak);
          model.put("template", "templates/show-hero.vtl");
          return new ModelAndView(model, layout);
      }, new VelocityTemplateEngine());

    get("/squad-form", (request, response) -> {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("template", "templates/squad-form.vtl");
        return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

//

      post("/show-squad", (request, response) -> {
          Map<String, Object> model = new HashMap<String, Object>();
          String squadname= request.queryParams("name2");
          String squadsize= request.queryParams("size");
          String squadmission= request.queryParams("mission");
          model.put("squadname", squadname);
          model.put("squadsize", squadsize);
          model.put("squadmission", squadmission);
          model.put("template", "templates/show-squad.vtl");
          return new ModelAndView(model, layout);
      }, new VelocityTemplateEngine());
  }
}
