import com.google.gson.Gson;

import static spark.Spark.*;

public class mainRouter {
        public static void main(String[] args) {


            port(8080);

            options("/*",
                    (request, response) -> {

                        String accessControlRequestHeaders = request
                                .headers("Access-Control-Request-Headers");
                        if (accessControlRequestHeaders != null) {
                            response.header("Access-Control-Allow-Headers",
                                    accessControlRequestHeaders);
                        }

                        String accessControlRequestMethod = request
                                .headers("Access-Control-Request-Method");
                        if (accessControlRequestMethod != null) {
                            response.header("Access-Control-Allow-Methods",
                                    accessControlRequestMethod);
                        }

                        return "OK";
                    });



            get("/hello", (req, res) -> "Hello World");

            post("/hello", (request, response) -> {
                response.type("application/json");
                Gson gson = new Gson();
                return gson.toJson(request.body());
            });


        }
}
